import java.util.Scanner;
public class Practice_2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите первое целое число: ");
        int x = in.nextInt();
        System.out.print("Пожалуйста, введите второе целое число: ");
        int y = in.nextInt();
        System.out.print("Пожалуйста, введите третье целое число: ");
        int z = in.nextInt();
        System.out.println(sum3(x , y, z));
    }
    public static boolean sum3(int x, int y, int z){
        System.out.println("x=" + x + " y=" + y + " z=" + z);
        System.out.print("Результат: ");
        if (x + y == z) {
            return true;
        }
        else if (y + z == x) {
            return true;
        }
        else if (x + z == y) {
            return true;
        }
        else{
            return false;
        }
    }
}