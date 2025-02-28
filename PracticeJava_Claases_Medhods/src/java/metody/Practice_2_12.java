package java.metody;

import java.util.Scanner;
public class Practice_2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите название дня недели: ");
        String str = in.next();
        System.out.println(getResult(str));
    }
    public static String getResult(String str){
        System.out.println("x=" + str);
        System.out.println("Результат:");
        printDays(str);
        return "";
    }
    public static void printDays(String x){
        switch (x){
            case "Понедельник" : System.out.println(" Понедельник");
            case "Вторник" : System.out.println(" Вторник");
            case "Среда" : System.out.println(" Среда");
            case "Четверг": System.out.println(" Четверг");
            case "Пятница" : System.out.println(" Пятница");
            case "Суббота" : System.out.println(" Суббота");
            case "Воскресенье" : System.out.println(" Воскресенье");break;
            default : System.out.println(" - это не день недели");break;
        }
    }
}
