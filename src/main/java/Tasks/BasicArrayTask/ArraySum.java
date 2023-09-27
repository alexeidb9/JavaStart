package Tasks.BasicArrayTask;

public class ArraySum {


    public static void main(String[] args) {

        int[] tab1 = {1,3,4};
        int[] tab2 = {4,2,1};

        int sum = tab1[0] + tab2[0] + tab1[1] + tab2[1] + tab1[2] + tab2[2];
        System.out.println(sum);

        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.println(arrayUtils.sumArrays(tab1,tab2));


    }




}
