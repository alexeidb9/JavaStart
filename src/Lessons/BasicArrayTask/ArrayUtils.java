package Lessons.BasicArrayTask;

public class ArrayUtils {


    int sumArrays (int[] arr1, int[] arr2) {
        int result = 0;
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }else {
            for (int i = 0; i < arr1.length; i++) {

                result += arr1[i] + arr2[i];
            }
            return result;
        }

    }



}
