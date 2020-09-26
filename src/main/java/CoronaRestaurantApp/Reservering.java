package CoronaRestaurantApp;

public class Reservering {

    private String naamReservering;
    private int aantalGasten;
    private long datumVan;
    private long datumTot;

    Reservering(String naamReservering, int aantalGasten, long datumVan, long datumTot){
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

    public void setDatumVan(long datumVan) {
        this.datumVan = datumVan;
    }

    public long getDatumVan() {
        return datumVan;
    }

    public void setDatumTot(long datumTot) {
        this.datumTot = datumTot;
    }

    public long getDatumTot() {
        return datumTot;
    }
}
