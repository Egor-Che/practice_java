package java.classy;

import java.util.Scanner;
public class Practice_1_2 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("Пожалуйста, введите целое число, состоящее не менее чем из 2 знаков: ");
            int number = in.nextInt();
            if (number < 0){
                number = -1 * number;
            }
            if (number > 9){
                int sum = 0;
                for (int i = 0; i < 2; i++) {
                    int lastDigit = number % 10;
                    sum += lastDigit;
                    number /= 10;
                }
                System.out.println("сумма последних двух знаков заданного числа равна : " + sum);
            } else {
                System.out.println("Введены неверные данные");
            }
        }
    }


