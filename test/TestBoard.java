import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBoard {
    @Test
    public void testBoardReset(){
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

    @Test
    public void testSetFieldStates(){
        Board board = new Board();
        assertTrue(board.setFieldState(1, 2));
    }

    @Test
    public void testSetFieldStatesWrongState(){
        Board board = new Board();
        assertFalse(board.setFieldState(1, 3));
    }

    @Test
    public void testSetFieldStatesWrongPosition(){
        Board board = new Board();
        assertFalse(board.setFieldState(10, 2));
    }
}
