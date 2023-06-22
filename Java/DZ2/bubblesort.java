package DZ2;

// import java.lang.reflect.Array;
import java.io.IOException;
import java.util.logging.*;
// import java.util.Arrays;

public class bubblesort {

//     private static final Logger logger = Logger.getLogger(Array.class.getName());

//     /**
//      * 
//      */
//     public static void main (String[args]) {
//     int[] arr = {76, 65, 83, 98, 12, 65, 27, 71};
//     logger.setLevel(Level.INFO); // logging level
//     logger.info("Задан массив: " + Arrays.toString(arr));
//     ArraySort(arr);
//     logger.info("Отсортированный массив: " + Arrays.toString(arr));
//     }
//     public static void ArraySort(int[]arr) {
//         int n = arr.length;
//         for (int i = 0; i<n-1; i++) {
//             for (int j=0; j<n-i-1; j++){
//                 if (arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//             logger.info("Результат на" + (i+1) + "-й итерации:" + Arrays.toString(arr));
//         }
//     }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(bubblesort.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {2, 5, 1, -7, 3, 64, 76, 76, 64, -2, 0};
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}
