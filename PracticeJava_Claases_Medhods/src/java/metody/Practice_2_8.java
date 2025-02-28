package java.metody;

import java.util.Scanner;
public class Practice_2_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int x = in.nextInt();
        System.out.println(is35(x));
    }
    public static boolean is35(int x){
        System.out.println("x=" + x);
        System.out.print("Результат: ");
        if ((x % 3 == 0) && (x % 5 == 0)){
            return false;
        }
        else if ((x % 5 == 0) || (x % 3 == 0)){
            return true;
        }
        return false;
    }
}