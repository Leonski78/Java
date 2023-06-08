package DZ1;
/*
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
1 + 2 + 3 1*2*3
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        var con = System.console();
             if (con != null) {
         Scanner sc = new Scanner(con.reader());  
         int n = sc.nextInt();
         
         int sum = 0;
        for (int i=0; i <= n; i++)
          if (i <= n) {
            sum += i; 
          }
        System.out.println("Треугольное число: " + sum);
        
          int factorial = 1;
        for (int i=2; i<=n; i++)
          if (i <= n) {
            factorial *= i;
            }
          System.out.println("Факториал: " + factorial);
         }
  }
}  