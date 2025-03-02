import java.util.Arrays;
public class DeleteNegative {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,-3,4,-2,2,-5};
        deleteNegative(arr);
    }
    public static int[] deleteNegative(int[] arr){
        int [] pos = new int[arr.length];
        int count = 0;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] > 0){
                pos[i] = arr[i];
                count ++;
            }
        }
        arr = new int [count];
        int y = 0;
        for (int n = 0; n < pos.length; n++){
            if (pos[n] != 0){
                arr[y] = pos[n];
                y++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
