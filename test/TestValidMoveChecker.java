import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidMoveChecker {

    @Test
    public void testValidMove(){
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {0, 1, 2, 0, 2, 1, 0, 0, 0};
        assertTrue(checker.Check(fieldStates,1));
    }

    @Test
    public void testInvalidPosition(){
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertFalse(checker.Check(fieldStates,10));
    }

    @Test
    public void testTakenPosition(){
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {1, 2, 2, 1, 2, 1, 2, 1, 1};
        assertFalse(checker.Check(fieldStates,1));
    }
}
