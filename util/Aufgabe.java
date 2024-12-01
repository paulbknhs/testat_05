package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aufgabe {
  public enum Zustand {
    OFFEN, IN_BEARBEITUNG, ERLEDIGT
  }

  private static int idCounter = 1;
  private final int id;
  private String beschreibung;
  private Zustand zustand;
  private Date faelligkeitsdatum;

  public Aufgabe(String beschreibung, Zustand zustand, Date faelligkeitsdatum) {
    this.id = idCounter++;
    this.beschreibung = beschreibung;
    this.zustand = zustand;
    this.faelligkeitsdatum = faelligkeitsdatum;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    return "Aufgabe [ID: " + id + ", Beschreibung: " + beschreibung +
            ", Zustand: " + zustand + ", Fällig bis: " + sdf.format(faelligkeitsdatum) + "]";
  }
}
