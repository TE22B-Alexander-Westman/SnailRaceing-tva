import java.util.Random;

public class TurboSnail extends Snail {
    public void turboSnail() {
        Random rand = new Random();
        this.speed = rand.nextInt(6) + 5;
        this.energy = rand.nextInt(5) + 6;
    }

}
