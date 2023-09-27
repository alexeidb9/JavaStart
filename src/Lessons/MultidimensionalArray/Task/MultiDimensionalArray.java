package Lessons.MultidimensionalArray.Task;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        double[][] numbers = {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0}

        };

        double result = numbers[0][0] * numbers[1][1] * numbers[2][2] + numbers[0][2] * numbers[1][1] * numbers[2][0];
        System.out.println(result);
        result = (numbers[1][0] + numbers[1][1] + numbers[1][2]) * (numbers[0][1] + numbers[1][1] + numbers[2][1]);
        System.out.println(result);
        result = numbers[0][0] + numbers[0][1] + numbers[0][2] +
                numbers[1][2] + numbers[2][2] + numbers[2][1] +
                numbers[2][0] + numbers[1][0];


        System.out.println(result);

    }
}
