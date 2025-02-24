import java.util.Scanner;
public class ListNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        System.out.println(listNums(x));
    }
    public static String listNums(int x){
        if (x < 0){
            System.out.print("Вы ввели неверное значение: ");
        }
        else{
            System.out.println("x=" + x);
            System.out.print("результат: ");
            for (int i = 0; i < x; i++){
                System.out.print(i + " ");
            }
        }
        return String.valueOf(x);
    }
}
