import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestUserInput {

    @Test
    public void testNumberInput(){
        UserInput userInput = new UserInput();
        String input = "6";
        assertEquals(6, userInput.checkInput(input));
    }

    @Test
    public void testNonNumberInput(){
        UserInput userInput = new UserInput();
        String input = "aoihig";
        assertTrue(userInput.checkInput(input) < 0);
    }

    @Test
    public void testLargeNumberInput(){
        UserInput userInput = new UserInput();
        String input = "111111111";
        assertTrue(userInput.checkInput(input) < 0);
    }
}
