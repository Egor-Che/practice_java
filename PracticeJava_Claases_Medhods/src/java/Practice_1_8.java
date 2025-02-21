import java.util.Scanner;
public class Practice_1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое положительное число: ");
        int a = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое положительное число: ");
        int b = in.nextInt();
        isDivisor(a, b);
    }

    public static boolean isDivisor(int a, int b) {
        boolean res = false;
        if ((a >= b) && (b > 0)) {
            if (a % b == 0) {
                res = true;
            }
        } else if ((b >= a) && (a > 0)) {
            if (b % a == 0) {
                res = true;
            }
        }
        else if ((a < 0) || (b < 0)){
            System.out.println("Вы ввели отрицательное число, будьте внимательнее!");
            res = false;
        }
        else {
            System.out.println("На ноль делить нельзя!");
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
