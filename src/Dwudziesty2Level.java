import javax.swing.ImageIcon;

public class Dwudziesty2Level {
	public void uruchom() {
		int[] odpowiednieKolory= {1,5,1,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/dwudziesty2Level.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 22, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
