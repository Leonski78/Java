/*
 3) Реализовать простой калькулятор (+-/*)
sc.next() - считывает 1 элемент
sc.nextInt() - считывает только число
sc.nextLine() - считывает строчку
Введите число: 4 \n
Введите знак:
 */

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите 1-e число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите знак: ");
        Scanner scanner2 = new Scanner(System.in);
        String sign = scanner.nextLine();
        System.out.println("Введите 2-e число: ");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner.nextInt();

        int res = 0;
        // res = a sign b;
    }
}