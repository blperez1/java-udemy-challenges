package encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 20, "Sword");

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());


    }
}
