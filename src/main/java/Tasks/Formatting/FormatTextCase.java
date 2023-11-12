package Tasks.Formatting;

import java.util.Scanner;

public class FormatTextCase {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Write you message:");
    String text = input.nextLine();
    char firstCharacter = text.charAt(0);

    if(Character.isUpperCase(firstCharacter)) {
        text = text.toUpperCase();
    } else if (Character.isLowerCase(firstCharacter)) {
        text = text.toLowerCase();
    }
    System.out.println("Text after transfromation:");
    System.out.println(text);

    input.close();



}



}
