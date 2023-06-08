import java.util.Arrays;

public class main {
            public static void main(String[] args) {

            int [] arr = new int[]{1,1,3,2,4,3,1,3,3}; //1 2 4 5   3,3,3,3,3
            int val = 3;
            int count = 0;//4
            // int max = 0;
    
            for (int i = 0; i < arr.length; i++)
                if (arr[i] != val) {
                    arr[count++] = arr[i];
                }
    
            while (count < arr.length)
                arr[count++] = val;
            
            for (int i : arr) {
                System.out.println(i);
            }
            System.out.println(Arrays.toString(arr));
        }
}

                // int[] arr = new int[] { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 };
                //         int count = 0;
                //         int max = 0;
                    
                //         for (int i = 0; i < arr.length; i++) {
                //           if (arr[i] == 1) {
                //             count++;
                //           } else if (arr[i] == 0) {
                //             if (count > max)
                //               max = count;
                //             count = 0;
                //           }
                //         }
                    
                //         if (count > max)
                //           max = count;
                    
                //         System.out.println(max);


            //     int[] arr = new int[] {1,1,1,2,3,1,1};
            // int cnt=0;
            // int maxcnt=0;
            // int len=arr.length;
            // for  (int i = 0; i < len; i++)  {
            //     if (arr[i]==0 || i==len-1) {
            //         if (arr[i]==1) cnt++;
            //         if (cnt>maxcnt) {
            //             maxcnt = cnt;  
            //             cnt=0;
            //         }
            //     } 
            //     else {
            //         cnt++;

            //     }
            // }
            // System.out.println(maxcnt);



            // int [] arr = new int[]{1,1,1,2,4,3,1,3,3}; //1 2 4 5   3,3,3,3,3
            // // int val = 3;
            // int count = 0;//4
            // int max = 0;
    
            // // for (int i = 0; i < arr.length; i++)
            // //     if (arr[i] != val) {
            // //         arr[count++] = arr[i];
            // //     }
    
            // // while (count < arr.length)
            // //     arr[count++] = val;
            
            // // for (int i : arr) {
            // //     System.out.println(i);

            // for (int i = 0; i < arr.length; i++) {
            //               if (arr[i] == 1) {
            //                 count++;
            //               } else if (arr[i] == 0) {
            //                 if (count > max)
            //                   max = count;
            //                 count = 0;
            //               }
            //             }
                    
            //             if (count > max)
            //               max = count;
                    
            //             System.out.println(max);


            // for (int i = 0; i < array.length - i; i++) {
            //         if (array[i] == val){
            //             for (int j = i; j < array.length - 1; j++) {
            //                 int t = array[j+1];
            //                 array[j+1] = array[j];
            //                 array[j] = t;
            //             }
            //             i--;
            //             }
            //     }
            // System.out.println(array.toString(array));
            // }


        
    
 


    
//     // Задача 2. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//         // максимальное количество подряд идущих 1.
//         int[] arr = new int[] { 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
//         int count = 0;
//         int max = 0;
    
//         for (int i = 0; i < arr.length; i++) {
//           if (arr[i] == 1) {
//             count++;
//           } else if (arr[i] == 0) {
//             if (count > max)
//               max = count;
//             count = 0;
//           }
//         }
    
//         if (count > max)
//           max = count;
    
//         System.out.println(max);
    
//     public class task2 {
//         public static void main(String[] args) {
//             int[] arr = new int[] {1,1};
//             int cnt=0;
//             int maxcnt=0;
//             int len=arr.length;
//             for  (int i = 0; i < len; i++)  {
//                 if (arr[i]==0 || i==len-1) {
//                     if (arr[i]==1) cnt++;
//                     if (cnt>maxcnt) {
//                         maxcnt = cnt;  
//                         cnt=0;
//                     }
//                 } 
//                 else {
//                     cnt++;
//                 }
//             }
//             System.out.println(maxcnt);
//         }
//     }
    
// }
