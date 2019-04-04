import javax.swing.ImageIcon;

public class DwudziestyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {5,5,3,3};
		ImageIcon zmianyKolorow=new ImageIcon("data/drugieLev.png");
		ImageIcon koniec=new ImageIcon("data/dziesiatyLevel.png");
	    Bunny3 moje=new Bunny3(odpowiednieKolory, 20, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
