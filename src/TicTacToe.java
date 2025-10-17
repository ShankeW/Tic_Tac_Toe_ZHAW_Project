public class TicTacToe {
    private Board board;
    private UserInput userInput;
    private LanguageController languageController;

    public TicTacToe(){
        this.board = new Board();
        this.userInput = new UserInput();
        this.languageController = new LanguageController();
    }

    private void playTurn(){
        while(board.EndState == 0) {

        sendMessage("Language / Sprache");
        sendMessage("1 - English");
        sendMessage("2 - Deutsch");

        int selection = userInput.checkInput(userInput.getInput());

        languageController.setLanguageSetting(selection);

        board.renderBoard();

        int currentPlayerTurn = board.PlayerTurn;

        boolean currentTurnFinished = false;

            while(!currentTurnFinished){
                if (currentPlayerTurn == 1) { // X Turn
                    sendMessage(languageController.getMessage(0)); //X's Turn
                } else if (currentPlayerTurn == 2) {
                    sendMessage(languageController.getMessage(1)); //O's Turn
                }
                int moveInput = userInput.checkInput(userInput.getInput());
                if (moveInput > 9 || moveInput < 1){
                    sendMessage(languageController.getMessage(5)); //Invalid Position
                }
                sendMessage(Integer.toString(moveInput));
                if (!board.setFieldState(moveInput, currentPlayerTurn)) {
                    sendMessage(languageController.getMessage(6)); //Taken Position
                } else {
                    currentTurnFinished = true;
                }
            }
        }

        switch (board.EndState) {
            case 1:
                sendMessage(languageController.getMessage(2)); //X won
                break;
            case 2:
                sendMessage(languageController.getMessage(3)); //O won
                break;
            case 3:
                sendMessage(languageController.getMessage(4)); //Tie
                break;
        }
        
    }

    private void sendMessage(String message){
        System.out.println(message);
    }

    public void restartGame(){
        this.board.resetBoard();
        playTurn();
    }
}
