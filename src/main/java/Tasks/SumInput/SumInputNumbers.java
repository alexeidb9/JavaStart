package Tasks.SumInput;

import java.util.Scanner;

public class SumInputNumbers {
    public static void main(String[] args) {


        System.out.println("Provide how many numbers you want to input: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        System.out.println("Provide those numbers");
        int sum = 0;

        while (numbers > 0) {
            sum += sc.nextInt();
            numbers--;
            System.out.println("Input next number: ");
        }

//        Alternative solution:

//        for (; numbers > 0; numbers--) {
//            sum += sc.nextInt();
//            numbers--;
//            System.out.println("Input next number: ");
//        }

        System.out.println("The sum of all the number is : " + sum);
        sc.close();



    }
}
