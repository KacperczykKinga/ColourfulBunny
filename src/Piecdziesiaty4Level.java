import javax.swing.ImageIcon;

public class Piecdziesiaty4Level {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,5,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/czwarteLev.png");
		ImageIcon koniec=new ImageIcon("data/trzydziestyLevel.png");
	    Bunny6 moje=new Bunny6(odpowiednieKolory, 54, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
