package Mistakes1;

import java.util.Random;
import java.util.Scanner;

/**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     *     Необходимо посчитать и вернуть сумму элементов этого массива.
     *     При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
     *     (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
     *     Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    
public class prog3 {
    static Scanner scanner = new Scanner(System.in);
     static Random random = new Random();

// static void Task3()
public static void main(String[] args) {
     
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n ***Итерация %d ***\n\n", i+1);
            processArray(generateArray());
        }
     }

     static void processArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length){
                // throw new IOException();
                throw new RuntimeException("Некорректная размерность массива");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1){
                    throw new RuntimeException(String.format("Некорректное значение массива по индексу: %d %d", i, j));
                }
                else{
                    sum += arr[i][j];
                }
            }
        }
        System.out.printf("Сумма элементов массива: %d\n", sum);
     }


     static int[][] generateArray(){
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(2);
                if (random.nextInt(1000) == 0)
                {
                    arr[i][j] = 2; // Намерненная ошибка
                }
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
}