import javax.swing.ImageIcon;

public class SiodmyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {3,3,2,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/siodmyLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 7, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
