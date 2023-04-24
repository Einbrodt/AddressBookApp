import java.util.LinkedList;
import java.util.List;

public class Adressbuch {
    /**
     * Klasse für das Adressbuch, mit Nutzung von "Kontakt" als Objekt
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    static LinkedList<Kontakt> kontaktList;
    private static Adressbuch adressbuch = new Adressbuch();

    /**
     * Getter für das Adressbuch
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public static Adressbuch getAdressbuch() {
        return adressbuch;
    }

    /** Konstruktor für das Adressbuch
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    private Adressbuch() {
        kontaktList = new LinkedList<>();
    }

    /** Getter für die Kontaktliste
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public static void addKontakt(Kontakt neuerKontakt) {
        kontaktList.add(neuerKontakt);
    }

    /**
     * bei der Auflistung showList() wird mit der 1 gestartet, obwohl das Objekt den index 0 besitzt.
     * Um die Löschung des richtigen Objekts zu erlauben, wird hier der index daher -1 gerechnet.
     *
     * @author Nicole EINBRODT
     */
    public static void delKontakt(int index) {
        kontaktList.remove(index - 1);
    }

    /**
     * Methode für das Löschen aller Einträge
     */
    public static void clearKontakt() {
        kontaktList.clear();
    }

    /** Methode für die Suche nach einem Namen
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public static List<Kontakt> findByName(String input) {
        List<Kontakt> list = new LinkedList<>();
        for (Kontakt kontakt : kontaktList) {
            if (kontakt.getVorname().equalsIgnoreCase(input) || kontakt.getNachname().equalsIgnoreCase(input))
                list.add(kontakt);
        }
        return list;
    }

    /** toString Methode
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public String toString() {
        return "Adressbuch{" +
                kontaktList +
                '}';
    }

}
