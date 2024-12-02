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
  private final Zustand zustand;
  Date faelligkeitsdatum;

  /**
   * Erstellt ein neues Objekt der Klasse Aufgabe.
   *
   * @param beschreibung Aufgabentitel
   * @param zustand Standardmäßig OFFEN, kann weiter die Werte IN_BEARBEITUNG und ERLEDIGT annehmen
   * @param faelligkeitsdatum Zeitpunkt, zu dem die Aufgabe erledigt werden muss
   */
  public Aufgabe(String beschreibung, Zustand zustand, Date faelligkeitsdatum) {
    this.id = idCounter++;
    this.beschreibung = beschreibung;
    this.zustand = zustand;
    this.faelligkeitsdatum = faelligkeitsdatum;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setFaelligkeitsdatum(Date neuesDatum) {
    faelligkeitsdatum = neuesDatum;
  }

  public void setBeschreibung(String neueBeschreibung) {
    beschreibung = neueBeschreibung;
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
