import java.util.Random;

public class SlackingSnail extends Snail{
    public void slackingSnail(){
        Random rand = new Random();
        this.speed = rand.nextInt(5)+4;
        this.energy = rand.nextInt(7);
    }

}
