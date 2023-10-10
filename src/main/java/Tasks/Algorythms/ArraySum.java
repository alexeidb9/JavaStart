package Tasks.Algorythms;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 12, 15, 16};
        int sum = 0;

        for (int index = 0; index < array.length; index++) {
            if(array[index] % 2 == 0) {
                sum +=array[index];
            }
        }

        System.out.println(sum);
    }
}
