import java.util.Scanner;
public class FindLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите значение Х: ");
        int x = in.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 2, 2, 5};
        System.out.println(findLast(arr, x));
    }
    public static int findLast(int[] arr, int x){
        int myIndex =0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == x) {
                myIndex = i;
                System.out.print("Индекс последнего вхождения Х в массив: "); break;
            } else if ( (arr[i] != x) && (i == 0)) {
                myIndex = -1;
                System.out.print("Вхождение Х в массив не обнаружено: "); break;
            }
        }
        return myIndex;
    }
}
