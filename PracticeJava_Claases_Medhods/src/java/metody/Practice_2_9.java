package java.metody;

import java.util.Scanner;
public class Practice_2_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int y = in.nextInt();
        System.out.println(magic6(x , y));
    }
    public static boolean magic6(int x, int y){
        System.out.println("x=" + x + " y=" + y);
        System.out.print("Результат: ");
        if ((x == 6) || (y == 6) || (x+y == 6) || (x-y ==6) || (y-x ==6)){
            return true;
        }
        return false;
    }
}