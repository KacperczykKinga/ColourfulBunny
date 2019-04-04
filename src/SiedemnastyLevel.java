import javax.swing.ImageIcon;

public class SiedemnastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {4,4,4,4};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/dziewiatyLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 17, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
