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
                    sendMessage(languageController.getMessage(0));
                } else if (currentPlayerTurn == 2) {
                    sendMessage(languageController.getMessage(0));
                }
                int moveInput = userInput.checkInput(userInput.getInput());

                if (!board.setFieldState(moveInput, currentPlayerTurn)) {

                } else {
                    currentTurnFinished = true;
                }
            }
        }

        switch (board.EndState) {
            case 1:
                sendMessage(languageController.getMessage(0));
                break;
            case 2:
                sendMessage(languageController.getMessage(1));
                break;
            case 3:
                sendMessage(languageController.getMessage(2));
                break;
        }
        
    }

    private void sendMessage(String message){
        System.out.println(message);
    }

    public void restartGame(){
        this.board = new Board();
        playTurn();
    }
}
