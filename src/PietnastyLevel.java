import javax.swing.ImageIcon;

public class PietnastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {3,0,0,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/pietnastyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 15, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
