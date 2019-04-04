import javax.swing.ImageIcon;

public class JedenastyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {5,5,3,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/dziesiatyLevel.png");
	    Bunny2 moje=new Bunny2(odpowiednieKolory, 11, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
