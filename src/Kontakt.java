// TODO: Attribute Vorname, Nachname, Straße, Plz, Stadt, Land mit Datentypen -> private Attribute
// TODO: Konstruktor, der alle Attribute initialisiert
// TOOD: toString, welche einen Kontakt als String ausgibt

public class Kontakt {
    private String vorname;
    private String nachname;
    private String straße;
    private String hausnummer;
    private String plz;
    private String stadt;
    private String land;

    public Kontakt(String vorname, String nachname, String straße, String hausnummer, String plz, String stadt, String land) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
        this.land = land;
    }

    public String toString() {
        return "Kontakt{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", straße='" + straße + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", plz='" + plz + '\'' +
                ", stadt='" + stadt + '\'' +
                ", land='" + land + '\'' +
                '}';
    }
}
