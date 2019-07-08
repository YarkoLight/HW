package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

    static void programMenu() {

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Enter 1 for add Fruits ");
        System.out.println("Enter 2 for print Fruits");
        System.out.println("Enter 3 for save Fruits in .txt file ");
        System.out.println("Enter 4 for get Fruits from .txt file ");
        System.out.println("Enter 5 for sort Fruits by name");
        System.out.println("Enter 6 for see Fruits with one color");
        System.out.println("Enter 7 for serialize Fruit list in .xml file");
        System.out.println("Enter 8 for read Fruits from .xml file");
        System.out.println("-------------------------------------------------------------------");
    }

    public static void main(String[] args) throws IOException {
        FruitFactory fruitFactory = new FruitFactory();
        List<Fruit> fruits = new ArrayList<>();

        while (true) {
            programMenu();


            String choice = scanner.next();
            switch (choice) {
                case "1": {
                    fruitFactory.addFruits(fruits);
                    break;
                }
                case "2": {
                    for (Fruit f : fruits) {
                        System.out.println("All fruits in list:");
                        f.print();
                    }
                    break;
                }
                case "3": {
                    fruitFactory.saveListFruitsInFile(fruits);
                    System.out.println("Fruits save in .txt file");
                    break;
                }
                case "4": {
                    fruitFactory.getFruitFromFile(fruits);

                    for (Fruit f : fruits) {
                        f.print();
                    }
                    break;
                }
                case "5": {
                    fruitFactory.sortFruitByName(fruits);
                    System.out.println("Sorted fruits:");
                    for (Fruit f : fruits) {
                        f.print();
                    }
                    break;

                }
                case "6": {
                    System.out.println("Enter color which you want to see:");
                    String color = scanner.next();
                    List<Fruit> listFruitsByColor = fruitFactory.getFruitsByColor(fruits, color);
                    for (Fruit f : listFruitsByColor) {
                        f.print();
                    }
                    break;
                }
                case "7": {
                    fruitFactory.saveFruitInXmlFile(fruits);
                    System.out.println("Fruits save in .xml file:");
                    break;
                }
                case "8": {
                    try {
                        fruits = fruitFactory.readFruitFromXMLFile();
                        for (Fruit f : fruits) {
                            f.print();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                default: {
                    System.out.println("You enter incorrect number");
                }
            }

        }


}

}
