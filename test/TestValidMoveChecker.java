import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidMoveChecker {

    @Test
    public void testValidMove(){
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {0, 1, 2, 0, 2, 1, 0, 0, 0};
        assertTrue(checker.check(fieldStates,1));
    }

    @Test
    public void testInvalidPosition(){
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertFalse(checker.check(fieldStates,10));
    }

    @Test
    public void testTakenPosition(){
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {1, 2, 2, 1, 2, 1, 2, 1, 1};
        assertFalse(checker.check(fieldStates,1));
    }

    @Test
    public void testFieldZeroIsInvalid() {
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = new int[9];
        assertFalse(checker.check(fieldStates, 0));
    }

    @Test
    public void testLastFieldValid() {
        ValidMoveChecker checker = new ValidMoveChecker();
        int[] fieldStates = {1,1,1,1,1,1,1,1,0};
        assertTrue(checker.check(fieldStates, 9));
    }

    @Test
    public void testNullArrayInvalid() {
        ValidMoveChecker checker = new ValidMoveChecker();
        assertFalse(checker.check(null, 1));
    }
}
