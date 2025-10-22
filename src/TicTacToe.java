/**
 * Die Klasse TicTacToe beinhaltet die ganze Spiellogik und koordiniert alle Komponenten des Spiels:
 * - das Board bzw. das Spielfeld
 * - die Spielereingaben
 * - die Spracheinstellung und die Sprachausgaben
 * Sie verwaltet den gesamten Spielablauf: Spielrunde, Eingaben und deren Prüfungen, Sprachauswahl
 * und ob Überprüfung, ob das Spiel einen Endzustand erreicht hat.
 */
public class TicTacToe {
    private final Board Board;
    private final UserInput UserInput;
    private final LanguageController LanguageController;

    /** Erstellt ein neues TicTacToe Spiel und initialisiert Board, UserInput und den LanguageController. */
    public TicTacToe(){
        this.Board = new Board();
        this.UserInput = new UserInput();
        this.LanguageController = new LanguageController();
    }

    /**
     * Führt eine Spielrunde durch:
     * - Der Spieler wählt zuerst eine Sprache
     * - Danach werden abwechselnd Spielzüge ausgeführt
     * - Bis ein Endzustand erreicht wird
     * - Nach jedem Spielzug wird das Spielfeld aktualisiert in der Konsole angezeigt
     *   und die Sprache kann neu gewählt werden.
     */
    private void playTurn(){

        while(Board.endState == 0) {

        sendMessage("Language / Sprache");
        sendMessage("1 - English");
        sendMessage("2 - Deutsch");

        String languageInput = UserInput.getInput();

        if (!languageInput.isEmpty()){
            int selection = UserInput.checkInput(languageInput);
            if(!LanguageController.setLanguageSetting(selection)){
                sendMessage("Invalid Language / Ungültige Sprache");
                continue;
            }
        }
        int currentPlayerTurn = Board.playerTurn;
        processPosition(currentPlayerTurn);
        Board.renderBoard();
        }

        // Hiermit wird der Endzustand ausgegeben (Sieg oder Unentschieden)
        switch (Board.endState) {
            case 1:
                sendMessage(LanguageController.getMessage(2)); //X won
                break;
            case 2:
                sendMessage(LanguageController.getMessage(3)); //O won
                break;
            case 3:
                sendMessage(LanguageController.getMessage(4)); //Tie
                break;
        }

    }

    /**
     * processPosition verarbeitet den Zug des aktuellen Spielers:
     * - Der Spieler wird aufgefordert, eine Position 1-9 einzugeben.
     * - Die Eingabe wird validiert. Eine ungültige oder belegte Position führt zu Fehlermeldungen.
     * Erst bei einer gültigen Eingabe wird der Zug ausgeführt und die Runde beendet.
     * @param currentPlayerTurn die ID des aktuellen Spielers (1 für X und 2 für O)
     */
    private void processPosition(int currentPlayerTurn) {
        boolean currentTurnFinished = false;
        while(!currentTurnFinished){
            Board.renderBoard();

            // Ankündigung des aktuellen Spielers
            if (currentPlayerTurn == 1) { // X Turn
                sendMessage(LanguageController.getMessage(0)); // X's Turn
            } else if (currentPlayerTurn == 2) {
                sendMessage(LanguageController.getMessage(1)); // O's Turn
            }
            int movePosition = UserInput.checkInput(UserInput.getInput());
            if (movePosition < 0) {
                sendMessage(LanguageController.getMessage(7)); // Invalid Input
                continue;
            }
            if (movePosition > 9 || movePosition < 1){
                sendMessage(LanguageController.getMessage(5)); // Invalid Position
                continue;
            }
            if (!Board.setFieldState(movePosition, currentPlayerTurn)) {
                sendMessage(LanguageController.getMessage(6)); // Taken Position
            } else {
                currentTurnFinished = true;
            }
        }
    }

    /**
     * Gibt eine Nachricht in der Konsole aus.
     * @param message ist die Nachricht die angezeigt werden soll
     */
    private void sendMessage(String message){
        System.out.println(message);
    }

    /**
     * Starte das Spiel neu.
     * Das Spielfeld wird komplett zurückgesetzt und eine neue runde wird gestartet.
     */
    public void restartGame(){
        this.Board.resetBoard();
        playTurn();
    }

    /**
     * Erstellt ein neues TicTacToe-Objekt und startet das ganze Spiel.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.restartGame();
    }
}
