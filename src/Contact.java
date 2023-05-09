import java.util.LinkedList;
import java.util.List;

/**
 * Klasse für Kontakt, nutzt Telefon und Adresse als Objekte
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
public class Contact {
    private String firstName;
    private static List<Address> addressList = new LinkedList<>();
    private static List<Phone> phoneList = new LinkedList<>();
    private String lastName;
    private Address address;
    private Phone phone;

    /**
     * Konstruktur für Kontakt mit Telefon und Adresse
     * @param firstName Vorname
     * @param lastName Nachname
     * @param address Adresse
     * @param phone Telefonnummer
     */

    public Contact(String firstName, String lastName, Address address, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }
    /**
     * Konstruktor für Kontakt ohne Telefon
     * @param firstName Vorname
     * @param lastName Nachname
     * @param address Adresse
     */

    public Contact(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    /**
     * Konstruktor für Kontakt ohne Adresse
     * @param firstName Vorname
     * @param lastName Nachname
     * @param phone Telefonnummer
     */
    public Contact(String firstName, String lastName, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    /**
     * Konstruktor für Kontakt ohne Telefon und Adresse
     * @param firstName Vorname
     * @param lastName Nachname
     */
    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    /**
     * Getter für den Telefoneintrag
     * @return phone
     */

    public Phone getPhone() {
        return phone;
    }

    /**
     * Getter für die Telefonliste
     * @return phoneList
     */
    public List<Phone> getPhones() {
        return phoneList;
    }

    /**
     * Getter für den Vornamen des Kontakts
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Getter für den Nachnamen des Kontakts
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * checkt, ob eine Telefonnummer in der Telefonliste vorhanden ist
     * @return true, wenn Telefonnummer vorhanden
     */
    public boolean hasPhone() {
        for (Phone number : phoneList)
            if (phoneList.contains(number)) return true;
        return false;
    }

    /**
     * Fügt eine Telefonnummer zur Telefonliste hinzu
     * @param phone Telefonnummer
     */
    public static void addPhone(Phone phone) {
        phoneList.add(phone);
    }


    /**
     * Löscht eine Telefonnummer aus der Telefonliste
     * @param phone Telefonnummer
     */
    public void removePhone(Phone phone) {
        phoneList.remove(phone);
    }
    /**
     * Löscht alle Telefonnummern aus der Telefonliste
     */
    public void clearPhones() {
        phoneList.clear();
    }

    /**
     * Getter für die Adresse des Kontakts
     * @return address
     */
    public Address getAddress() {
        return address;
    }
    /**
     * Getter für die Adressen des Kontakts als Liste
     * @return addressList
     */
    public List<Address> getAddresses() {
        return addressList;
    }

    /**
     * checkt, ob eine Adresse in der Adressliste vorhanden ist
     * @return true, wenn Adresse vorhanden
     */
    public boolean hasAddress() {
        for (Address a : addressList)
            if (addressList.contains(a)) return true;
        return false;
    }

    /**
     * Fügt eine Adresse zur Adressliste hinzu
     * @param address Adresse
     */
    public static void addAddress(Address address) {
        addressList.add(address);
    }

    /**
     * Löscht eine Adresse aus der Adressliste
     * @param address Adresse
     */
    public void removeAddress(Address address) {
        addressList.remove(address);
    }

    /**
     * Löscht alle Adressen aus der Adressliste
     */
    public void clearAddress() {
        addressList.clear();
    }

    /**
     * toString-Methode für die Ausgabe der Kontakte
     */

    @Override
    public String toString() {
        return "Kontakt{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                '}';
    }
}
