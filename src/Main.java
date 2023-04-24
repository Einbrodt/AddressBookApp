public class Main {
    /**
     * Main-Klasse, für die Ausführung des Programms
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */

    /**
     * Main-Methode, für die Ausführung des Programms
     * - Beispielkontakte werden zum Adressbuch hinzugefügt
     * - während exit = false, werden die Methoden showList() und inputHandler() aufgerufen
     * -> wenn der Nutzer "exit" eingibt, dann stoppt das Programm.
     *
     * @author Nicole EINBRODT
     * @author Vanessa ERDMANN
     */
    public static void main(String[] args) {
        Eingabe.addKontakte();
        boolean exit = false;
        while (!exit) {
            Eingabe.showList();
            exit = Eingabe.inputHandler();
        }
    }
}
