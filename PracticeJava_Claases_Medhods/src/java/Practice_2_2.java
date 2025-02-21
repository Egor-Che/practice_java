import java.util.Scanner;
public class Practice_2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int y = in.nextInt();
        System.out.println(safeDiv(x, y));
    }
    public static int safeDiv(int x, int y){
        if (y == 0) {
            return 0;
        }

        else {
            System.out.println("X=" + x + " Y=" + y);
            System.out.print("Результат: ");
            return x / y;
        }
    }
}
