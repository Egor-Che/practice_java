import java.util.Scanner;
public class ReverseListNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        System.out.println(reverseListNums(x));
    }
    public static String reverseListNums(int x){
        if (x < 0){
            System.out.print("Вы ввели неверное значение: ");
        }
        else{
            System.out.println("x=" + x);
            System.out.print("результат: ");
            for (int i = x; i > 0; i--){
                System.out.print(x + " ");
                x = x-1;
            }
        }
        return String.valueOf(x);
    }
}
