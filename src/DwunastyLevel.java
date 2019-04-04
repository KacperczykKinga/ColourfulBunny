import javax.swing.ImageIcon;

public class DwunastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {3,3,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/siodmyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 12, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
