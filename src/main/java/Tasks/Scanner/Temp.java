package Tasks.Scanner;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        // do word zostanie przypisany znak nowej linii, który wciąż będzie w buforze
//        String word = sc.nextLine();
//        // po wczytaniu liczby nastąpi od razu wyświetlenie wartości
//        System.out.println(number);
//        System.out.println(word);
//
//        sc.close();


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //pobierz znak nowej linii \n
        sc.nextLine();
        //teraz możesz pobrać od użytkownika napis
        String word = sc.nextLine();
        //obie wartości zostają wyświetlone
        System.out.println(number);
        System.out.println(word);

        sc.close();
    }


}
