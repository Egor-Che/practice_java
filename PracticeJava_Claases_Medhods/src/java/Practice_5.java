import java.util.Scanner;
public class Practice_5 {
    static boolean res = true;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите положительное целое двузначное число: ");
        int x = in.nextInt();
        is2Digits(x);
        System.out.println(res);
    }
    public static boolean is2Digits(int x){
        if ( x < 0 ) {
            System.out.println("Вы ввели неприемлемое значение, запустите исполнение задачи заново");
            res = false;
        }
        else {
            if (String.valueOf(x).length() == 2) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }
}