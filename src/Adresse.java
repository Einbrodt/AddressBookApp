public class Adresse {
    /**
     * Klasse für die Adresse
     *
     */
    private String straße;
    private String plz;
    private String stadt;
    private String land;

    /**
     * Konstruktor für die Adresse
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public Adresse(String straße, String plz, String stadt, String land) {
        this.straße = straße;
        this.plz = plz;
        this.stadt = stadt;
        this.land = land;
    }

    /** Getter für die Adresse
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public String getStraße() {
        return straße;
    }

    public String getPlz() {
        return plz;
    }

    public String getStadt() {
        return stadt;
    }

    public String getLand() {
        return land;
    }
    /** toString-Methode für die Adresse
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public String toString() {
        return "Adresse{" +
                "straße='" + straße + '\'' +
                ", plz='" + plz + '\'' +
                ", stadt='" + stadt + '\'' +
                ", land='" + land + '\'' +
                '}';
    }
}
