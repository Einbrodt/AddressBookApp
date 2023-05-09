import java.util.List;
import java.util.Scanner;
/**
 * Klasse für die Eingabe und Ausgabe
 *
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
 public class Input {

    /**
     * Methode für eine etwas übersichtlichere Ausgabe des Adressbuchs
     * - geht alle Einträge durch und gibt diese aus
     */
    public static void showList() {
        for (Contact contact : AddressBook.getContactHashSet()) {
            System.out.println(contact + "\n");
        }
    }

    /**
     * Methode für die Anzeige der möglichen Eingaben des Nutzers
     */
    public static void showCommands() {
        System.out.println("--------------------");
        System.out.println("Write delete + name to delete an entry by name. " +
                "\nWrite clear to delete every entry. " +
                "\nWrite find + a name, or a phone number to find a contact." +
                "\nWrite exit to stop."
        );
    }

    /**
     * Methode für die Eingabe:
     * - exit: beendet das Programm
     * - clear: löscht alle Einträge
     * - delete + Zahl: löscht den Eintrag mit der entsprechenden Zahl
     * - find + input: sucht nach einem Namen, oder einer Telefonnummer und gibt alle Einträge aus. Schließt Teilübereinstimmungen ein.
     * - show: wird nur nach einem find angezeigt, um den User die Ansicht auf das gesamte Adressbuch zu ermöglichen
     * - restore: fügt die Kontakte wieder hinzu -> nur zum Debuggen gedacht,
     * daher nicht als möglicher Command in der Ausgabe aufgeführt
     * - ansonsten gibt es eine Fehlermeldung
     *
     * @return true, wenn der Nutzer "exit" eingegeben hat
     */
    public static boolean inputHandler() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine().trim().toLowerCase();
        if (input.equals("exit")) {
            return true;
        } else if (input.equals("clear")) {
            AddressBook.clearContacts();
        } else if (input.startsWith("delete")) {
            String name = input.substring(6).trim();
            Contact contact = AddressBook.findBy(name).get(0);
            AddressBook.delContact(contact);
        } else if (input.startsWith("find")) {
            searchContacts(input);
            reader.nextLine();
        } else if (input.equals("restore")) {
            Test.addContacts();
        } else if (input.equals("show")) {
            showList();
        } else {
            System.out.println("Invalid input.");
        }
        return false;
    }

    /**
     * Methode für die Eingabe:
     * - find + input: sucht nach einem Namen, oder einer Telefonnummer und gibt alle Einträge aus. Schließt Teilüberstimmungen ein.
     *
     * @param input Eingabe des Users
     */
    public static void searchContacts(String input) {
        String searchFor = input.substring(5).trim();
        List<Contact> found = AddressBook.findBy(searchFor);
        for (Contact contact : found) {
            System.out.println(contact + "\n");
        }
        System.out.println("Found " + found.size() + " entries. \n");
        showCommands();
        System.out.println("Write show to view the entire addressbook.");
    }
}
