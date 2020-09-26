package CoronaRestaurantApp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservering {

    private String naamReservering;
    private int aantalGasten;
    private LocalDateTime datumVan;
    private LocalDateTime datumTot;

    Reservering(String naamReservering, int aantalGasten, LocalDateTime datumVan, LocalDateTime datumTot){
        setNaamReservering(naamReservering);
        setAantalGasten(aantalGasten);
        setDatumVan(datumVan);
        setDatumTot(datumTot);
    }


    public void setNaamReservering(String naamReservering) {
        this.naamReservering = naamReservering;
    }

    public String getNaamReservering() {
        return naamReservering;
    }

    public void setAantalGasten(int aantalGasten) {
        this.aantalGasten = aantalGasten;
    }

    public int getAantalGasten() {
        return aantalGasten;
    }

    public void setDatumVan(LocalDateTime datumVan) {
        this.datumVan = datumVan;
    }

    public LocalDateTime getDatumVan() {
        return datumVan;
    }

    public void setDatumTot(LocalDateTime datumTot) {
        this.datumTot = datumTot;
    }

    public LocalDateTime getDatumTot() {
        return datumTot;
    }
}
