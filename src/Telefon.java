public class Telefon {
    /**
     * Klasse für Telefonnummern
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    private String prefix;
    private String nummer;
    private String vorwahl;
    /**
     * Konstruktor für Telefonnummern
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public Telefon(String vorwahl, String prefix, String nummer) {
        this.vorwahl = vorwahl;
        this.prefix = prefix;
        this.nummer = nummer;
    }


    /**
     * toString-Methode für Telefonnummern
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public String toString() {
        return "Telefon{" +
                "vorwahl='" + vorwahl + '\'' +
                ", prefix='" + prefix + '\'' +
                ", nummer='" + nummer + '\'' +
                '}';
    }
    /**
     * Getter für Telefonnummern
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public String getVorwahl() {
        return vorwahl;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNummer() {
        return nummer;
    }



}
