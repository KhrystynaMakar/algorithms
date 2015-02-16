package quickSorting;

/**
 * Created by kmak on 2/9/2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 0, 11, -1, 7, 5, 11};
        printArray(array);
        sortArray(array, 2, 4);
        printArray(array);

    }

    private static void sortArray(int[] array, int start, int end) {
//        if (start < end) return;

        int pivot = array[start];
        int i = start;
        int j = end;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
            }

            if (start < j) {
                sortArray(array, start, j);
            }
            if (i < end) {
                sortArray(array, i, end);
            }
        }
    }

    private static void printArray(int[] array) {
        for(int i: array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
