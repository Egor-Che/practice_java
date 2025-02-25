import java.util.Scanner;
public class NumLen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое положительное число: ");
        int x = in.nextInt();
        System.out.println(numLen(x));
    }
    public static int numLen(long x){
        if (x < 0) {
            System.out.println("Ошибка ввода!");
        }
        int numLen = 1;
            while ((x / 10) != 0){
                numLen = numLen + 1;
                x = x /10;
            }
        return numLen;
    }
}

/*В принципе, в этой задаче можно было допустить и отрицательные значения числа Х, решение одинаково полноценно и для значений ниже нуля.*/