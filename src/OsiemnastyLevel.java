import javax.swing.ImageIcon;

public class OsiemnastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {1,1,1,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/pierwszyLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 18, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
