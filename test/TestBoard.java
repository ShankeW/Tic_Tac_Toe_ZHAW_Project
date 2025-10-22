import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBoard {
    @Test
    public void testBoardRestart(){
        Board board = new Board();
        board.setFieldState(1,1);
        board.setFieldState(4,2);
        board.setFieldState(2,1);
        board.setFieldState(5,2);
        board.setFieldState(3,1);

        assertEquals(1,board.endState);

        board.resetBoard();

        assertEquals(0, board.endState);
    }
}
