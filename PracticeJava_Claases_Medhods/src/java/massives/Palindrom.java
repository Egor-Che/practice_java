public class Palindrom {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,-2,-7,4,2,2,5};
        System.out.println(palindromFalse(arr1));
        int[] arr2 = new int[]{1,-2,-7,4,-7,-2,1};
        System.out.println(palindromTrue(arr2));
    }
    public static boolean palindromFalse(int[] arr1){
        boolean b1 = true;
        int len1 = arr1.length;
        for (int i = 0; i < len1 / 2; i++) {
            if (arr1[i] != arr1[len1 - i - 1]) {
                b1 = false;
            }
        }
        return b1;
    }    public static boolean palindromTrue(int[] arr2){
        boolean b2 = true;
        int len2 = arr2.length;
        for (int i = 0; i < len2 / 2; i++) {
            if (arr2[i] != arr2[len2 - i - 1]) {
                b2 = false;
            }
        }
        return b2;
    }
}


