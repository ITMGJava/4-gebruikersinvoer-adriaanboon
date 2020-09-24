import java.util.Scanner;

public class GebruikersInvoer {

    public static void main(String[] args) {

        //de variabele keyboard variabele bevat invoer van het toetsenbord.

        var keyboard = new Scanner(System.in);

        System.out.println("Voer een woord in, dan ziet u hoeveel letters dit woord heeft.");

        //ontvang het ingevoerde woord, daarna wordt het aantal letters geteld.
        String invoerWoord = keyboard.nextLine();
        System.out.println(invoerWoord.length());

        System.out.println("Voer een getal in, dan wordt de tafel van dat getal uitgerekend!");

        //vang het ingevoerde getal af.
        int invoerGetal=keyboard.nextInt();

        for (int teller = 1; teller <= 10; teller++) {
            int tafel = teller * invoerGetal;

            System.out.print(teller);
            System.out.print(" x " + invoerGetal + " = ");
            System.out.println(tafel);

        }
    }

}
