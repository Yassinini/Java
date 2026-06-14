package Sentence_splitter;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
    }
}