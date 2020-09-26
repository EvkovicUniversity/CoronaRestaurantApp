package AppTests;

import CoronaRestaurantApp.Persoon;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class InputTests {

    @Test
    // Test of de email-check werkt met eigen invoer
    void testEmail() throws Exception {
        Scanner input = new Scanner(System.in);
        String p1Naam = "Jan Joppies";
        short p1Leeftijd = 22;
        String p1Email = input.next();
        String p1Telefoonnummer = "0612345678";
        Persoon p1 = new Persoon(p1Naam, p1Leeftijd, p1Email, p1Telefoonnummer);
    }

    @Test
    // Test of de telefoonnummer-check werkt met eigen invoer
    void testTelefoonnummer() throws Exception {
        Scanner input = new Scanner(System.in);
        String p1Naam = "Jan Joppies";
        short p1Leeftijd = 22;
        String p1Email = "j.joppies@rocketmail.nl";
        String p1Telefoonnummer = input.next();
        Persoon p1 = new Persoon(p1Naam, p1Leeftijd, p1Email, p1Telefoonnummer);
    }

}