import java.util.Arrays;

public class Board {
    private Checker Checker;
    private EndStateChecker EndStateChecker;
    private int[] FieldStates;
    public int PlayerTurn; // 1 = Player_1_X, 2 = Player_2_O
    public int EndState; // 0 = Continue, 1 = Player_1_X Win, 2 = Player_2_O Win, 3 = Unentschieden

    // Constructor
    public Board() {
        Checker = new Checker();
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
        if (Checker.CheckValidMove(FieldStates, position)) {
            FieldStates[position] = state;
            EndState = EndStateChecker.CheckForEndState(FieldStates);
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
        String finalMessage = "";
        int counter = 1;

        for (int field : FieldStates) {
            if (field == 0) {
                finalMessage += "|–––––|";
                counter += 1;
                if (counter == 3) {
                    System.out.println(finalMessage);
                    counter = 1;
                    finalMessage = "";
                }
            }
            else if (field == 1) {
                finalMessage += "|––X––|";
                counter += 1;
                if (counter == 3) {
                    System.out.println(finalMessage);
                    counter = 1;
                    finalMessage = "";
                }
            }
            else if (field == 2) {
                finalMessage += "|––O––|";
                counter += 1;
                    if (counter == 3) {
                        System.out.println(finalMessage);
                        counter = 1;
                        finalMessage = "";
                    }
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
