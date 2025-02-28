package java.metody;

import java.util.Scanner;
public class Practice_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int y = in.nextInt();
        System.out.println(makeDecision(x, y));
    }
    public static String makeDecision(int x, int y){
        System.out.println("x=" + x + " y=" + y);
        if (x > y){
            System.out.println("Результат: “" + x + " > " + y + "”");
        }
        else if (x < y){
            System.out.println("Результат: “" + x + " < " + y + "”");
        }
        else{
            System.out.println("Результат: “" + x + " == " + y + "”");
        }
        return " ";
    }
}
