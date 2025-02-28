package java.classy;

import java.util.Scanner;
public class Practice_1_6
{
    public static void main(String[] args) {
        System.out.print("Введите латинский символ в верхнем регистре: ");
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        boolean b = Character.isUpperCase(x);
        isUpperCase(x);
    }
        public static boolean isUpperCase(char x){
            if (x >= 'A' && x <= 'Z'){
                System.out.println("true");
                return true;
            }
            else{
                System.out.println("false");
                return false;
            }
        }
}