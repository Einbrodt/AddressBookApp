import java.util.LinkedList;

// TODO: Adressbuch, Kontakt implementieren
// TODO: Drei Kontakte erstellen lassen
public class Main {
    public static void main(String[] args) {
        Kontakt k = new Kontakt("Hans", "Peters", "Wakenitz", "12a","FY2PW","Blackpool","UK");
        Kontakt l = new Kontakt("Dieter", "Peters", "Wakenitz", "12a","FY2PW","Blackpool","UK");
        Kontakt m = new Kontakt("Georg", "Peters", "Wakenitz", "12a","FY2PW","Blackpool","UK");
        Adressbuch a = new Adressbuch();
        a.addKontakt(k);
        a.addKontakt(l);
        a.addKontakt(m);
        LinkedList<Kontakt> list = Adressbuch.kontaktList;
        for (Kontakt kontakt : list) System.out.println(kontakt);
    }
}