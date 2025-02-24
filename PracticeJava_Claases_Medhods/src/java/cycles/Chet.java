import java.util.Scanner;
public class Chet {
    static int i = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        System.out.println(chet(x));
    }
    public static String chet(int x){
        if (x < 0){
            System.out.println("Вы ввели неверное значение: " + x);
        }
        else{
            System.out.println("x=" + x);
            System.out.print("результат: ");
            for (i = 0; i < x-1; i++){
                System.out.print(i + " ");
                i = i+1;
            }
        }
        return String.valueOf(i);
    }
}

