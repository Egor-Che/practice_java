import java.util.Scanner;
public class Pow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число X: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое положительное число Y: ");
        int y = in.nextInt();
        System.out.println(pow(x , y));
    }
    public static int pow(int x, int y){
        if (y >= 0) {
            int res = 1;
            for (int i = 0; i < y; i++) {
                res = res * x;
            }
            return res;
        }
        else{
            System.out.print("Пожалуйста, не используйте отрицательные значения для степени числа (Y): ");
            return y;
        }
    }
}