import java.util.Scanner;

public class GebruikersInvoer {

    public static void main(String[] args) {


        var keyboard = new Scanner(System.in);

        System.out.println("Voer een getal in aub, dan reken ik de tafel van dat getal uit!");

        int invoerGetal=keyboard.nextInt();

        for (int teller = 1; teller <= 10; teller++) {
            int tafel = teller * invoerGetal;

            System.out.print(teller);
            System.out.print(" x " + invoerGetal + " = ");
            System.out.println(tafel);

        }
    }

}
