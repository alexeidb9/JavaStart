package Lessons.BasicArray;

public class ArrayExample {

    public static void main(String[] args) {

        //utworzenie tablicy, domyślnie wypełniona zerami(domyślna wartość int)
        int[] numbers = new int[5];
        //uzupełnienie wartości w poszczególnych komórkach tablicy
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 10;
        numbers[3] = 15;
        numbers[4] = 20;
        //podobnie wyświetlamy wprowadzone wartości
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
