import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hur många sniglar ska skapas?");

        String sniglarString = myObj.nextLine();
        int antalSnails = Integer.parseInt(sniglarString);


        if(antalSnails>0){
            TurboSnail Tsnail = new TurboSnail();
            SlackingSnail Ssnail = new SlackingSnail();




        }

    }
}


