import java.util.Arrays;

public class Board {
    private ValidMoveChecker ValidMoveChecker;
    private EndStateChecker EndStateChecker;
    private int[] FieldStates;
    public int PlayerTurn; // 1 = Player_1_X, 2 = Player_2_O
    public int EndState; // 0 = Continue, 1 = Player_1_X Win, 2 = Player_2_O Win, 3 = Unentschieden

    // Constructor
    public Board() {
        ValidMoveChecker = new ValidMoveChecker();
        EndStateChecker = new EndStateChecker();
        FieldStates = new int[9];
        PlayerTurn = 1;
        EndState = 0;
    }

    /**
     * validiert einen Zug, setzt das Feld und gibt true zurück, wenn alles geklappt hat
     * @param position gibt an wo ein Spieler einen Spielstein setzt
     * @param state gibt an welcher Spielstein gesetzt wird
     * @return gibt die Info welcher Spieler als nächstes dran ist
     */
    public boolean setFieldState(int position, int state) {
        if (ValidMoveChecker.Check(FieldStates, position)) {
            FieldStates[position-1] = state;
            EndState = EndStateChecker.Check(FieldStates);
            if (PlayerTurn == 1) {
                PlayerTurn = 2;
            } else {
                PlayerTurn = 1;
            }
            return true;
        }
        return false;
    }

    /**
     * gibt das Board in einer lesbaren Form in der Console aus
     */
    public void renderBoard() {
        System.out.println("---------------------------");
        for (int i = 0; i < 9; i++) {
            int position = i + 1;
            String FieldSymbol = switch (FieldStates[i]) {
                case 1 -> "X";
                case 2 -> "O";
                default -> Integer.toString(position);
            };
            System.out.print("|   "+ FieldSymbol +"   |");
            if ((position) % 3 == 0) {
                System.out.println();
                System.out.println("---------------------------");
            }
        }
    }

    /**
     * setzt das Board auf den Anfangszustand zurück
     */
    public void resetBoard() {
        Arrays.fill(FieldStates, 0);
    }
}



