package Mistakes1;


    /**
     Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
     Если длина массива меньше некоторого заданного минимума, метод возвращает
     -1, в качестве кода ошибки, иначе - длину массива.
     */

public class prog1 { 
           
    public static void main(String[] args) {
        int[] num_arr = new int[] {7, 8, 3, 5, 1, 6, 2, 9, 4};
        System.out.println(task1(num_arr));
    }
      public static int task1(int[] arr)  {
        
        // static int Task1(int[] arr)
        
        if (arr.length == 0){
            return -1;
        }
        return arr.length;
    }
}
