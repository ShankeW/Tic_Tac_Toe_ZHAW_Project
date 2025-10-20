/**
 * Diese Klasse kontrolliert, ob den aktuell gemachten Spielzug gültig ist,
 * bzw ob der Spielstein auf der gewünschten Position gesetzt werden darf.
 */
public class ValidMoveChecker {

    /**
     * Der Instanz dieser Klasse wird erzeugt.
     */
    public ValidMoveChecker() {
    }

    /**
     * Diese Methode
     * @param FieldStates repräsentiert das Board.
     * @param Field soll die Position, bzw das Feld, wo man den Spielstein setzen möchtet, darstellen.
     * @return gibt an, ob ein solcher Zug:
     *    true: gemacht werden kann,
     *    false: nicht gemacht werden kann.
     */
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
