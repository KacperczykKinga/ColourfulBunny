import javax.swing.ImageIcon;

public class DziewiatyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {4,4,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/dziewiatyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 9, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
