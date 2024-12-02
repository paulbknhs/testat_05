package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskManager {
  private final ArrayList<Aufgabe> aufgabenListe = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public void addTask() {
        System.out.println("Neue Aufgabe erstellen:");
        System.out.print("Aufgabenbeschreibung: ");
        String description = scanner.nextLine();

        Date dueDate = null;
        while (dueDate == null) {
            System.out.print("Fälligkeitsdatum (dd.MM.yyyy): ");
            String dateInput = scanner.nextLine();
            try {
                dueDate = sdf.parse(dateInput);
            } catch (Exception e) {
                System.out.println("Ungültiges Datum! Bitte erneut eingeben.");
            }
        }

        Aufgabe task = new Aufgabe(description, Aufgabe.Zustand.OFFEN, dueDate);
    aufgabenListe.add(task);
        System.out.println("Aufgabe erstellt: " + task.getBeschreibung() + " (ID: " + task.getId() + ")");
    }

  public void editTask(int id) {
    for (Aufgabe aufgabe : aufgabenListe) {
      if (aufgabe.getId() == id) {
        System.out.println("Bearbeite Aufgabe: " + aufgabe.getBeschreibung());
        System.out.print("Neue Beschreibung (Enter für keine Änderung): ");
        String beschreibungNeu = scanner.nextLine();
        if (!beschreibungNeu.isEmpty()) {
          aufgabe.setBeschreibung(beschreibungNeu);
        }

        System.out.print("Neues Fälligkeitsdatum (dd.MM.yyyy, Enter für keine Änderung): ");
        String datumNeu = scanner.nextLine();
        if (!datumNeu.isEmpty()) {
          try {
            Date newDueDate = sdf.parse(datumNeu);
            aufgabe.setFaelligkeitsdatum(newDueDate);
          } catch (Exception e) {
            System.out.println("Ungültiges Datum! Keine Änderung durchgeführt.");
          }
        }
        System.out.println("Aufgabe aktualisiert: " + aufgabe);
        return;
      }
    }
    System.out.println("Aufgabe mit ID " + id + " nicht gefunden.");
  }

    public void displayTasks() {
    if (aufgabenListe.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden.");
        } else {
      for (Aufgabe aufgabe : aufgabenListe) {
        System.out.println(aufgabe);
            }
        }
    }
    
    
}
