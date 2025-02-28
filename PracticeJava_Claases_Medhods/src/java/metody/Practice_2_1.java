package java.metody;

import java.util.Scanner;
public class Practice_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int x = in.nextInt();
        System.out.println(abs(x));
    }
    public static int abs(int x){
        if (x < 0){
            x = -1 * x;
        }
        return x;
    }
}
