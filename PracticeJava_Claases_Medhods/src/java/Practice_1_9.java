import java.util.Scanner;
public class Practice_1_9 {
    static boolean res = false;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int a = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int b = in.nextInt();
        System.out.print("Пожалуйста, введите третье целое число: ");
        int c = in.nextInt();
        System.out.println(isEqual(a, b, c));
    }
    public static boolean isEqual (int a, int b, int c){
        if ((a == b) && (b == c)){
            res = true;
        }
        return res;
    }
}
