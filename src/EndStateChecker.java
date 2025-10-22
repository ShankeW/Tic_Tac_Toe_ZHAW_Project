/**
 * Die Klasse EndStateChecker kontrolliert den momentanen Zustand des Spielbretts/Board.
 */
public class EndStateChecker {
    /**
     * Initialisiere das Objekt dieser Klasse
     */
    public EndStateChecker(){}

    /**
     * Die Methode kontrolliert den Status des Spielbretts.
     * @param FieldState wiedergibt das komplette Spielbrett.
     * @return gibt zurück, ob das Spiel zum Ende ist oder weiter gespielt werden soll.
     * Bedeutung von Rückgabewert:
     *     0 = Das Spiel soll fortgesetzt werden
     *     1 = Spieler mit dem Spielstein X hat gewonnen
     *     2 = Spieler mit dem Spielstein O hat gewonnen
     *     3 = Tie / Unentschieden
     */
    public int Check(int[] FieldState){
        int x = 0; int y = 0; int z = 0;
        int indexInc = 0; // Hilfe-Variable für die Indexberechnung, die für Kolonnen Kontrollieren verwendet wird.
        int cntNull = 0; // Zählt das Auftauchen von leeren Feldern auf.

        // Kontrolliere bei jedem Feld mit den dazugehörigen Nachbarn, ob der Gewinnzustand erreicht wird
        for (int i = 0; i < FieldState.length; i++){
            if (FieldState[i] == 0) cntNull++;
            if (i != 0 && i % 3 == 0) indexInc += 3;
            for (int j = 0; j < 3; j++){
                if (j == 0) {
                    x = i;
                    y = (i + 3) % 9;
                    z = (i + 2 * 3) % 9;
                } else if (j == 1) {
                    x = i;
                    y = indexInc + ((i + 1) % 3);
                    z = indexInc + ((i + 2) % 3);
                } else if (j == 2 && (i % 2 == 0) && i != 4) {
                    x = i;
                    y = 4;
                    z = 9 - (i + 1);
                }

                if (FieldState[x] == 1 && FieldState[y] == 1 && FieldState[z] == 1){
                    return 1;
                } else if (FieldState[x] == 2 && FieldState[y] == 2 && FieldState[z] == 2){
                    return 2;
                }
            }
        }

        return (cntNull != 0) ? 0 : 3;
    }
}