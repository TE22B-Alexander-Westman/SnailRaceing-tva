import java.util.Random;
// SNABB SNIGEL
public class TurboSnail extends Snail {
    public void turboSnail() {
        Random rand = new Random();
        this.speed = rand.nextInt(6) + 5;// randomiser hasitgheten till snabb snigel
        this.energy = rand.nextInt(5) + 6;
    }

}
