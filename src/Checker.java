public class Checker {

    // Constructor
    public Checker() {
    }

    public boolean CheckValidMove(int[] FieldStates, int Field) {
        // TODO
        if (Field < 1 || Field > 9){
            return false;
        } else if (FieldStates[Field - 1] != 0) {
            return false;
        }
        return true;
    }
}
