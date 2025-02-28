import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        rightTriangle(x);
    }
    public static void rightTriangle(int x){
        if (x < 1) {
            System.out.println("Вы ввели неверные данные");
        }
        int a = 1;
        int b = 1;
        for (int i = 1; i <= a; i++) {
            for (a = i; a <= x-1 ; a++){
                System.out.print(" ");
            }
            for (b = 1; b <= i ; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
