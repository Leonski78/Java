// package Mistakes1;


/**
     Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
     Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
     1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
     2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
     3. если вместо массива пришел null, метод вернет -3
     4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
     Напишите метод, в котором реализуйте взаимодействие с пользователем.
     То есть, этот метод запросит искомое число у пользователя, вызовет первый,
     обработает возвращенное значение и покажет читаемый результат пользователю.
     Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    

public class prog2 {

     static Scanner scanner = new Scanner(System.in);
     static Random random = new Random();

    //    static void main()
        public static void main(String[] args)  {
        while (true){
            System.out.println("Введите число для поиска: ");
            if (scanner.hasNextInt()){
                int searchNumber = scanner.nextInt();
                int[] array = new int[random.nextInt(5) + 1];
                if (random.nextInt(2) == 0){
                    array = null;
                }
                if (array != null){
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(10);
                        System.out.printf("%d \t", array[i]);
                    }
                    System.out.println();
                }

                int codeResult = processArray(array, searchNumber);
                if (codeResult == -1){
                    System.out.println("Длина массива < 3 элементов");
                }
                else if (codeResult == -2){
                    System.out.println("Элемент не найден");
                }
                else if (codeResult == -3){
                    System.out.println("Массив некорректно проинициализирован");
                }
                else{
                    System.out.println("Массив успешно обработан");
                    System.out.printf("Элемент найден по индексу: %d\n", codeResult);
                }
            }
            else{
                System.out.println("Вы ввели не число, повторите ввод:");
                scanner.nextLine();
            }
        }

    }

    static int processArray(int[] arr, int searchNumber){
        if (arr == null){
            return -3;
        }
        if (arr.length <3){
            return -1;
        }
        Arrays.sort(arr);
        int searchRes = Arrays.binarySearch(arr, searchNumber);
        for (int el: arr){
            System.out.printf("%d\t", el);
        }
        System.out.println();
        if (searchRes < 0){
            return-2;
        }
        return searchRes;
    }
}