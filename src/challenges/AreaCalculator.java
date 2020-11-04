package challenges;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        }else {
            return Math.pow(radius, 2) * Math.PI;
        }
    }

    public static double area(double length , double width) {
        if(length < 0 || width < 0) {
            return -1.0;
        }else {
            return length * width;
        }
    }
}
