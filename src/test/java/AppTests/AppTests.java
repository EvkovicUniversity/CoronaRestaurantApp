package AppTests;

import CoronaRestaurantApp.Persoon;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class AppTests {

    @Test
    void maakEenReservering(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij 'T Restaurantje. Hier kunt u een reservering maken.");
        System.out.println("Voer een voor- en achternaam in: ");
        String naamGast = scanner.nextLine();

        System.out.println("Wat is uw leeftijd?");
        String leeftijdGast = scanner.nextLine();

        System.out.println("Voor hoeveel mensen wilt u reserveren?");
        String aantalGasten = scanner.nextLine();

        System.out.println("Tot slot, wat is uw emailadres?");
        String emailadres = scanner.nextLine();

        System.out.println("overzicht van gegevens:");
        System.out.println(naamGast);
        System.out.println(leeftijdGast);
        System.out.println(aantalGasten);
        System.out.println(emailadres);



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
