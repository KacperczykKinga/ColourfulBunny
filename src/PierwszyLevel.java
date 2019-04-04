import javax.swing.ImageIcon;

public class PierwszyLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] odpowiednieKolory= {1,1,1,1};
   // Bunny moje=new Bunny(odpowiednieKolory);
	}
	
	public void uruchom() {
		int[] odpowiednieKolory= {1,1,1,1};
		ImageIcon zmianyKolorow=new ImageIcon("data/pierwszeLev.png");
		ImageIcon koniec=new ImageIcon("data/pierwszyLevel.png");
	    Bunny moje=new Bunny(odpowiednieKolory, 1,zmianyKolorow,koniec);
	    moje.PierwszaPlansza();
	}

}
