import java.util.Arrays;
public class Reverse {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,9};
        System.out.println(Arrays.toString(arr));//исходный массив
        reverse(arr);
        System.out.println(Arrays.toString(arr));//массив после реверса
    }
    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}