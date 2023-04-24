/**
 * Klasse für Kontakt, nutzt Telefon und Adresse als Objekte
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
public class Kontakt {
    private String vorname;

    private String nachname;


    private Adresse adresse;
    private Telefon telefon;

    public Kontakt(String vorname, String nachname, Adresse adresse, Telefon telefon) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.telefon = telefon;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    /**
     * Konstruktor
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    @Override
    public String toString() {
        return "Kontakt{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", adresse=" + adresse +
                ", telefon=" + telefon +
                '}';
    }
}
