package Tasks.Formatting;

import java.util.Scanner;

public class FormatText {

    public static void main(String[] args) {


        String[] words = getWords();
        StringBuilder sb = createWordsFromLastLetters(words);

        System.out.println("New word " + sb.toString());

    }

    private static StringBuilder createWordsFromLastLetters(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int index = words[i].length()-1;
            sb.append(words[i].charAt(index));
        }
        return sb;
    }

    private static String[] getWords() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number of words you want to input:");
        int wordsNumber = sc.nextInt();
        sc.nextLine();
        String[] words = new String[wordsNumber];
        System.out.println("Input " + wordsNumber + " words");


        for (int i = 0; i < words.length; i++) {
            System.out.println("Provide next expression");
            words[i] = sc.nextLine();
        }
        sc.close();
        return words;
    }

}
