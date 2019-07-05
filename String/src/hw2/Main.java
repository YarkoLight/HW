package hw2;

public class Main {
	
	public static void main(String[] args) {

        String sentenceBefore = "    I        love  drive     a car    ";

        System.out.println("Before format: " + sentenceBefore);

        String sentenceAfter = sentenceBefore.trim().replaceAll("\\s{2,}", " ");
        System.out.println("After format: " + sentenceAfter);


}

}
