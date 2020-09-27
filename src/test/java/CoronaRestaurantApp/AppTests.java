package CoronaRestaurantApp;

import org.junit.jupiter.api.Test;

import static CoronaRestaurantApp.Main.plaatsEenReservering;

public class AppTests {

    @Test
    void testReservering() throws Exception {
        Persoon contactpersoon = new Persoon("Harrie Hortus", (short) 52, "haho@hemail.org", "0625413544");
        Restaurant restaurant = new Restaurant("'t Restaurantje", contactpersoon, (short) 14);

        plaatsEenReservering(restaurant);
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
