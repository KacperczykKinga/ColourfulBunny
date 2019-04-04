import javax.swing.ImageIcon;

public class PiecdziesiatyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {3,3,3,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/czterdziesty2Level.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 50, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
