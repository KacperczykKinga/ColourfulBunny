import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Koniec implements ActionListener {
JFrame ramka=new JFrame();
JLabel gratulacje=new JLabel();
JPanel koniecHistoryjki=new JPanel();
JPanel pomocniczy=new JPanel();
JLabel historia1=new JLabel();
JLabel historia2=new JLabel();
JButton obrazek=new JButton();
JPanel doPrzycisku=new JPanel();
JButton doMenu=new JButton();

	public void toJuzJestKoniec() {
		// ustawia ramke
		ramka.setSize(1600, 950);
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setForeground(Color.DARK_GRAY);
		ramka.getContentPane().add(BorderLayout.NORTH, gratulacje);
		gratulacje.setText("Gratulacje!" );
		Font alfa = new Font("serif", Font.ITALIC, 24);
		gratulacje.setFont(alfa);
		gratulacje.setForeground(Color.MAGENTA);
		ramka.getContentPane().add(BorderLayout.CENTER, koniecHistoryjki);
		ramka.getContentPane().add(BorderLayout.WEST, pomocniczy);
		BoxLayout nowySposob=new BoxLayout(koniecHistoryjki, BoxLayout.Y_AXIS);
		koniecHistoryjki.setLayout(nowySposob);
		historia1.setText("Kolorowe Kr�liki s� z Ciebie dumne! Pokona�e� Z�ego Soko�a, a one mog� teraz znowu cieszy� si� wsp�lnym hasaniem po ��kach i zmienianiem kolor�w.");
		historia1.setFont(alfa);
		koniecHistoryjki.add(historia1);
		ImageIcon wesoleKroliki=new ImageIcon("data/koniec.png");
		obrazek.setForeground(Color.WHITE);
		obrazek.setIcon(wesoleKroliki);
		koniecHistoryjki.add(obrazek);
		historia2.setText("Oczyiscie wci�� mo�esz wraca� do gry, by poprawic swoje wyniki, ale Kolorowym Krolikom juz nic nie zagra�a.");
		historia2.setFont(alfa);
		koniecHistoryjki.add(historia2);
		ramka.getContentPane().add(BorderLayout.SOUTH, doPrzycisku);
		doMenu.setText("Powr�� do menu");
		doPrzycisku.add(doMenu);
		doMenu.addActionListener(this);
		//ramka.pack();
	}
	
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==doMenu) {
			Levels twojeLevele=new Levels();
			ramka.setVisible(false);
			twojeLevele.pokazLevele();
		}
	}
}
