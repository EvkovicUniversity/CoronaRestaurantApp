package CoronaRestaurantApp;

public class Restaurant {
    // Eigenschappen
    private String naam;
    private Persoon contactpersoon;
    private short aantalTafels;

    public Restaurant(String naam, Persoon contactpersoon, short aantalTafels) {
        setNaam(naam);
        setContactpersoon(contactpersoon);
        setAantalTafels(aantalTafels);
    }

    // Setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setContactpersoon(Persoon contactpersoon) {
        this.contactpersoon = contactpersoon;
    }

    public void setAantalTafels(short aantalTafels) {
        this.aantalTafels = aantalTafels;
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
