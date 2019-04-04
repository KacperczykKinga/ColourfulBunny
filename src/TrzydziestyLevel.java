import javax.swing.ImageIcon;

public class TrzydziestyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {2,2,7,7};
		ImageIcon zmianyKolorow=new ImageIcon("data/trzecieLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziestyLevel.png");
	    Bunny4 moje=new Bunny4(odpowiednieKolory, 30, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
