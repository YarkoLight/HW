package Test;

import main.Citrus;
import main.Fruit;
import main.FruitFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class FruitFactoryTest {
	
	FruitFactory fruitFactory = new FruitFactory();

    @BeforeMethod
    public static List<Fruit> getFruits() {
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("apple", "red"));
        fruits.add(new Citrus("orange", "orange", 7));
        fruits.add(new Citrus("lemon", "yellow", 5));
        fruits.add(new Fruit("cherry", "red"));
        return fruits;
    }

    @DataProvider(name = "testColor")
    public static Object[][] testGetFruitsByColor() {
        List<Fruit> expectedRed = new ArrayList<>();
        expectedRed.add(new Fruit("apple", "red"));
        expectedRed.add(new Fruit("cherry", "red"));

        List<Fruit> expectedYellow = new ArrayList<>();
        expectedYellow.add(new Citrus("lemon", "yellow", 5));

        List<Fruit> expectedOrange = new ArrayList<>();
        expectedOrange.add(new Citrus("orange", "orange", 7));

        return new Object[][]{
                {expectedRed, "red"},
                {expectedYellow, "yellow"},
                {expectedOrange, "orange"}
        };
    }

    @Test(dataProvider = "testColor")
    public void testGetFruitsByColor(List<Fruit> expected, String color) {

        List<Fruit> fruits = getFruits();

        System.out.println("Color = " + color + ", Expected list of color" + expected);
        assertEquals(expected, fruitFactory.getFruitsByColor(fruits, color));
    }

    @Test
    public void testSortByName() {
        //Arrange
        List<Fruit> fruits = getFruits();
        List<Fruit> expected = new ArrayList<>();
        expected.add(new Fruit("apple", "red"));
        expected.add(new Fruit("cherry", "red"));
        expected.add(new Citrus("lemon", "yellow", 5));
        expected.add(new Citrus("orange", "orange", 7));
        //Actual
        List<Fruit> actual = fruitFactory.sortFruitByName(fruits);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void saveFruitInXmlFile() {
        // Arrange
        List<Fruit> expected = new ArrayList<>();
        expected.add(new Citrus("lemon", "yellow", 7));
        expected.add(new Fruit("apple", "red"));
        // Actual
        try {
            fruitFactory.saveFruitInXmlFile(expected);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        List<Fruit> actual = new ArrayList<>();
        try {
            actual.addAll(fruitFactory.readFruitFromXMLFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Assert
        assertEquals(actual, expected);
}
	
	

}
