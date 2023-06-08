package DZ1;
/*
 3) Реализовать простой калькулятор (+-/*)
sc.next() - считывает 1 элемент
sc.nextInt() - считывает только число
sc.nextLine() - считывает строчку
Введите число: 4 \n
Введите знак:
 */

 import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class calculator {
     public static void main(String[] args) {
 
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("Введите знак (+, -, *, /):");
             char operation = scanner.next().charAt(0);
 
             if (!(operation == '+' || operation == '-' || operation == '*' || operation == 'x' || operation == '/')) {
                 System.err.println("Неверный знак !");
             }
 
             System.out.println("Введите первое число: ");
             double num1 = scanner.nextDouble();
 
             System.out.println("Введите второе число: ");
             double num2 = scanner.nextDouble();
 
             if (operation == '/' && num2 == 0.0) {
                 System.err.println("Второе число для операции деления не равно 0.");
             }
 
             switch (operation) {
             case '+':
                 System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                 break;
             case '-':
                 System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                 break;
             case '*':
                 System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                 break;
             case 'x':
                 System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                 break;
             case '/':
                 System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                 break;
             default:
                 System.err.println("Указан неверный знак!");
                 break;
             }
         } catch (InputMismatchException exc) {
             System.err.println(exc.getMessage());
         }
     }
 }