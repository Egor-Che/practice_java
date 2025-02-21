import java.util.Scanner;
public class Practice_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int y = in.nextInt();
        System.out.println(max(x, y));
    }
    public static int max(int x, int y){
        System.out.println("x=" + x + " y=" + y);
        if (x >= y){
            System.out.print("Результат: ");
            return x;
        }
        else {
            System.out.print("Результат: ");
            return y;
        }
    }
}
