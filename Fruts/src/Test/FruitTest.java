package Test;


import main.Fruit;

import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class FruitTest {
	
	Fruit fruit;

    @Test
    public void testInput() {

        Fruit actual = new Fruit();
        Fruit expected = new Fruit("apple", "red");

        System.setIn(new StringBufferInputStream("apple red"));
        actual.input();

        assertEquals(expected, actual);
}

}
