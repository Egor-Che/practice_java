import java.util.Scanner;
public class Practice_1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int a = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int b = in.nextInt();
        System.out.print("Пожалуйста, введите третье целое число: ");
        int num = in.nextInt();
        System.out.println("Принадлежит ли третье введенное число к заданному первым и вторым числом интервалу?");
        isInRange(a,b,num);
    }
    public static boolean isInRange(int a, int b, int num){
        boolean res = false;
        if (a > b)  {
            if ((a > num) && (num > b)) {
                res = true;
            }
        }
        else if (a < b) {
            if ((b > num) && (num > a)) {
                res = true;
            }
        } else if (a == b) {
            if (num == a){
                res = true;
            }
        } else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
