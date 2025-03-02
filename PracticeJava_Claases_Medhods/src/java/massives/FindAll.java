import java.util.Arrays;
public class FindAll {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,8,2,2,9};
        int x = 2;
        findAll(arr, x);
    }
    public static int[] findAll(int[] arr, int x){
        int [] findAllX = new int[arr.length];
        int count = 0;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] == x){
                findAllX[i] = i;
                count ++;
            }
        }
        arr = new int [count];
        int y = 0;
        for (int n = 0; n < findAllX.length; n++){
            if (findAllX[n] != 0){
                arr[y] = findAllX[n];
                y++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
