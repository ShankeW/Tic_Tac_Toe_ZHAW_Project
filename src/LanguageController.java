public class LanguageController {
    private int LanguageSetting = 1;
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
                "This Position has already been taken"
        };
        this.GermanMessages = new String[]{
                "X am Zug",
                "O am Zug",
                "X hat den Spiel gewonnen!",
                "O hat den Spiel gewonnen!",
                "Unentschieden!",
                "Diese Zug ist nicht eine valide Position",
                "Diese Postion ist schon genommen"
        };
    }
    //Sets the Language Setting with an Int
    public boolean setLanguageSetting(int languageSetting) {
        if (languageSetting == 1 || languageSetting == 2) {
            this.LanguageSetting = languageSetting;
            return true;
        } else {
            return false;
        }
    }

    //Gets a Message in the Set Language by the given Int
    public String getMessage(int messageIndex){
        return switch (LanguageSetting) {
            case 1 -> EnglishMessages[messageIndex];
            case 2 -> GermanMessages[messageIndex];
            default -> "";
        };
    }
}
