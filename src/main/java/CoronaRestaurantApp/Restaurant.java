package CoronaRestaurantApp;

public class Restaurant {
    // Eigenschappen
    private String naam;
    private Persoon contactpersoon;
    private short aantalTafels;

    public Restaurant(String naam, Persoon contactpersoon, short aantalTafels) throws Exception {
        setNaam(naam);
        setContactpersoon(contactpersoon);
        setAantalTafels(aantalTafels);
    }

    // Setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setContactpersoon(Persoon contactpersoon) throws Exception {
        if (contactpersoon != null) {
            this.contactpersoon = contactpersoon;
        } else {
            throw new Exception("Er moet een contactpersoon worden opgegeven.");
        }
    }

    public void setAantalTafels(short aantalTafels) throws Exception {
        if (aantalTafels >= 0) {
            this.aantalTafels = aantalTafels;
        } else {
            throw new Exception("Je kan geen negatief aantal tafels hebben.");
        }
    }

    // Getters
    public String getNaam() {
        return naam;
    }

    public Persoon getContactpersoon() {
        return contactpersoon;
    }

    public short getAantalTafels() {
        return aantalTafels;
    }
}
