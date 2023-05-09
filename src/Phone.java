/**
 * Klasse für Telefonnummern, erbt von Entry
 *
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
class Phone extends Entry {
    private String prefix;
    private String number;
    private String areaCode;

    /**
     * Konstruktor für Telefonnummern
     *
     * @param topic Thema, geerbt von Entry
     * @param areaCode Ländervorwahl
     * @param prefix Vorwahl
     * @param number Nummer
     */
    public Phone(String topic, String areaCode, String prefix, String number) {
        super(topic);
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
    }


    /**
     * Getter für die Ländervorwahl
     *
     * @return areaCode
     */

    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Getter für die Vorwahl
     *
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Getter für die Nummer
     *
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Getter für das Thema, geerbt von Entry
     *
     * @return topic
     */
    public String getTopic() {
        return super.getTopic();
    }

    /**
     * toString-Methode für Telefonnummer
     *
     * @return String
     */
    public String toString() {
        return "phone{" +
                "topic='" + super.getTopic() + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", prefix='" + prefix + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


}
