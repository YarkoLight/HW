package Main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;

public class Citrus extends Fruit {
	
	private int vitaminCContent;

    public Citrus() {

    }

    public Citrus(String fruitName, String fruitColor, int vitaminCContent) {
        super(fruitName, fruitColor);
        this.vitaminCContent = vitaminCContent;
    }

    public int getVitaminCContent() {
        return vitaminCContent;
    }

    public void setVitaminCContent(int vitaminCContent) {
        this.vitaminCContent = vitaminCContent;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Input vitamin C content: ");
        try {
            vitaminCContent = Main.scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Enter only digits");
        }
    }

    @Override
    public void print() {
        System.out.println(this);

    }

    @Override
    public void saveObjectInFile(BufferedWriter bw) {
        String data = this.getFruitName() + " " + this.getFruitColor() + " " + getVitaminCContent() + "\n";
        try {
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Citrus citrus = (Citrus) o;
        return vitaminCContent == citrus.vitaminCContent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vitaminCContent);
    }

    @Override
    public String toString() {
        return super.toString() + " fruit Type: " + "Citrus [cVitaminContent = " + vitaminCContent + " gram" + "]";
}

}
