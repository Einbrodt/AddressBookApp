import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Klasse für das Adressbuch, mit Nutzung von "Kontakt" als Objekt
 *
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
public class AddressBook {

    /**
     * HashSet für die Kontakte
     */
    private static HashSet<Contact> contactHashSet;

    /**
     * Konstruktor für das Adressbuch
     */
    public AddressBook() {
        contactHashSet = new HashSet<>();
    }

    /**
     * Getter für das HashSet
     * @return contactHashSet
     */
    public static HashSet<Contact> getContactHashSet() {
        return contactHashSet;
    }

    /**
     * Methode für das Hinzufügen eines Kontakts
     * @param contact Kontakt
     */
    public static void addContact(Contact contact) {
        contactHashSet.add(contact);
    }

    /**
    * Methode für das Löschen eines Kontakts
     * @param contact Kontakt
     */
    public static void delContact(Contact contact) {
        contactHashSet.remove(contact);
    }

    /**
     * Methode für das Löschen aller Einträge
     */
    public static void clearContacts() {
        contactHashSet.clear();
    }

    /**
     * Methode für die Suche nach einem Namen, oder einer Telefonnummer
     * @param input Eingabe des Nutzers, wird zu lowercase konvertiert, um Teilübereinstimmungen zu ermöglichen
     * @return Liste mit den gefundenen Kontakten
     */
    public static List<Contact> findBy(String input) {
        List<Contact> list = new LinkedList<>();
        if (input == null) return list;
        input = input.toLowerCase();
        for (Contact contact : contactHashSet) {
            Phone getP = contact.getPhone();
            if (contact.getFirstName().toLowerCase().contains(input)
                    || contact.getLastName().toLowerCase().contains(input)
                    || getP != null
                    && (getP.getNumber().contains(input)
                    || getP.getAreaCode().contains(input)
                    || getP.getPrefix().contains(input))
            )
                list.add(contact);
        }
        return list;
    }

    /**
     * toString Methode für das Adressbuch
     */
    public String toString() {
        return "AddressBook{" +
                "contactHashSet=" + contactHashSet +
                '}';
    }
}

