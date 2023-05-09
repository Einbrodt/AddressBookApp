/**
 * Klasse Entry für ein "Thema" der Adresse oder der Telefonnummer
 * z.B. geschäftlich, oder privat
 */
public class Entry {
    /**
     * Thema
     */
    protected String topic;
    /**
     * Konstruktor für Entry
     * @param topic Thema
     */

    public Entry(String topic) {
        this.topic = topic;
    }

    /**
     * Getter für das Thema
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * toString-Methode für Entry
     * @return String
     */
    public String toString() {
        return "Entry{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
