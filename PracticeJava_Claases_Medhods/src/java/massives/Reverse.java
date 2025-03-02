public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,9};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
            if (i < 0) break;
        }
    }
}