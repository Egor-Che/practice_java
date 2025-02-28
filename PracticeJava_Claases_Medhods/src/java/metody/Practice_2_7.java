package java.metody;

import java.util.Scanner;
public class Practice_2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int y = in.nextInt();
        System.out.println(sum2(x, y));
    }
    public static int sum2(int x, int y){
        System.out.println("x=" + x + " y=" + y);
        System.out.print("Результат: ");
        int z = x + y;
        if ((z >= 10) && (z <= 19)){
            z = 20;
        }
        return z;
    }
}
