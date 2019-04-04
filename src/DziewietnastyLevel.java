import javax.swing.ImageIcon;

public class DziewietnastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {0,0,1,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/osmyLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 19, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
