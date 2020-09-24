import java.util.Scanner;

public class GebruikersInvoer {

    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);

        System.out.println("Voer een woord in, dan ziet u hoeveel letters dit woord heeft.");

        String invoerWoord = keyboard.nextLine();
        System.out.println(invoerWoord.length());

        System.out.println("Voer een getal in, dan wordt de tafel van dat getal uitgerekend!");

        int invoerGetal=keyboard.nextInt();

        for (int teller = 1; teller <= 10; teller++) {
            int tafel = teller * invoerGetal;

            System.out.print(teller);
            System.out.print(" x " + invoerGetal + " = ");
            System.out.println(tafel);

        }
    }

}
