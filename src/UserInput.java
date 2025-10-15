import java.util.Scanner;

/**
 * Die Klasse UserInput (Input Controller)
 * Rolle: Sorgt für die Spielereingaben und deren Parsing in Feldpositionen.
 * Wird durch die TicTacToe-Klasse aufgerufen.
 */

public class UserInput {
    /**
     * Konstruktor: Erstellt ein neues UserInput-Objekt.
     */
    public UserInput() {

    }
    /**
     * Liest die Spielereingabe aus der Konsole ein.
     * @return Gibt die vom Spieler eingegebene Zeile als String zurück.
     */
    public String getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    /**
     * Überprüft und parst die Eingabe in eine gültige Feldposition.
     * Entfernt alle nicht-numerischen Zeichen und wandelt den Rest in eine Zahl um.
     * @param input Die vom Spieler eingegebene Zeichenkette.
     * @return Gibt die geparste Zahl zurück (z. B. Feldnummer im Spielfeld).
     */
    public int checkInput (String input) {
            int zahl = Integer.parseInt(input.replaceAll("[^0-9]", ""));

            return zahl;
        }
}
