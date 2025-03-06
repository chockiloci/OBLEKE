//uvozimo paket za delo z vhodno-izhodnimi operacijami
//import java.io.BufferedReader;
 import java.io.* ;
/**
 * Izjema / exception
 * @author Tanita Novak
 * @version VAJA 30
 */
	public class Omara {

	// če je omara zaklenjena 
    private boolean zaklenjena;    

    // konstruktor za inicializacijo stanja omare
    public Omara(boolean zaklenjena) {
        this.zaklenjena = zaklenjena;
    }

    // metoda za odpiranje omare
    public void odpri() throws Exception {
        // Preverimo, ali je omara zaklenjena 
        if (zaklenjena) {
            throw new Exception("Omara 1 je zaklenjena. Ne moremo je odpreti!");
        } else {
            System.out.println("Omara 2 je odprta.");
        }
    }

    // preverjanje stanja omare
    public boolean isZaklenjena() {
        return zaklenjena;
    }
}