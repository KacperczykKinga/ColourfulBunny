import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Start implements ActionListener{
	JFrame ramka = new JFrame();
	JPanel powitanie = new JPanel();
	JLabel witaj=new JLabel();
	JPanel historyjka=new JPanel();
	JLabel historia1=new JLabel();
	JLabel historia2=new JLabel();
	JPanel pomocniczy=new JPanel();
	JLabel historia3=new JLabel();
	JLabel historia4=new JLabel(); 
	JLabel przerwa= new JLabel();
	JPanel zasady=new JPanel();
	JLabel wstep=new JLabel();
	JLabel zasada1=new JLabel();
	JLabel zasada2=new JLabel();
	//MojPanel przyklad=new MojPanel();
	JLabel dopisek=new JLabel();
	JLabel zasada3=new JLabel();
//	MojPanel2 przyklad2=new MojPanel2();
	JLabel pozdrowienie=new JLabel();
	JButton poczatekGry=new JButton();
	JPanel doPrzycisku=new JPanel();
	JLabel uwaga1=new JLabel();
	JLabel uwaga2=new JLabel();
	JButton przyklad1=new JButton();
	JButton przyklad2=new JButton();
	JLabel zasada1a=new JLabel();
	JLabel zasada1b=new JLabel();
	JLabel zasada2a=new JLabel();
	JLabel zasada2b=new JLabel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start nowyStart = new Start();
		nowyStart.tutorial();
	}
	

	public void tutorial() {
		//ustawia ramke
		ramka.setSize(1600, 950);
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setForeground(Color.DARK_GRAY);
		//wyswietla napis "Hej! Witaj w �wiecie Kolorowych Kr�lik�w!" w fioletowym kolorzze
		ramka.getContentPane().add(BorderLayout.NORTH, powitanie);
		witaj.setText("Hej! Witaj w �wiecie Kolorowych Kr�lik�w!" );
		Font alfa = new Font("serif", Font.ITALIC, 24);
		witaj.setFont(alfa);
		witaj.setForeground(Color.MAGENTA);
		powitanie.add(witaj);
		//wyswietla historyjke ktora jest wstepem do gry
		ramka.getContentPane().add(BorderLayout.CENTER, historyjka);
		ramka.getContentPane().add(BorderLayout.WEST, pomocniczy);
		BoxLayout nowySposob=new BoxLayout(historyjka, BoxLayout.Y_AXIS);
		historyjka.setLayout(nowySposob);
		historia1.setText("Kolorowe Kr�liki to radosne stworzenia, kt�re uwielbiaj� hasa� po ��kach, bawi� sie,�artowa�, a przede wszystkim zmienia� kolory.");
		historia1.setFont(alfa);
		historyjka.add(historia1);
		historia2.setText("Jednak teraz Kolorowe Kr�liki �yj� w strachu. Z�y Sok� je zaatakowa� i musz� si� przed nim ukrywa�.");
		historia2.setFont(alfa);
		historyjka.add(historia2);
		historia3.setText("Jednak mo�esz uratowa� kr�liki wygrywaj�c t� gr�.");
		historia3.setFont(alfa);
		historyjka.add(historia3);
		przerwa.setText(" ");
		historyjka.add(przerwa);
		//wyswietla zasady gry
		historyjka.add(zasady);
		BoxLayout nowySposob2=new BoxLayout(zasady, BoxLayout.Y_AXIS);
		zasady.setLayout(nowySposob2);
		wstep.setText("Oto jej zasady:");
	//	wstep.setBounds(10,10,10,10);
		wstep.setFont(alfa);
		zasady.add(wstep);
		zasada1.setText("-gdy przejdziesz przez jedn� plansz�, odblokuje si� kolejna (plansze do ktorych masz dostep s� koloru r�owego, mozesz do");
		zasada1.setFont(alfa);
		zasady.add(zasada1);
		zasada1a.setText(" nich wr�cic by poprawic sw�j wynik)");
		zasada1a.setFont(alfa);
		zasady.add(zasada1a);
		zasada1b.setText("-kolor kr�lika zmieniasz poprzez naci�ni�cie go");
		zasada1b.setFont(alfa);
		zasady.add(zasada1b);
		zasada2.setText("-na g�rze planszy jest pokazane w jakiej kolejno�ci kr�liki zmieniaj� kolory (w tym przypadku kr�lik zmieni kolor po ");
		zasada2.setFont(alfa);
		zasady.add(zasada2);
		dopisek.setText("np.");
		dopisek.setFont(alfa);
		//zasady.add(dopisek);
		zasada2a.setText("naci�ni�ciu z niebieskiego na ��ty a z zielonego na niebieski)");
		zasada2a.setFont(alfa);
		zasady.add(zasada2a);
		ImageIcon przykladowyObrazek1=new ImageIcon("data/przyklad.png");
		przyklad1.setIcon(przykladowyObrazek1);
		przyklad1.setBackground(Color.WHITE);
		zasady.add(przyklad1);
		//przyklad.setSize(300,150);
		zasada3.setText("-oraz jak plansza ma wygl�da� aby ja przej��");
		//zasada3.setBounds(1000,100,100,100);
		zasada3.setFont(alfa);
		zasady.add(zasada3);
		zasady.add(dopisek);
		ImageIcon przykladowyObrazek2=new ImageIcon("data/przyklad2.png");
		przyklad2.setIcon(przykladowyObrazek2);
		przyklad2.setBackground(Color.WHITE);
		zasady.add(przyklad2);
	//	zasady.add(przyklad2);
		uwaga1.setText("Ale uwa�aj. Zmiana koloru jednego kr�lika, powoduje zmiane koloru innego kr�lika (a czasem nawet kilku kr�lik�w).");
		uwaga1.setFont(alfa);
		zasady.add(uwaga1);
		uwaga2.setText(" To Ty musisz odkryc kt�ry kr�lik, kt�rego zmienia.");
		uwaga2.setFont(alfa);
		zasady.add(uwaga2);
		pozdrowienie.setText("Powodzenia!");
		pozdrowienie.setFont(alfa);
		zasady.add(pozdrowienie);
		//wyswietla przycisk rozpoczynajacy gre
		poczatekGry.setText("Rozpocznij gre!");
		ramka.getContentPane().add(BorderLayout.SOUTH, doPrzycisku);
		doPrzycisku.add(poczatekGry);
		poczatekGry.addActionListener(this);
		ramka.pack();
			
	}
	
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==poczatekGry) {
			Levels twojeLevele=new Levels();
			ramka.setVisible(false);
			twojeLevele.pokazLevele();
		}
	}
}
