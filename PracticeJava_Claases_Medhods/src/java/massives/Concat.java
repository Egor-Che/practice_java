import java.util.Arrays;
public class Concat {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{7,8,9};
        concat(arr1, arr2);
    }
    public static int[] concat(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = len1 + len2;
        int[] arr = new int[len];
        for (int i = 0; i < arr1.length; ++i) {
            arr[i]  = arr1[i];
        }
        for (int i = 0; i < arr2.length; ++i) {
            arr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
