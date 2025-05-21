public class TurboSnail extends Snail{
    int randomSpeed = 5+(int)(Math.random()*6);
    int randomEnergy = 4+(int)(Math.random()*7);



    public int getSpeed() {
        return speed=randomSpeed;
    }
    public int getEnergy() {
    return energy=randomEnergy;
    }
}
