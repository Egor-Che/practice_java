public class Practice_10 {
    public static void main(String[] args) {
        int a = 5;
        int[] b = new int[4];
        b[0] = 11;
        b[1] = 123;
        b[2] = 14;
        b[3] = 1;
        System.out.println(lastNumSum(a , b));
    }
    public static int lastNumSum(int a, int [] b){
        int i;
        for (i =0; i<=2; i++){
            System.out.print(a + " + " + b[i] + " это ");
            a = ((a%10)+b[i]%10);
            System.out.println(a);
        }
        System.out.print(a + " + " + b[i] + " это ");
        System.out.println((a%10)+b[i]%10);
        System.out.print("Итого ");
        return((a%10)+b[i]%10);
    }
}
