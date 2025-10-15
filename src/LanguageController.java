public class LanguageController {
    private int LanguageSetting;
    private final String[] EnglishMessages;
    private final String[] GermanMessages;

    public LanguageController() {
        this.EnglishMessages = new String[]{
                ""
        };
        this.GermanMessages = new String[]{
                ""
        };
    }
    //Sets the Languge Setting with an Int
    public void setLanguageSetting(int languageSetting) {
        this.LanguageSetting = languageSetting;
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
