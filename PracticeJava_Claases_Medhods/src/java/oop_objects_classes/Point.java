public class Point {
    public int x; // абсцисса точки
    public int y; // ордината точки
    // возвращает строку с описанием точки
    public String toString() {
        return "("+x+";"+y+")";
    }
    // конструктор, создающий точку с указанными координатами
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    // метод проверяющий совпадают ли точки
    public boolean equalsPoint(Point p) {
        if(this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Point p1 = new Point(1,3);//точка 1
        Point p2 = new Point(1,3);//точка 2
        Point p3 = new Point(5,8);//точка 3

        System.out.print(p1 + " ");
        System.out.print(p1.equalsPoint(p3));//сравнение первой и третьей
        System.out.println(" " + p3);

        System.out.print(p2 + " ");
        System.out.print(p2.equalsPoint(p3));//сравнение второй и третьей
        System.out.println(" " + p3);

        System.out.print(p1 + " ");
        System.out.print(p1.equalsPoint(p2));//сравнение первой и второй
        System.out.println(" " + p2);
    }
}