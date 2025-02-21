import java.util.Scanner;
public class Practice_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int a = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int b = in.nextInt();
        System.out.print("Пожалуйста, введите третье целое число: ");
        int c = in.nextInt();
        System.out.println(max3(a, b, c));
    }
    public static int max3(int x, int y, int z){
        System.out.println("x=" + x + " y=" + y + " z=" + z);
        System.out.print("Результат: ");
        if ((x >= y) && (x >= z)){
            return x;
        }
        else if ((y >= x) && (y >= z)){
            return y;
        }
        else {
            return z;
        }
    }
}
