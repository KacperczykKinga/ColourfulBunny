import javax.swing.ImageIcon;

public class Dwudziesty1Level {
	public void uruchom() {
		int[] odpowiednieKolory= {2,0,2,0};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/piatyLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 21, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
