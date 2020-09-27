package CoronaRestaurantApp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTests {

    private Persoon testPersoon1 = new Persoon("Jan Joppies", (short) 22, "j.joppies@rocketmail.nl", "0612345678");

    public InputTests() throws Exception {
    }

    @Test
    // Test of de email-check werkt
    void testEmailNeg() {
        String[] foutieveMails = {
            "",
            "gewoongeenmailadres",
            "@",
            "jebent@bijna",
            "so@close.",
            // "goed@gedaan.zo"
        };

        for (String foutieveMail : foutieveMails) {
            assertThatThrownBy(() -> {
                Persoon p1 = new Persoon(testPersoon1.getNaam(), testPersoon1.getLeeftijd(), foutieveMail, testPersoon1.getTelefoonnummer());
            });
        }
    }

    @Test
    // Test of de telefoonnummer-check werkt
    void testTelefoonnummerNeg() {
        String[] foutieveNummers = {
                "",
                "letters",
                "$%&()=#",
                "6235465985",
                // "0632156888"
                // "+31625425155"
        };

        for (String foutiefNummer : foutieveNummers) {
            assertThatThrownBy(() -> {
                Persoon p1 = new Persoon(testPersoon1.getNaam(), testPersoon1.getLeeftijd(), testPersoon1.getEmail(), foutiefNummer);
            });
        }
    }

    @Test
    // Test of de contactpersoon-check een exception opgooit
    void testRestaurantNull() {
        String r1Naam = "Resto Enzo";

        assertThatThrownBy(() -> {
            Restaurant r1 = new Restaurant(r1Naam, null, (short) 20);
        }).hasMessage("Er moet een contactpersoon worden opgegeven.");
    }

}