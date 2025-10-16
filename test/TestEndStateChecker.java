import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEndStateChecker {

    @Test
    public void testContinue(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {0, 1, 0, 1, 0, 2, 1, 2, 0};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(0, result, "Wrong Output");
    }

    @Test
    public void testContinue2(){
        EndStateChecker t0 = new EndStateChecker();
        int[] state0 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = t0.CheckForEndState(state0);
        Assertions.assertEquals(0, result, "Wrong Output");
    }
}
