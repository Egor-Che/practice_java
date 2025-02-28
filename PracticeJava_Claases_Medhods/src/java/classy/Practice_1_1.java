package java.classy;

public class Practice_1_1 {
    public static void main(String[] args) {
        System.out.println(fraction(5.3454));
        System.out.println(fraction(2.75446763));
        System.out.println(fraction(0.32));
    }
    public static double fraction(double x){
        int y = (int) x;
        double res = x - y;
        String s = String.format("%.3f", res).replace(",", ".");  // округляем res до 3-х знаков после запятой и подменяем запятую на точку
        //System.out.println(s);  // => 0,000
        return Double.parseDouble(s);
    }
}
