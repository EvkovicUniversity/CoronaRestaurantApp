package CoronaRestaurantApp;

public class Persoon {

    private String naam;
    private short leeftijd;
    private String email;
    private String telefoonnummer;
    private boolean heefCorona = false;

    public Persoon(String naam, short leeftijd, String email, String telefoonnummer) {
        setNaam(naam);
        setLeeftijd(leeftijd);
        setEmail(email);
        setTelefoonnummer(telefoonnummer);
    }

    // Setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLeeftijd(short leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public void setHeefCorona(boolean heefCorona) {
        this.heefCorona = heefCorona;
    }

    // Getters
    public String getNaam() {
        return naam;
    }

    public short getLeeftijd() {
        return leeftijd;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public boolean isHeefCorona() {
        return heefCorona;
    }

}
