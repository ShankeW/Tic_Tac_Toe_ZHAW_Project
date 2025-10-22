public class TicTacToe {
    private final Board Board;
    private final UserInput UserInput;
    private final LanguageController LanguageController;

    public TicTacToe(){
        this.Board = new Board();
        this.UserInput = new UserInput();
        this.LanguageController = new LanguageController();
    }

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

    private void processPosition(int currentPlayerTurn) {
        boolean currentTurnFinished = false;
        while(!currentTurnFinished){
            Board.renderBoard();
            if (currentPlayerTurn == 1) { // X Turn
                sendMessage(LanguageController.getMessage(0)); //X's Turn
            } else if (currentPlayerTurn == 2) {
                sendMessage(LanguageController.getMessage(1)); //O's Turn
            }
            int movePosition = UserInput.checkInput(UserInput.getInput());
            if (movePosition < 0) {
                sendMessage(LanguageController.getMessage(7)); //Invalid Input
                continue;
            }
            if (movePosition > 9 || movePosition < 1){
                sendMessage(LanguageController.getMessage(5)); //Invalid Position
                continue;
            }
            if (!Board.setFieldState(movePosition, currentPlayerTurn)) {
                sendMessage(LanguageController.getMessage(6)); //Taken Position
            } else {
                currentTurnFinished = true;
            }
        }
    }

    private void sendMessage(String message){
        System.out.println(message);
    }

    public void restartGame(){
        this.Board.resetBoard();
        playTurn();
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.restartGame();
    }
}
