// Write a program to count the number of words in a string

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}