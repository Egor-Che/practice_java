import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int len1 = arr.length-1;
        int len2 = len1+1;
        int e = 0;
        int[] reverseArr = new int[len2];
        for (int i = len1; i >=0; i--) {
            reverseArr[e] = arr[i];
            if (e < 4){
                e++;
            }
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
