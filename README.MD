# Testat Grundlagen der Programmierung I

## Aufgaben – Teil 5

1. **Entwickeln Sie eine Konsolenanwendung**, die zur Verwaltung von zu
   erledigenden Aufgaben dient. Die Anwendung erfüllt die folgenden
   Anforderungen:

    - Aufgaben können inklusive Fälligkeitsdatum und Beschreibung erfasst
      werden. Verwenden Sie zur Identifikation einzelner Aufgaben eine
      **eindeutige, fortlaufende Nummer**.

    - Jede Aufgabe befindet sich zu einem Zeitpunkt in einem Zustand:

        - **Offen**
        - **In Bearbeitung**
        - **Erledigt**  
          Der Zustand kann vom Nutzer geändert werden.

    - Es besteht die Möglichkeit, **alle Aufgaben auszugeben**. Die Aufgaben
      sollen:

        - Nach Fälligkeitsdatum sortiert sein.
        - Anhand ihres Zustands gruppiert werden (zuerst offene Aufgaben, dann
          Aufgaben in Bearbeitung usw.).

    - Einzelne Aufgaben können **gelöscht** und **bearbeitet** werden.

    - Es gibt eine **Menüführung**.

   > **Hinweis:** Wählen Sie eine geeignete Sammlungsstruktur für die
   > Speicherung der Aufgaben.

2. **Zusatzaufgabe: Implementieren Sie eine Ansicht**, in der alle Aufgaben
   in Form eines **Kanban-Boards** dargestellt werden. Ermitteln Sie die
   notwendige Spaltenbreite und sortieren Sie pro Spalte nach Fälligkeitszeitpunkt.
