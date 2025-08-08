package Practice.Oops;

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy...");
    }
    public void run(){
        System.out.println("Running from the enemy...");
    }
    public void fire(){
        System.out.println("Firing on the enemy...");
    }
}

public class RockstarGames {
    public static void main(String[] args) {
        TommyVecetti player1 = new TommyVecetti();

        player1.fire();
        player1.hit();
        player1.run();

    }
}
