public class LanguageController {
    private int languageSetting = 1;
    private final String[] EnglishMessages;
    private final String[] GermanMessages;

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
    //Sets the Language Setting with an Int
    public boolean setLanguageSetting(int languageSetting) {
        if (languageSetting == 1 || languageSetting == 2) {
            this.languageSetting = languageSetting;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Holt eine Nachtricht von der per Parameter entschiedene Index.
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
