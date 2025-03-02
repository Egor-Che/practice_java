import java.util.Arrays;
public class Add {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int x = 9;
        int pos = 3;
        add(arr, x, pos);
    }
    public static int[] add(int[] arr, int x, int pos){
        int i = 0;
        int [] newArr = new int[arr.length+1];
        for (; i < pos; i++){
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (i = pos+1; i < arr.length+1 ; i++){
            newArr[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;

    }
}
