import java.util.Scanner;

public class Practice_2_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int x = in.nextInt();
        System.out.println(day(x));
    }
    public static String day(int x){
        System.out.println("x=" + x);
        String str = "День недели: ";
        switch (x){
            case 1 : str = str + "Понедельник"; break;
            case 2 : str = str +  "Вторник"; break;
            case 3 : str = str +  "Среда"; break;
            case 4 : str = str +  "Четверг"; break;
            case 5 : str = str +  "Пятница"; break;
            case 6 : str = str +  "Суббота"; break;
            case 7 : str = str +  "Воскресенье"; break;
            default: str = str +  "Это не день недели";
        }
        return str;
    }
}
