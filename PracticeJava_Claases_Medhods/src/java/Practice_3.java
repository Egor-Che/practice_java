import java.util.Scanner;
public class Practice_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите цифру от 0 до 9: ");
        int x = in.nextInt();
        System.out.println(charToNum((char) x));
    }
    public static int charToNum(char x){
        x = Integer.toString(x).charAt(0);
        return x;
    }
}
