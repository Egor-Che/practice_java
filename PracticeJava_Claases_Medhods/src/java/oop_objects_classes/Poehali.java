import java.awt.Point;
public class Poehali {
    public static void main(String[] args) {
        //Задание 1 - точка координат, сравнение точек
        Point p1 = new Point(1, 3);//точка 1
        Point p2 = new Point(1,3);//точка 2
        Point p3 = new Point(5,8);//точка 3

        System.out.print(p1 + " ");
        System.out.print(equals(p1,p2));//сравнение первой и третьей
        System.out.println(" " + p3);

        System.out.print(p2 + " ");
        System.out.print(equals(p1,p2));//сравнение второй и третьей
        System.out.println(" " + p3);

        System.out.print(p1 + " ");
        System.out.print(equals(p1,p2));//сравнение первой и второй
        System.out.println(" " + p2);
    }
}
