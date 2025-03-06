//uvozimo paket za delo z vhodno-izhodnimi operacijami
//import java.io.BufferedReader;
 import java.io.* ;

 import java.util.*;
 
 import javax.swing.*;
 
 import java.awt.event.*;
 
 /**
 * Razred za prikaz grafičnega uporabniškega vmesnika
 * @author Tanita Novak
 * @version VAJA 35
 */
 public class Konec extends JFrame implements ActionListener	{
	
	//Deklariramo zasebne lastnosti GUI
	private JPanel povrsina;
	
	private JButton dodajButton;
	private JTextField dodatekTextField;
	private JTextField znamkaTextField;
	private JTextField cenaTextField;
	private JTextField udobnostTextField;
	
	private OblekeTableModel modelTabele;
	
     /**
	 * Glavna metoda programa. Zažene se vedno ob zagonu. 
	 * @param args Seznam argumentov iz ukazne vrstice. 
	 */
	 public static void main (String [] args)	{

		//izpišemo začetek
		System.out.println("Zaganjam GUI ...");
		
		//ustavrimo objekt razreda miza
		Konec k = new Konec();

	 }		 
	 
	 /**
	   *konstruktor, ki postavi osnovne lastnosti okna
	  */
	 public Konec() 	{
		 //pokličemo konstruktor nadrazreda
		 super("Končna izbira dodatkov");
		 
		 //nastavimo obnašanje križca
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 //nastavimo velikost okenjca
		 setSize(800, 600);
		 
		 //Inicaliziramo elemente GUI
		 povrsina = new JPanel();
		 
		 //vnosna polja za dodajanje steklenic
		 dodatekTextField = new JTextField(9);
		 znamkaTextField = new JTextField(32);
		 cenaTextField = new JTextField(4);
		 udobnostTextField = new JTextField(7);
		 
		 //dodamo vnosna polja na površino 
		povrsina.add(new JLabel("Dodatek : "));
		 povrsina.add(dodatekTextField);	

		povrsina.add(new JLabel("Znamka : "));
		 povrsina.add(znamkaTextField);
		 
		 povrsina.add(new JLabel("Cena: "));
		 povrsina.add(cenaTextField);
		 
		 povrsina.add(new JLabel("Udobnost : "));
		 povrsina.add(udobnostTextField);
		 
		 //gumb za dodajanje steklenice
		 dodajButton = new JButton ("Dodaj");
		 
		 //Gumb dodamo action listener za dodajanje steklenic
		 dodajButton.addActionListener(this);	 
		 
		 //dodamo gumb na površino
		 povrsina.add(dodajButton);
		 
		 //inicializiramo model tabele
		 modelTabele = new OblekeTableModel();
		 
		 //tabelo postavimo na površino
		 //ustvarimo anonimen objekt razreda JTable z modelomTabele
		 povrsina.add(new JTable(modelTabele));
		 
		 //površino dodamo na okno
		 add(povrsina);
		 
		 //Prikažemo okno
		 setVisible (true);
		 
	 }
	 
	 /** Metoda, ki jo prepisuje ActionListener
	   * se kliče vedno, ko je pritisnjen gumb
	   * @param e Dogogek ob kliku
	  */
	public void actionPerformed(ActionEvent e) {
    // Izpišemo podatke iz vnosnih polj
    System.out.println("Dodatek: " + dodatekTextField.getText());
    System.out.println("Dodajam zaključni izbor...");
    System.out.println("Znamka: " + znamkaTextField.getText());
    System.out.println("Cena: " + cenaTextField.getText());
    System.out.println("Udobnost: " + udobnostTextField.getText());

    // Spremenljivka za ceno
    double sa = Double.parseDouble(cenaTextField.getText());
    String dodatek = dodatekTextField.getText();
    String znamka = znamkaTextField.getText();
    String udobnost = udobnostTextField.getText();

    // Ustvarimo nov objekt RazsirjeniRazredi
    RazsirjeniRazredi nova = new RazsirjeniRazredi(dodatek, znamka, sa, false, false, false, udobnost);

    // Objekt dodamo v model tabele
    modelTabele.addRazsirjeniRazredi(nova);
}
}