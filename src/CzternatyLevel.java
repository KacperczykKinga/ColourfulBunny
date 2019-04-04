import javax.swing.ImageIcon;

public class CzternatyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {4,2,4,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/czternastyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 14, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
