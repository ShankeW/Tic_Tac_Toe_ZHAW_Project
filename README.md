TL:DR wie unser TicTacToe und seine Klassen funktionieren:

1. **Main** startet alles
2. **TicTacToe** steuert alles
3. Spielzustand im **Board**
4. Eingaben über **UserInput**
5. Überprüfung mit **ValidMoveChecker**
6. & **EndstateChecker**
7. Nachrichten an die Spieler mit **LanguageController**

👉 Hier die detaillierte Version: [Klassenbeschreibung](https://github.zhaw.ch/PM1-IT25aZH-dint-fame-dihl/team01-alphas-projekt1-tic-tac-toe/blob/main/Team1_Alphas_Klassenbeschreibung_TicTacToe_V1.pdf)

- [Ablaufdiagramm (PDF)](https://github.zhaw.ch/PM1-IT25aZH-dint-fame-dihl/team01-alphas-projekt1-tic-tac-toe/blob/main/TicTacToe%20UML/AblaufDragramm%20TicTacToe.png)
- [Testkonzept (PDF)](https://github.zhaw.ch/PM1-IT25aZH-dint-fame-dihl/team01-alphas-projekt1-tic-tac-toe/blob/main/Team1_Alphas_Testkonzept.pdf)
- [TicTacToe UML (UXF)](https://github.zhaw.ch/PM1-IT25aZH-dint-fame-dihl/team01-alphas-projekt1-tic-tac-toe/blob/main/TicTacToe%20UML/TicTacToe%20UML.uxf)
- [TicTacToe UML V8 (PDF)](https://github.zhaw.ch/PM1-IT25aZH-dint-fame-dihl/team01-alphas-projekt1-tic-tac-toe/blob/main/TicTacToe%20UML/TicTacToe%20UMLV8.pdf)
- [Prosa TicTacToe (PDF)](https://github.zhaw.ch/PM1-IT25aZH-dint-fame-dihl/team01-alphas-projekt1-tic-tac-toe/blob/main/Prosa_TicTacToe.pdf) 

Klassenverantwortung
- Shanke - EndStateChecker, Board
- Fabian - ValidMoveChecker, Board
- Ahalya - UserInput, TicTacToe
- Hunter - LanguageController, TicTacToe



Klassendiagramm Veränderungen:

Namenänderung:
Um Verwirrung zu vermeiden und mehr spezifisch zu sein, werden Namen für zwei Klassen geändert:
- Der Klasse Name "InputController" zu "UserInput" geändert.
- Der Methode Name "CheckValidMove" aus der Klasse ValidMoveChecker zu "Check" geändert.
