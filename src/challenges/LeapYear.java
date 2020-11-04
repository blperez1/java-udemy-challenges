package challenges;

import javax.imageio.stream.ImageInputStream;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

}

    public static boolean isLeapYear(int year) {
        if(year < 0 || year > 9999) {
            return false;
        }else {
            return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
        }
    }
}
