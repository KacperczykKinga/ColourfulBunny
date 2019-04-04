import javax.swing.ImageIcon;

public class DziesiatyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,0,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/drugiLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 10, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
