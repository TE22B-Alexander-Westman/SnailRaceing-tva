public abstract class Snail{
    int speed;
    int energy;
    boolean likelyToWin;

    public int getSpeed() {
        return speed;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isLikelyToWin() {
        return likelyToWin;
    }
    public int getScore(){
        return speed + energy;
    }

    public void calculateWin(){
        if(getScore() >= 10){
            likelyToWin =true;// kollar om sniglarna har en chans att vinna
        }
    }
}
