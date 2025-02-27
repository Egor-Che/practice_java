import java.util.Scanner;
public class EqualNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int x = in.nextInt();
        System.out.println(equalNum(x));
    }
    public static boolean equalNum(int x){
        if ((x > -10) && (x < 10)){
            System.out.println("Число состоит из одной цифры");
            return false;
        }
        else if (x < -9) {
            x = x * -1;
        }
        int a = String.valueOf(x).length();
        if (a>1) {
            int b = a;
            int symvol = 0;
            while (b-- > 0) {
                symvol = symvol * 10 + 1;
            }
            if (x % symvol == 0){
                System.out.println("Цифра " + x % 10 + ", количество повторений: " + a);
                return true;
            }
            else {
                System.out.println("В введенном числе есть различающиеся цифры");
                return false;
            }
        }
        return false;
    }
}
