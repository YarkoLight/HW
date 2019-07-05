package hw1;

public class Sentence {
	
	public static String getLongestWord(String sentence) {
        String[] sentenceArray = sentence.split("\\s+");

        String longestWord = sentenceArray[0];

        for (int i = 0; i < sentenceArray.length; i++) {
            if (longestWord.length() < sentenceArray[i].length()) {
                longestWord = sentenceArray[i];
            }
        }
        return longestWord;
    }

    public static int getNumberOfLetter(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                ++count;
            }
        }
        return count;
    }

    public static String getSecondWordReverse(String sentence) {
        String[] splitSentence = sentence.split("\\s+");

        StringBuffer stringBuffer = new StringBuffer(splitSentence[1]);

        stringBuffer.reverse();

        return stringBuffer.toString();
//        System.out.println("Second word in reverse format: " + stringBuffer);
}

}
