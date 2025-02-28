public class GuessGame {
    public static void main(String[] args) {
        int x = 0;
        guessGame(x);
    }
    public static void guessGame(int x) {
        int randomNum = 6;
        int count = 0;
        System.out.println("Какую цифру я загадал, от 0 до 9? :");
        do {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            x = sc.nextInt();
            count++;
            if ((x < 0) || (x > 9)){
                System.out.println("Вы ввели неверные данные");
            }
            else if (x != randomNum) {
                System.out.println("Нет, еще попытка");
            }
        }
        while (x != randomNum); {
            System.out.println("Да, это " + randomNum);
            System.out.println("Количество ваших попыток: " + count);
        }
    }
}
