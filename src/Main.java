import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Snail> sniglarArray = new ArrayList<Snail>();
        Random rand = new Random();
        int antalSniglar = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hur många sniglar ska skapas?");

        while(antalSniglar<=0){
            antalSniglar=myObj.nextInt();
            if (antalSniglar>0){
                myObj.close();
            }
            else{
                System.out.println("skriv ett tal");
                myObj.next();
            }
        }
        if (antalSniglar>0){
            TurboSnail turboSnigle = new TurboSnail();
            SlackingSnail slackingSnigle = new SlackingSnail();

            sniglarArray.add(turboSnigle);
            sniglarArray.add(slackingSnigle);
        }






    }
}


