# Klassenbeschreibungen

## class Main
Rolle: Startet das Spiel.  
Die Klasse initialisiert **TicTacToe**.

## class TicTacToe
Kontrolliert alle Spielfunktionen.  
Es instanziiert den **InputController**, den **EndstateChecker**, den **Renderer** und den **LanguageController**.
Alle Messages werden auch durch diese Klasse in der Console printed.


## class Board
Speichert den Spielfeldstatus und kann diesen zurücksetzten.
Nachdem ein korrekter Spielzug getätigt wurde, updated die Klasse das Spielfed mit **SetFieldStates** und kann das Spielfeld abrufen mit **GetFieldStates**.
Die Klasse speichert auch, welcher Spieler gerade an der Reihe ist und kann diesen Status auch abrufen.

## class LanguageController


## class Renderer


## class InputController


## class ValidMoveChecker


## class EndStateChecker


### TL:DR

1. **Main** startet alles
2. **TicTacToe** steuert alles
3. Spielzustand im **Board**
4. Eingaben über **InputController**
5. Überprüfung mit **ValidMoveChecker**
6. & **EndstateChecker**
7. Darstellung mit **Renderer**
8. Nachrichten an die Spieler mit **LanguageController**
