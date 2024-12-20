import java.util.Scanner;
import util.Menu;
import util.TaskManager;

public class Main {
  public static void main(String[] args) {
    TaskManager taskManager = new TaskManager();
    Menu menu = new Menu("Aufgabenverwaltung");

    menu.addItem("Aufgaben anzeigen");
    menu.addItem("Neue Aufgabe hinzufügen");

    boolean running = true;
    while (running) {
      menu.print();
      String choice = menu.getUserChoice();

      switch (choice) {
        case "1":
          taskManager.displayTasks();
          break;
        case "2":
          taskManager.addTask();
          break;
        case "3":
          Scanner scanner = new Scanner(System.in);
          System.out.print("ID der Aufgabe: ");
          int taskId = scanner.nextInt();
          taskManager.editTask(taskId);
          break;
        case "q":
          running = false;
          break;
        default:
          System.out.println("Ungültige Auswahl.");
      }
    }
  }
}