/**
 * Diese Klasse ist zuständig für die Abspeicherung sämtliche Nachrichten,
 * die je nach Spielzustand oder Benutzer Eingabe ausgegeben werden.
 * Das Datenfeld "languageSetting" nimmt Werte 1 und 2 auf wo:
 *  1 = English
 *  2 = Deutsch
 * entspricht.
 */
public class LanguageController {
    private int languageSetting = 1;
    private final String[] EnglishMessages;
    private final String[] GermanMessages;

    /**
     * Der Instanz dieser Klasse wird erzeugt.
     */
    public LanguageController() {
        this.EnglishMessages = new String[]{
                "X's Turn",
                "O's Turn",
                "X has won the Game!",
                "O has won the Game!",
                "Tie!",
                "This Move is not a valid Position",
                "This Position has already been taken",
                "This is not a valid Input",
        };
        this.GermanMessages = new String[]{
                "X ist am Zug",
                "O ist am Zug",
                "X hat das Spiel gewonnen!",
                "O hat das Spiel gewonnen!",
                "Unentschieden!",
                "Dieser Zug ist nicht eine gültige Position",
                "Diese Postion wurde bereits eingenommen",
                "Diese ist keine gültige Eingabe"
        };
    }

    /**
     * Die Sprache wird durch diese Methode und den Parameter gesetzt, bzw. verändert.
     * @param languageSetting gibt an, welche Sprache languageSetting nun annehmen soll.
     * @return gibt an, ob eine Sprache Änderung durchgeführt werden darf.
     *  true: Veränderung erlaubt
     *  false: Veränderung nicht erlaubt. Eingabe ungültig.
     */
    public boolean setLanguageSetting(int languageSetting) {
        if (languageSetting == 1 || languageSetting == 2) {
            this.languageSetting = languageSetting;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Holt eine Nachricht von der per Parameter entschiedene Index.
     * Gewählt wird entweder EnglishMessages oder DeutschMessages gemäss die aktuelle languageSetting
     * @param messageIndex Spezifiziert die gewünschte Nachricht
     * @return Gibt die Nachricht zurück
     */
    public String getMessage(int messageIndex){
        return switch (languageSetting) {
            case 1 -> EnglishMessages[messageIndex];
            case 2 -> GermanMessages[messageIndex];
            default -> "";
        };
    }
}
