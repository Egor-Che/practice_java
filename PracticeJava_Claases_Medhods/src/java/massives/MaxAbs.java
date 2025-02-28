public class MaxAbs {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, -7, 4, 2, 2, 5};
        System.out.println(maxAbs(arr));
    }
    public static int maxAbs(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)){
                max = arr[i];
            }
        }
        return max;
    }
}
