package CoronaRestaurantApp;

public class Persoon {
    // Eigenschappen
    private String naam;
    private short leeftijd;
    private String email;
    private String telefoonnummer;
    private boolean heeftCorona = false;

    // Constanten
    private final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private final String TELEFOONNUMMER_REGEX = "^(0|\\+)(\\d*)$";

    public Persoon(String naam, short leeftijd, String email, String telefoonnummer) throws Exception {
        setNaam(naam);
        setLeeftijd(leeftijd);
        setEmail(email);
        setTelefoonnummer(telefoonnummer);
    }

    // Setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLeeftijd(short leeftijd) throws Exception {
        if (leeftijd >= 0) {
            this.leeftijd = leeftijd;
        } else {
            throw new Exception("Leeftijd kan niet negatief zijn.");
        }
    }

    public void setEmail(String email) throws Exception {
        if (email.matches(EMAIL_REGEX)) {
            this.email = email;
        } else {
            throw new Exception("Geen correct e-mailadres.");
        }
    }

    public void setTelefoonnummer(String telefoonnummer) throws Exception {
        if (telefoonnummer.matches(TELEFOONNUMMER_REGEX)) {
            this.telefoonnummer = telefoonnummer;
        } else {
            throw new Exception("Geen correct telefoonnummer.");
        }
    }

    public void setHeeftCorona(boolean heeftCorona) {
        this.heeftCorona = heeftCorona;
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

    public boolean heeftCorona() {
        return heeftCorona;
    }

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
