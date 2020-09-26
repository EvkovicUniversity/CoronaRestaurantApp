package AppTests;

import CoronaRestaurantApp.Persoon;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppTests {

    @Test
    public Date datumInvoeren(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Op welke datum wilt u reserveren? formaat: dd-mm-jjjj");

        String date = scanner.next();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date2=null;
        try {
            date2 = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date2);

        return date2;
    }



    @Test
    void maakEenReservering(){
        int leeftijd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij 'T Restaurantje. Hier kunt u een reservering maken.");
        System.out.println("Voer een voor- en achternaam in: ");
        String naamGast = scanner.nextLine();

        datumInvoeren();

        System.out.println("Voor hoeveel mensen wilt u reserveren?");
        int aantalGasten = scanner.nextInt();

        // Check beschikbaarheid methode moet hier

        System.out.println("Wat is uw leeftijd?");
        short leeftijdGast = scanner.nextShort();

        System.out.println("Wat is uw emailadres?");
        String emailadres = scanner.nextLine();

        System.out.println("Tot slot, wat is uw telefoonnummer?");
        String telefoonnummer = scanner.nextLine();

        System.out.println("overzicht van gegevens:");

        Persoon p1 = new Persoon(naamGast, leeftijdGast, emailadres, telefoonnummer);
        System.out.println(p1.getNaam());
        System.out.println(p1.getLeeftijd());
        System.out.println(p1.getEmail());
        System.out.println(p1.getTelefoonnummer());
        System.out.println();
        System.out.println("Uw groep bevat: " + aantalGasten + " personen.");

    }


    @Test
    void onvoldoendeTafelsBeschikbaar(){

    }

    @Test
    void overlappendeReservering(){

    }

    @Test
    void personenContacterenBijCorona(){

    }


}
