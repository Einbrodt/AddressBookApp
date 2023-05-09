/**
 * Testklasse für das Hinzufügen von Daten zum Adressbuch.
 */
public class Test {
    /**
     * Fügt Beispieldaten hinzu.
     *
     */
    protected static void addContacts() {
        Address eins = new Address("Privat", "Blümchenweg", "73172", "Hallo Stadt", "YourLand");
        Address zwei = new Address("Geschäftlich", "Torweg", "37132", "Hamburg", "Deutschland");
        Phone t = new Phone("Privat", "49", "1511", "9430320");
        Phone t2 = new Phone("Geschäftlich", "37", "1512", "4317321");
        Contact a = new Contact("Vanessa", "Erdmann", eins, t);
        Contact b = new Contact("Nicole", "Einbrodt", eins, t);
        Contact c = new Contact("Vanessa", "Kleinert", zwei, t2);
        Contact d = new Contact("Sandra", "Einbrodt");
        Contact e = new Contact("Stefan", "Rosenbaum", eins);
        Contact f = new Contact("Julia", "Einbrodt", t);
        AddressBook.addContact(a);
        AddressBook.addContact(b);
        AddressBook.addContact(c);
        AddressBook.addContact(d);
        AddressBook.addContact(e);
        AddressBook.addContact(f);
        Contact.addAddress(eins);
        Contact.addPhone(t);
        Contact.addAddress(zwei);
        Contact.addPhone(t2);
    }
}
