public class EndStateChecker {
    /**
     * Initialisiere das Objekt dieser Klasse
     */
    public EndStateChecker(){}

    /**
     * Die Methode kontrolliert den Status des Spielbretts.
     * @param FieldState wiedergibt das komplette Spielbrett
     * @return gibt zurück, ob das Spiel zum Ende ist.
     * Bedeutung von Rückgabewert:
     *     0 = Das Spiel soll fortgesetzt werden
     *     1 = Spieler mit dem Spielstein X hat gewonnen
     *     2 = Spieler mit dem Spielstein O hat gewonnen
     *     3 = Tie / Unentschieden
     */
    public int CheckForEndState(int[] FieldState){
        // TODO

        for (int i = 0; i < 3; i += 3){    // Kontrolliere Zeilen
             if (FieldState[i] == 1 && FieldState[i + 1] == 1 && FieldState[i + 2] == 1){
                 return 1;
             } else if (FieldState[i] == 2 && FieldState[i + 1] == 2 && FieldState[i + 2] == 2){
                 return 2;
             }
        }

        for (int i = 0; i < 3; i++){    // Kontrolliere Spalten
            if (FieldState[i] == 1 && FieldState[i + 3] == 1 && FieldState[i + 6] == 1){
                return 1;
            } else if (FieldState[i] == 2 && FieldState[i + 3] == 2 && FieldState[i + 6] == 2){
                return 2;
            }
        }

        // Kontrolliere Diagonale
        if (FieldState[0] == 1 && FieldState[4] == 1 && FieldState[8] == 1){
            return 1;
        } else if (FieldState[0] == 2 && FieldState[4] == 2 && FieldState[8] == 2){
            return 2;
        }
        if (FieldState[2] == 1 && FieldState[4] == 1 && FieldState[6] == 1){
            return 1;
        } else if (FieldState[2] == 2 && FieldState[4] == 2 && FieldState[6] == 2){
            return 2;
        }

        for (int i : FieldState) {    // Kontrolliere, ob das Spiel fortgesetzt werden soll
            if (i == 0) {
                return 0;
            }
        }

        return 3;
    }
}
