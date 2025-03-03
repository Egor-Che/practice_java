import java.util.Arrays;
public class DeleteNegative {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,-3,4,-2,2,-5,0};
        System.out.println(Arrays.toString(arr));//Исходный массив
        deleteNegative(arr);
        System.out.println(Arrays.toString(deleteNegative(arr)));//массив с удаленными негативными числами
    }
    public static int[] deleteNegative(int[] arr){
        int [] pos = new int[arr.length];
        int count = 0;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] >= 0){
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
        return arr;
    }
}
