package AppTests;

import CoronaRestaurantApp.Persoon;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class AppTests {

    @Test
    void maakEenReservering(){
        Scanner naam = new Scanner(System.in);
        System.out.println("Welkom bij 'T Restaurantje. Hier kunt u een reservering maken.");
        System.out.println("Voer een voor- en achternaam in: ");
        String naamGast = naam.nextLine();

        Scanner leeftijd = new Scanner(System.in);
        System.out.println("Wat is uw leeftijd?");
        String leeftijdGast = leeftijd.nextLine();

        Scanner aantal = new Scanner(System.in);
        System.out.println("Voor hoeveel mensen wilt u reserveren?");
        String aantalGasten = aantal.nextLine();


        Scanner email = new Scanner(System.in);
        System.out.println("Tot slot, wat is uw emailadres?");
        String emailadres = email.nextLine();

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
