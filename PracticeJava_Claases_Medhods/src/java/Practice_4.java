import java.util.Scanner;
public class Practice_4 {
    static boolean res = true;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int x = in.nextInt();
        isPositive(x);
        System.out.println(res);
    }
    public static boolean isPositive(int x){
        if (x < 0){
            res = false;
        }
        return res;
    }
}