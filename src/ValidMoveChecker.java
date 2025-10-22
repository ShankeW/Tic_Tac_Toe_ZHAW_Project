/**
 * Prüft, ob ein Spielzug im Tic-Tac-Toe-Brett gültig ist,
 * bzw ob der Spielstein auf die gewünschte Position gesetzt werden darf.
 * Ein Zug ist dann gültig, wenn:
 * - die angegebene Position innerhalb des Bereichs 1–9 liegt, und
 * - das gewählte Feld aktuell leer ist (Wert 0 im Array).
 */
public class ValidMoveChecker {

    /**
     * Die Instanz der Klasse ValidMoveChecker wird erzeugt.
     */
    public ValidMoveChecker() {
    }

    /**
     * Diese Methode überprüft, on ein Zug auf dem gegebenen Spielfed überhaupt erlaubt ist.
     * @param fieldStates repräsentiert den Zustand des aktuellen Boards. (0 = freies Feld, 1 bzw 2 von einem der Spieler belegt)
     * @param field ist die gewünschte Feldposition des Spielers.
     * @return gibt an, ob der Zug...
     *    true: ...ausgeführt werden kann,
     *    false: ...nicht ausgeführt werden kann.
     */
    public boolean check(int[] fieldStates, int field) {
        if (field < 1 || field > 9){
            return false;
        } else if (fieldStates[field - 1] != 0) {
            return false;
        }
        return true;
    }
}
