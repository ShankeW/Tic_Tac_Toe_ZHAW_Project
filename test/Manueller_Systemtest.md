# Protokoll: Systemtest – TicTacToe

## Details
- Datum/Uhrzeit: 2025-10-22 16:00
- Tester/innen: Fabian Wittmann und Co.
- Kürzel: wittmfab
- Umgebung: IntelliJ auf macOS

## Setup
- Start: `java TicTacToe`
- Sprache: bei der ersten Eingabe „1“ (English), danach leere Eingabe (Enter) -> bleibt auf "English".

---

## 1. Durchlauf – X gewinnt
**Eingaben:** `1` (Sprache = English), dann `1, 5, 2, 9, 3` (Positionen)  
**Erwartet:** Message „X has won the Game!“  
**Ergebnis:** Message „X has won the Game!“  
**Anmerkungen:** Test bestanden  

## 2. Durchlauf – O gewinnt  
**Eingaben:** `2` (Sprache = Deutsch), dann `1, 4, 2, 5, 9, 6` (Positionen)  
**Erwartet:** Message „O hat das Spiel gewonnen!“  
**Ergebnis:** Message „O hat das Spiel gewonnen!“  
**Anmerkungen:** Test bestanden  

## 3. Durchlauf – Unentschieden  
**Eingaben:** `1` (Sprache = English),`5, 1, 9, 3, 7, 6, 2, 8, 4` (Positionen)  
**Erwartet:** Message „Tie!“  
**Ergebnis:** Message „Tie!“  
**Anmerkungen:** Test bestanden  

---

## Zusammenfassung  
- Durchlauf 1, 2 und 3 bestanden.  
