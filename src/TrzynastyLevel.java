import javax.swing.ImageIcon;

public class TrzynastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {3,1,3,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/szostyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 13, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
