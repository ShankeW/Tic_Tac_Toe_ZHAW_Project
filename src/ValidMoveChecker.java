public class ValidMoveChecker {

    // Constructor
    public ValidMoveChecker() {
    }

    public boolean Check(int[] FieldStates, int Field) {
        // TODO
        if (Field < 1 || Field > 9){
            return false;
        } else if (FieldStates[Field - 1] != 0) {
            return false;
        }
        return true;
    }
}
