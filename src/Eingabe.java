import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Eingabe {
    /**
     * Klasse für die Eingabe und Ausgabe
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    /**
     * Methode für das Anzeigen des Adressnbuchs mit einer zugehörigen Zahl,
     * um ein einfaches Löschen zu erlauben.
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public static void showList() {

        LinkedList<Kontakt> list = Adressbuch.kontaktList;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
        System.out.println("--------------------");
        System.out.println("Delete an entry by entering a valid number. " +
                "\nWrite clear to delete every entry. " +
                "\nWrite find + name to find a name?" +
                "\nWrite exit to stop.");
    }
    /**
     * Methode für die Eingabe:
     * - exit: beendet das Programm
     * - clear: löscht alle Einträge
     * - Zahl: löscht den Eintrag mit der entsprechenden Zahl
     * - find Name: sucht nach dem Namen und gibt alle Einträge mit diesem Namen aus
     * - restore: fügt die Kontakte wieder hinzu -> nur zum Debuggen gedacht,
     *            daher nicht als möglicher Command in der Ausgabe aufgeführt
     *
     * - ansonsten gibt es eine Fehlermeldung
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public static boolean inputHandler() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine().trim().toLowerCase();
        if (input.equals("exit")) {
            return true;
        } else if (input.equals("clear")) {
            Adressbuch.clearKontakt();
        } else if (Character.isDigit(input.charAt(0))) {
            Adressbuch.delKontakt(Integer.parseInt(input));
        } else if (input.startsWith("find")) {
            String name = input.substring(5).trim();
            List<Kontakt> found = Adressbuch.findByName(name);
            for (Kontakt k : found) {
                System.out.println(k);
                System.out.println("--------------------");
            }
        } else if (input.equals("restore")) {
            addKontakte();
        } else {
            System.out.println("Invalid input.");
        }
        return false;
    }
    /**
     * Fügt Beispielkontakte hinzu.
     *
     */
    public static void addKontakte() {
        Adresse eins = new Adresse("Blümchenweg", "73172", "Hallo Stadt", "YourLand");
        Adresse zwei = new Adresse("Torweg", "37132", "Hamburg", "Deutschland");
        Telefon t = new Telefon("49", "1511", "9430320");
        Telefon t2 = new Telefon("37", "1512", "4317321");
        Kontakt a = new Kontakt("Vanessa", "Erdmann", eins, t);
        Kontakt b = new Kontakt("Nicole", "Einbrodt", eins, t);
        Kontakt c = new Kontakt("Vanessa", "Kleinert", zwei, t2);
        Adressbuch.addKontakt(a);
        Adressbuch.addKontakt(b);
        Adressbuch.addKontakt(c);
    }

}
