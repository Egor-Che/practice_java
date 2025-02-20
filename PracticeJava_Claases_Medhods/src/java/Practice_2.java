public class Practice_2 {
    public static void main(String[] args) {
        System.out.println(sumLastNums());
    }
    public static int sumLastNums(){
        int x = 4568;
        int a = x % 10;
        int b = (x / 10) % 10;
        int sum = a + b;
        return sum;
    }
}

