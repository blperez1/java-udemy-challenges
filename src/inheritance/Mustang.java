package inheritance;

public class Mustang extends Car{
    private int roadService;

    public Mustang(String size, int roadService) {
        super("Mustang", size, 5, 4, 4, true);
        this.roadService = roadService;
    }

    public void acceleration(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        }else {
            changeGear(4);
        }
    }
}
