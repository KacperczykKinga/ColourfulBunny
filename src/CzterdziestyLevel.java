import javax.swing.ImageIcon;

public class CzterdziestyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {2,0,0,2};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/czwartyLevel.png");
	    Bunny5 moje=new Bunny5(odpowiednieKolory, 40, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
