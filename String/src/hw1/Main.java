package hw1;


import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter sentence ");
	        String sentence = scanner.nextLine();

	        System.out.println("Longest word: " + Sentence.getLongestWord(sentence));

	        System.out.println("Number of letters in sentence: " + Sentence.getNumberOfLetter(sentence));

	        System.out.println("Second word in reverse format: " + Sentence.getSecondWordReverse(sentence));

	}

}
