import javax.swing.ImageIcon;

public class Czterdziesty3Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,0,2,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czternastyLevel.png");
	    Bunny7 moje=new Bunny7(odpowiednieKolory, 43, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
