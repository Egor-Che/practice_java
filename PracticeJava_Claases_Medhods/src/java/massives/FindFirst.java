import java.util.Scanner;
public class FindFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите значение Х: ");
        int x = in.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 2, 2, 5};
        System.out.println(findFirst(arr, x));
    }
    public static int findFirst(int[] arr, int x){
        int myIndex =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                myIndex = i;
                System.out.print("Индекс первого вхождения Х в массив: "); break;
            } else if ( (arr[i] != x) && (i == arr.length-1)) {
                myIndex = -1;
                System.out.print("Вхождение Х в массив не обнаружено: "); break;
            }
        }
        return myIndex;
    }
}
