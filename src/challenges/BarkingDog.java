package challenges;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if(hourOfDay < 0) {
            return false;
        }else {
            return isBarking && (hourOfDay < 8 || hourOfDay > 22);
        }
    }
}
