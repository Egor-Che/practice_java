public class СountPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, -7, 4, 2, 2, 5};
        System.out.println(countPositive(arr));
    }
    public static int countPositive(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                count++;
            }
        }
        return count;
    }
}
