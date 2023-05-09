/**
 * Main-Klasse, für die Ausführung des Programms
 *
 * @author Nicole EINBRODT
 * @author Vanessa ERDMANN
 */
public class Main {


    /**
     * Main-Methode, für die Ausführung des Programms
     * - Beispielkontakte werden zum Adressbuch hinzugefügt
     * - während exit = false, werden die Methoden showList() und showCommands() aufgerufen
     * -> wenn der Nutzer "exit" eingibt, dann stoppt das Programm.
     * @param args Argumente
     */
    public static void main(String[] args) {
        Test.addContacts();
        boolean exit = false;
        while (!exit) {
            Input.showList();
            Input.showCommands();
            exit = Input.inputHandler();
        }
    }
}
