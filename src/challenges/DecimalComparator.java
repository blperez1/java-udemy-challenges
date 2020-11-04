package challenges;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(isEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(isEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(isEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(isEqualByThreeDecimalPlaces(-3.123, 3.123));

    }
    public static boolean isEqualByThreeDecimalPlaces(double n1, double n2){
        return (int)(n1 * 1000) == (int)(n2 * 1000);
    }
}
