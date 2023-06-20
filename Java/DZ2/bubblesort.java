package DZ2;

// import java.io.IOException;
import java.util.logging.*;
// import java.util.Arrays;

public class bubblesort {

    private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());

    public static void main (String[args]) {
    int[] arr = {76, 65, 83, 98, 12, 65, 27, 71};
    logger.setLevel(Level.INFO); // logging level
    logger.info("Задан массив: " + Arrays.toString(arr));
    ArraySort(arr);
    logger.info("Отсортированный массив: " + Arrays.toString(arr));
    }
    public static void ArraySort(int[]arr) {
        int n = arr.length;
        for (int i = 0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            logger.info("Результат на" + (i+1) + "-й итерации:" + Arrays.toString(arr));
        }
    }
}
