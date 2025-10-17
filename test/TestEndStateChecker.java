import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestEndStateChecker {

    @Test
    @DisplayName("Test if 0's can be detected")
    public void testContinue(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {0, 1, 0, 1, 0, 2, 1, 2, 0};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(0, result, "Output should be 0");
    }

    @Test
    @DisplayName("Test if empty board can be detected")
    public void testContinue2(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(0, result, "Output should be 0");
    }

    @Test
    @DisplayName("Test win condition for raw")
    public void testWinConditionRaw(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {1, 1, 1, 2, 2, 1, 2, 1, 2};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(1, result, "Output should be 1");
    }

    @Test
    @DisplayName("Test win condition for column")
    public void testWinConditionColumn(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {1, 2, 1, 2, 2, 1, 1, 2, 2};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(2, result, "Output should be 2");
    }

    @Test
    @DisplayName("Test win condition for diagonal")
    public void testWinConditionDiagonal(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {1, 2, 1, 2, 1, 2, 2, 2, 1};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(1, result, "Output should be 1");
    }

    @Test
    @DisplayName("Test win condition with a few empty fields")
    public void testWinConditionWithEmptyFields0(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {1, 1, 1, 2, 2, 0, 0, 0, 0};
        int[] state1 = {2, 1, 0, 1, 2, 0, 0, 1, 2};

        int result = 0;
        result = t0.CheckForEndState(state0);
        Assertions.assertEquals(1, result, "Output should be 1");
        result = t0.CheckForEndState(state1);
        Assertions.assertEquals(2, result, "Output should be 2");
    }

    @Test
    @DisplayName("Test tie condition")
    public void testTieCondition(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {2, 1, 1, 1, 2, 2, 2, 1, 1};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(3, result, "Output should be 3");
    }
}
