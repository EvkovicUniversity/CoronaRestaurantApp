package CoronaRestaurantApp;

import java.util.Date;

import static CoronaRestaurantApp.Methodes.*;

public class Main {

    public static void maakEenReservering() throws Exception {
        System.out.println("Welkom bij 'T Restaurantje. Hier kunt u een reservering maken.");

        String naamGast = vraagString("Voer een voor- en achternaam in: ");
        Date beginDatum = datumInvoeren();
        int aantalGasten = vraagInt("Voor hoeveel mensen wilt u reserveren?", true);

        // Check beschikbaarheid methode moet hier

        short leeftijdGast = vraagShort("Wat is uw leeftijd?", true);
        String emailadresGast = vraagString("Wat is uw e-mailadres?");
        String telefoonnummerGast = vraagString("Tot slot, wat is uw telefoonnummer?");

        Persoon p1 = new Persoon(naamGast, leeftijdGast, emailadresGast, telefoonnummerGast);

        System.out.println("");
        System.out.println("Overzicht van gegevens:");
        System.out.println("naam: " + p1.getNaam());
        System.out.println("Leeftijd: " + p1.getLeeftijd());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Telefoonnummer: " + p1.getTelefoonnummer());
        System.out.println("Datum en Tijd: " + beginDatum);
        System.out.println("Uw groep bevat: " + aantalGasten + " personen.");
    }

}
