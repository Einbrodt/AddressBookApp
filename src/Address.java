/**
 * Klasse für die Adresse, die von Entry erbt
 *
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
class Address extends Entry {
    private String street;
    private String zipcode;
    private String city;
    private String country;

    /**
     * Konstruktor für die Adresse
     * @param topic Thema, geerbt von Entry
     * @param street Straße
     * @param zipcode Postleitzahl
     * @param city Stadt
     * @param country Land
     */
    public Address(String topic, String street, String zipcode, String city, String country) {
        super(topic);
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }

    /**
     * Getter für die Straße
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Getter für die Postleitzahl
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }
    /**
     * Getter für die Stadt
     * @return city
     */
    public String getCity() {
        return city;
    }
    /**
     * Getter für das Land
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Getter für das Thema, geerbt von Entry
     * @return topic
     */
    public String getTopic() {
        return super.getTopic();
    }


    /**
     * toString-Methode für die Adresse
     */
    public String toString() {
        return "Address{" +
                "topic='" + super.getTopic() + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
