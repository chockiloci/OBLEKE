import javax.swing.table.*;

/**
 * Razred za delo s tabelo oblekami
 * Razširja privzeti razred za tabele
 * @author Tanita Novak
 * @version VAJA 35
 */
public class OblekeTableModel extends DefaultTableModel {

    /**
     * Konstruktor, ki ustvari tabelo dodatkov
     */
    public OblekeTableModel() {

        // Pokličemo konstruktor nadrazreda
        super();

        // Dodamo stolpce v tabelo
        addColumn("Dodatek");
        addColumn("Znamka");
        addColumn("Cena");
        addColumn("Udobnost");

        // Dodamo testni vnos
        Object[] vrstica = new Object[] {"Testni dodatek", "Testna znamka", "Testna cena", "Testna udobnost"};

        // Vstavimo v tabelo
        addRow(vrstica);
    }

    /**
     * Javna metoda, ki doda dodatek v tabelo
     * @param ps Objekt, ki ga doda v tabelo
     */
    public void addRazsirjeniRazredi(RazsirjeniRazredi ps) {

        // Ustvarimo seznam objektov(nizov)
        Object[] vrstica = new Object[] {ps.getDodatek(), ps.getZnamka(), ps.getCena(), ps.getUdobnost()};

        // Vstavi vrstico v tabelo
        addRow(vrstica);
    }
}
