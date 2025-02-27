import java.util.Scanner;
public class Square {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        square(x);
    }
    public static void square(int x){
        if (x < 1) {
            System.out.println("Вы ввели неверные данные");
        }
        else {
            for (int i = 1; i <= x; i++) {
                for (int a = 0; a < x; a++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}