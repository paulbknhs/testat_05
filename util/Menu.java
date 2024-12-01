package util;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  private final String title;
  private final ArrayList<String> items = new ArrayList<>();
  private final Scanner scanner = new Scanner(System.in);

  public Menu(String title) {
    this.title = title;
  }

  public void addItem(String item) {
    items.add(item);
  }

  public void print() {
    System.out.println("\n" + title);
    System.out.println("#".repeat(title.length() + 2));
    for (int i = 0; i < items.size(); i++) {
      System.out.println((i + 1) + " > " + items.get(i));
    }
    System.out.println("q > Beenden");
  }

  public String getUserChoice() {
    System.out.print("Auswahl: ");
    return scanner.nextLine().trim();
  }
}
