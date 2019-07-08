package Main;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class FruitFactory {
	
	public void addFruits(List<Fruit> fruits) {

        System.out.println("Enter 1 to add Fruit");
        System.out.println("Enter 2 to add Citrus");
        try {
            int choice = Main.scanner.nextInt();

            switch (choice) {
                case 1: {
                    Fruit fruit = new Fruit();
                    fruit.input();
                    fruits.add(fruit);
                    break;
                }
                case 2: {
                    Citrus citrus = new Citrus();
                    citrus.input();
                    fruits.add(citrus);
                    break;
                }
                default: {
                    System.err.println("Please enter 1 or 2");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Enter only digits");
        }
    }

    public void saveListFruitsInFile(List<Fruit> fruits) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("saveFruits.txt"));
        for (Fruit f : fruits) {
            f.saveObjectInFile(bufferedWriter);
        }
        bufferedWriter.close();
    }

    public List<Fruit> getFruitFromFile(List<Fruit> fruits) throws IOException {
        System.out.println("List fruits from file:");
        try (BufferedReader br = new BufferedReader(new FileReader("saveFruits.txt"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                Fruit fruit = new Fruit();
                Citrus citrus = new Citrus();
                String[] data = line.split(" ");
                if (data.length == 2) {
                    fruit.setFruitName(data[0]);
                    fruit.setFruitColor(data[1]);
                    fruits.add(fruit);
                }
                if (data.length == 3) {
                    citrus.setFruitName(data[0]);
                    citrus.setFruitColor(data[1]);
                    citrus.setVitaminCContent(Integer.parseInt(data[2]));
                    fruits.add(citrus);
                }
            }
        }
        return fruits;
    }

    public List<Fruit> getFruitsByColor(List<Fruit> fruits, String color) {

        List<Fruit> newFruitsList = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getFruitColor().equals(color)) {
                newFruitsList.add(fruit);
            }
        }
        return newFruitsList;
    }

    public List<Fruit> sortFruitByName(List<Fruit> fruits) {
        Collections.sort(fruits, new SortFruitByName());
        return fruits;
    }

    public void saveFruitInXmlFile(List<Fruit> fruits) throws IOException {
        FileOutputStream fos = new FileOutputStream("fruits.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(fruits);
        encoder.close();
        fos.close();
    }

    public List<Fruit> readFruitFromXMLFile() throws IOException {
        FileInputStream fis = new FileInputStream("fruits.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        List<Fruit> decodedFruits = (List<Fruit>) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedFruits;

    }


}
