// TODO: Attribut mit dem Typ "Kontakt" als Liste
// TODO: Konstruktor, welche sie als LinkedList initialisiert
// TODO: toString Methode - Kontakte als String
// TODO: void addKontakt(Kontakt neuerKontakt)
import java.util.LinkedList;
public class Adressbuch {
    static LinkedList<Kontakt> kontaktList;
    public Adressbuch() {
        this.kontaktList = new LinkedList<>();
    }

    public static void addKontakt(Kontakt neuerKontakt) {
        kontaktList.add(neuerKontakt);
    }
    public String toString() {
        return "Adressbuch{" +
                "" + kontaktList +
                '}';
    }

}
