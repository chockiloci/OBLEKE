import java.io.*;
import java.util.Scanner.*;
/**
 * Razred za prikaz oblačil
 * @author Tanita Novak
 * @version Primer 34
 */
	public class Razredi implements Vmesnik {
    // Deklariramo lastnosti
    private boolean jeMrzlo;
    private boolean aliDezuje;
    private boolean jePriloznost;
    private String dodatki;
	protected String udobnost;
	
	 // Konstruktor za inicializiranje dodatkov
    public Razredi(String d, boolean temperatura, boolean dezuje, boolean priloznost, String udobnost) {
        // Inicializiramo vse lastnosti
        this.jeMrzlo = temperatura;
        this.aliDezuje = dezuje;
        this.jePriloznost = priloznost;
        this.dodatki = d;

        // Preverimo, če je udobnost veljavna
        if (!udobnost.equalsIgnoreCase("visoka") && !udobnost.equalsIgnoreCase("srednja") && !udobnost.equalsIgnoreCase("nizka")) {
            throw new IllegalArgumentException("Napaka: Udobnost mora biti ena od vrednosti: visoka, srednja, nizka.");
        }
        this.udobnost = udobnost;

        // Izpišemo podatke o dodatku
        System.out.println("Danes boste dodali " + d + " kot dodatek.");
    }

    // Metoda za preverjanje temperature
    public void temperatura() {
        if (jeMrzlo) {
            System.out.println("Ker je mrzlo, se boste oblekli v dolge rokave.");
        } else {
            System.out.println("Ker je toplo, se boste oblekli v kratke rokave.");
        }
    }

    // Metoda za preverjanje dežja
    public void dezuje() {
        if (aliDezuje) {
            System.out.println("Ker dežuje boste oblekli palerino.");
        } else {
            System.out.println("Ker ne dežuje neboste oblekli palerine.");
        }
    }

    // Metoda za preverjanje priložnosti
    public void priloznost() {
        if (jePriloznost) {
            System.out.println("Ker gre za posebno priložnost boste dodali nakit.");
        } else {
            System.out.println("Ker ne gre za posebno priložnost se z nakitom ne boste obremenjevali.");
        }
  }
      @Override
    public String getUdobnostDodatka() {
        return udobnost;
    }
}
