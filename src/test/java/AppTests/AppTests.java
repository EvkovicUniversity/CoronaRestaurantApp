package AppTests;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class AppTests {

    @Test
    void maakEenReservering(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij 'T Restaurantje. Hier kunt u een reservering maken.");
        System.out.println("Voer een voor- en achternaam in: ");

        String opgegevenNaam = scanner.nextLine();
        System.out.println("de opgegeven naam luidt: " + opgegevenNaam);

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
