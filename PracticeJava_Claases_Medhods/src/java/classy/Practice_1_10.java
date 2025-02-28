package java.classy;

public class Practice_1_10 {
    public static void main(String[] args) {
        int a = 5;
        int[] b = new int[4];
        b[0] = 11;
        b[1] = 123;
        b[2] = 14;
        b[3] = 1;
        System.out.println(lastNumSum(lastNumSum(lastNumSum(lastNumSum(5,11),123),14),1));
    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
