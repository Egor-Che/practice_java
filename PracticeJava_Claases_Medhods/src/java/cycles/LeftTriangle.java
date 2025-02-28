import java.util.Scanner;
public class LeftTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        leftTriangle(x);
    }
    public static void leftTriangle(int x){
        if (x < 1) {
            System.out.println("Вы ввели неверные данные");
        }
        else {
            for (int i = 1; i <= x; i++) {
                System.out.print("*");
                for (int a = 1; a < i; a++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }

    }
}

