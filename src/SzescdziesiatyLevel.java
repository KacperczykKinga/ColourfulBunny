import javax.swing.ImageIcon;

public class SzescdziesiatyLevel {
	public void uruchom() {
		int[] odpowiednieKolory= {2,2,5,5};
		ImageIcon zmianyKolorow=new ImageIcon("data/piateLev.png");
		ImageIcon koniec=new ImageIcon("data/szescdziesiatyLevel.png");
	    Bunny8 moje=new Bunny8(odpowiednieKolory, 60, zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}
}
