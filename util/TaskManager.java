package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskManager {
    private final ArrayList<Aufgabe> taskList = new ArrayList<>();
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
        taskList.add(task);
        System.out.println("Aufgabe erstellt: " + task.getBeschreibung() + " (ID: " + task.getId() + ")");
    }

    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden.");
        } else {
            for (Aufgabe task : taskList) {
                System.out.println(task);
            }
        }
    }
}
