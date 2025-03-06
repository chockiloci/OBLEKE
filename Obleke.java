//uvozimo paket za delo z vhodno-izhodnimi operacijami
//import java.io.BufferedReader;
 import java.io.* ;
 import java.util.Scanner.*;
 import java.util.*;
/**
 * Razred za prikaz objektivno orijentiranega programiranja
 * @author Tanita Novak
 * @version VAJA 34
 */
public class Obleke {
    private static BufferedReader in;
	
	/**
	 * Seznam objektov tipa PivskaSteklenica
	 */
	private static ArrayList<NoviDodatki> noviDodatki; 

    public static void main(String[] args) {
        // Inicializiramo objekt za zajem podatkov iz konzole
        in = new BufferedReader(new InputStreamReader(System.in));
		
        // Inicializiramo seznam za nove dodatke
        noviDodatki = new ArrayList<>();
		
		// Ustvarimo primer omare, ki je zaklenjena
        Omara mojaOmara = new Omara(true);  

        try {
            mojaOmara.odpri();  
        } catch (Exception e) {
            // Če se zgodi napaka, izpišemo sporočilo napake
            System.out.println("Napaka: " + e.getMessage());
        }
		// Ustvarimo primer omare, ki ni zaklenjena
        Omara drugaOmara = new Omara(false);  

        try {
            drugaOmara.odpri();  
        } catch (Exception e) {
            // Če se zgodi napaka, izpišemo sporočilo napake
            System.out.println("Napaka: " + e.getMessage());
        }

        // Vnos podatkov za dodatek
        System.out.print("Vnesi dodatek: ");
        String dodatek = "";
        try {
            dodatek = in.readLine();
        } catch (Exception e) {
            System.out.println("Napaka pri branju dodatka: " + e);
        }

        System.out.print("Vnesi znamko dodatka: ");
        String znamka = "";
        try {
            znamka = in.readLine();
        } catch (Exception e) {
            System.out.println("Napaka pri branju znamke dodatka: " + e);
        }

        System.out.print("Vnesi ceno dodatka: ");
        double cena = 100;
        try {
            cena = Double.parseDouble(in.readLine());
        } catch (Exception e) {
            System.out.println("Napaka pri branju cene dodatka: " + e);
        }

        // Vnos o temperaturi, dežju in priložnosti
        boolean temperatura = false;
        try {
            System.out.print("Ali je mrzlo (d/n)? ");
            String odgovor = in.readLine();
            if (odgovor.equalsIgnoreCase("d")) {
                temperatura = true;
            }
        } catch (Exception e) {
            System.out.println("Napaka pri branju odgovora o temperaturi: " + e);
        }

        boolean dezuje = false;
        try {
            System.out.print("Ali dežuje (d/n)? ");
            String odgovor = in.readLine();
            if (odgovor.equalsIgnoreCase("d")) {
                dezuje = true;
            }
        } catch (Exception e) {
            System.out.println("Napaka pri branju odgovora o dežju: " + e);
        }

        boolean priloznost = false;
        try {
            System.out.print("Ali se oblačite za posebno priložnost (d/n)? ");
            String odgovor = in.readLine();
            if (odgovor.equalsIgnoreCase("d")) {
                priloznost = true;
            }
        } catch (Exception e) {
            System.out.println("Napaka pri branju odgovora o priložnosti: " + e);
        }
		
		// Dodali smo vnos za 'udobnost'
		String udobnost = "";
		boolean veljavnaUdobnost = false;
		while (!veljavnaUdobnost) {
		System.out.print("Vnesi udobnost (visoka, srednja, nizka): ");
		try {
			udobnost = in.readLine();
        if (udobnost.equalsIgnoreCase("visoka") || udobnost.equalsIgnoreCase("srednja") || udobnost.equalsIgnoreCase("nizka")) {
            veljavnaUdobnost = true; // Veljavna vrednost
        } else {
            System.out.println("Napaka: Udobnost mora biti ena od vrednosti: visoka, srednja, nizka.");
        }
    } catch (Exception e) {
        System.out.println("Napaka pri branju odgovora o udobnosti: " + e);
    }
}

        // Ustvarimo nov primer objekta RazsirjeniRazredi s temi vrednostmi
        RazsirjeniRazredi novPrimer = new RazsirjeniRazredi(dodatek, znamka, cena, temperatura, dezuje, priloznost, udobnost);

        // Prikazujemo kakovost izdelka
        novPrimer.kakovost();

        // Prikazujemo odgovore o temperaturi, dežju in priložnosti
        novPrimer.temperatura();
        novPrimer.dezuje();
        novPrimer.priloznost();
		
        // V seznam dodamo še nekaj anonimnih dodatkov
        noviDodatki.add(new NoviDodatki("sončna očala", "Bulget", 256));
        noviDodatki.add(new NoviDodatki("šal","Buff",20));
        noviDodatki.add(new NoviDodatki("torbica","Birkin",1500));

        // Izpišemo število dodatkov na seznamu
        System.out.println("V seznamu so " + (noviDodatki.size()+1) + " dodatki.");
		
		// Izpišemo vse dodatke v seznamu
        for (NoviDodatki dodatki : noviDodatki) {
		System.out.println("Dodatek: " + dodatki.getDodatek() + ", Znamka: " + dodatki.getZnamka() + ", Cena: " + dodatki.getCena());
		
		}
	}
	}
	
	class NoviDodatki {
    private String dodatek;
    private String znamka;
    private double cena;

    // Konstruktor
    public NoviDodatki(String dodatek, String znamka, double cena) {
        this.dodatek = dodatek;
        this.znamka = znamka;
        this.cena = cena;
    }

    // Getterji in setterji
    public String getDodatek() {
        return dodatek;
    }

    public String getZnamka() {
        return znamka;
    }

    public double getCena() {
        return cena;
    }
}