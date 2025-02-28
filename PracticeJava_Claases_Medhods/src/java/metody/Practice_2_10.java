package java.metody;

import java.util.Scanner;
public class Practice_2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int x = in.nextInt();
        System.out.println(age(x));
    }
    public static String age(int x){
        System.out.println("x=" + x);
        System.out.print("Результат: ");
        if ((x % 10 == 1) && (x % 100 != 11)){
            return x + " год";
        }
        else if (((x%10 == 2) && (x%100 != 12)) || ((x%10 == 3) && (x%100 != 13)) || ((x%10 == 4) && (x%100 != 14))){
            return x + " годa";
        }
        return x + " лет";
    }
}
