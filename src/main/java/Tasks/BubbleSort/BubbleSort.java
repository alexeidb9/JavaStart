package Tasks.BubbleSort;

public class BubbleSort {

    public static void main(String[] args) {
        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] array) {

                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length - i; j++) {
                        if(array[j - 1] > array[j]) {
                            int temp = array[j];
                            array[j] = array[j - 1];
                            array[j - 1] = temp;
                        }
                    }
                }
            }
        };

        int[] tab = {1,2,4,3,6,7,8,9,4,2,3,1,3};
        printArray(tab);
        sorter.sort(tab);
        System.out.println("\n");
        printArray(tab);


    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


    private interface Sortable {
        void sort(int[] array);
    }


}
