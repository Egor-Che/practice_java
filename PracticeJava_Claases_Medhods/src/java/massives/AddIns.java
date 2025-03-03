import java.util.Arrays;
public class AddIns {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] ins = new int[]{7,8,9,89,76,-9,2};
        int pos = 3;
        int[] newArr = addIns(arr, ins, pos);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] addIns(int[] arr, int[] ins, int pos){
        int i = 0;
        int len1 = arr.length;
        int len2 = ins.length;
        int lenAll = len1 + len2;
        int [] newArr = new int[len1 + len2];
        for (; i < pos; i++){
            newArr[i] = arr[i];
        }
        for (int j = 0; j < len2 ; j++){
            newArr[pos+j] = ins[j];
        }
        for (i = pos+len2; i < lenAll ; i++){
            newArr[i] = arr[pos];
            pos = pos+1;
        }
        return newArr;
    }
}
