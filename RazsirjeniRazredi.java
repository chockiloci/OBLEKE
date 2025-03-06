import java.io.*;
import java.util.Scanner.*;
/**
 * Razred za prikaz uporabe dedovanja
 * @author Tanita Novak
 * @version VAJA 35
 */
public class RazsirjeniRazredi {
    private String dodatek;
    private String znamka;
    private double cena;
    private String udobnost;
    private boolean temperatura;
    private boolean dezuje;
    private boolean priloznost;

    // Posodobljen konstruktor
    public RazsirjeniRazredi(String dodatek, String znamka, double cena, boolean temperatura, boolean dezuje, boolean priloznost, String udobnost) {
        this.dodatek = dodatek;
        this.znamka = znamka;
        this.cena = cena;
        this.temperatura = temperatura;
        this.dezuje = dezuje;
        this.priloznost = priloznost;
        this.udobnost = udobnost;
    }

    // Getterji za vse lastnosti
    public String getDodatek() {
        return dodatek;
    }

    public String getZnamka() {
        return znamka;
    }

    public double getCena() {
        return cena;
    }

    public String getUdobnost() {
        return udobnost;
    }

    public boolean isTemperatura() {
        return temperatura;
    }

    public boolean isDezuje() {
        return dezuje;
    }

    public boolean isPriloznost() {
        return priloznost;
    }
}
	
	
	