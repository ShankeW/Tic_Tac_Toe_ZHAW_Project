import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLanguageController {

    @Test
    @DisplayName("Test if the Language setting is properly changed")
    public void testLanguageSwitching() {
        LanguageController languageController = new LanguageController();
        languageController.setLanguageSetting(1);
        assertEquals("X's Turn", languageController.getMessage(0));
        languageController.setLanguageSetting(2);
        assertEquals("X ist am Zug", languageController.getMessage(0));
    }

    @Test
    @DisplayName("Test if Language ist valid")
    public void testValidLanguage() {
        LanguageController languageController = new LanguageController();
        assertTrue(languageController.setLanguageSetting(1));
        assertFalse(languageController.setLanguageSetting(7));
    }

    @Test
    @DisplayName("Test if Message is correct")
    public void testCorrectMessage() {
        LanguageController languageController = new LanguageController();
        languageController.setLanguageSetting(1);
        String[] messageList = new String[]{
                "X's Turn",
                "O's Turn",
                "X has won the Game!",
                "O has won the Game!",
                "Tie!",
                "This Move is not a valid Position",
                "This Position has already been taken"
        };
        for (int i = 0; i < messageList.length; i++) {
            assertEquals(messageList[i], languageController.getMessage(i));
        }
    }
}
