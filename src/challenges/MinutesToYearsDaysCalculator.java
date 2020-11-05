package challenges;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);

    }
    public static void printYearsAndDays(long minutes) {
        long hours = minutes / 60 / 24 ;
        System.out.println(hours);
//        if(minutes < 0) {
//            System.out.println("Invalid Value");
//        }else {
//            System.out.println(minutes + " min = " + year + " y and " +day + " d");
//        }
    }
}
