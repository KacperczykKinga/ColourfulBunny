import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Levels implements ActionListener{
JFrame zLevelami=new JFrame();
JPanel duzoLeveli=new JPanel();
JScrollPane przewijacz=new JScrollPane(duzoLeveli);
JPanel kanwa=new JPanel();
JPanel naPowitanie=new JPanel();
JLabel powitanie=new JLabel();
JButton level1=new JButton();
JButton level2=new JButton();
JButton level3=new JButton();
JButton level4=new JButton();
JButton level5=new JButton();
JButton level6=new JButton();
JButton level7=new JButton();
JButton level8=new JButton();
JButton level9=new JButton();
JButton level10=new JButton();
JButton level11=new JButton();
JButton level12=new JButton();
JButton level13=new JButton();
JButton level14=new JButton();
JButton level15=new JButton();
JButton level16=new JButton();
JButton level17=new JButton();
JButton level18=new JButton();
JButton level19=new JButton();
JButton level20=new JButton();
JButton level21=new JButton();
JButton level22=new JButton();
JButton level23=new JButton();
JButton level24=new JButton();
JButton level25=new JButton();
JButton level26=new JButton();
JButton level27=new JButton();
JButton level28=new JButton();
JButton level29=new JButton();
JButton level30=new JButton();
JButton level31=new JButton();
JButton level32=new JButton();
JButton level33=new JButton();
JButton level34=new JButton();
JButton level35=new JButton();
JButton level36=new JButton();
JButton level37=new JButton();
JButton level38=new JButton();
JButton level39=new JButton();
JButton level40=new JButton();
JButton level41=new JButton();
JButton level42=new JButton();
JButton level43=new JButton();
JButton level44=new JButton();
JButton level45=new JButton();
JButton level46=new JButton();
JButton level47=new JButton();
JButton level48=new JButton();
JButton level49=new JButton();
JButton level50=new JButton();
JButton level51=new JButton();
JButton level52=new JButton();
JButton level53=new JButton();
JButton level54=new JButton();
JButton level55=new JButton();
JButton level56=new JButton();
JButton level57=new JButton();
JButton level58=new JButton();
JButton level59=new JButton();
JButton level60=new JButton();
JButton level61=new JButton();
JButton level62=new JButton();
JButton level63=new JButton();
JButton level64=new JButton();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
 public void pokazLevele() {
		//ustawia ramke
		zLevelami.setSize(1000, 900);
		zLevelami.setVisible(true);
		zLevelami.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zLevelami.setForeground(Color.DARK_GRAY);
		//ustawia tekst "Tak wygladaja Twoje poziomy"
		zLevelami.getContentPane().add(BorderLayout.NORTH, naPowitanie);
		powitanie.setText("Tak wygl¹daja Twoje poziomy");
		Font alfa= new Font("serif", Font.ITALIC, 25);
		powitanie.setFont(alfa);
		naPowitanie.add(powitanie);
		//tworzy JScrolla do przewijania poziomów
		przewijacz.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		przewijacz.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		przewijacz.setPreferredSize(new Dimension(900,Toolkit.getDefaultToolkit().getScreenSize().height - 780));
		zLevelami.getContentPane().add(BorderLayout.CENTER, kanwa);
		kanwa.add(przewijacz);
		//dodaje przyciski ktore prowadza do poszczegolnych poziomow
		int poziomObecny = 0;
		try {
			File plikOdPoziomow = new File("daneDoPoziomow.txt");
			FileReader czytaj = new FileReader(plikOdPoziomow);
			poziomObecny = czytaj.read() - 48;
		} catch (Exception e) {
			e.printStackTrace();
		}
		JButton[] tablicaPrzyciskow = { level1, level2, level3, level4, level5, level6, level7, level8, level9, level10,
				level11, level12, level13, level14, level15, level16, level17, level18, level19, level20, level21, level22, level23, level24,
				level25, level26, level27, level28, level29, level30, level31, level32, level33, level34, level35, level36, level37, level38,
				level39, level40, level41, level42, level43, level44, level45, level46, level47, level48, level49, level50, level51, level52,
				level53, level54, level55, level56, level57, level58, level59, level60, level61, level62, level63, level64};
		for(int g=0;g<64;g++) {
			duzoLeveli.add(tablicaPrzyciskow[g]);
		}

		System.out.println(poziomObecny);
		String[] iloscRuchow=new String[64];
		try {
			File plikDoRuchow=new File("iloscRuchow.txt");
			FileReader czytacz=new FileReader(plikDoRuchow);
			BufferedReader wlasciwy=new BufferedReader(czytacz);
			String ruchy=wlasciwy.readLine();
		    iloscRuchow=ruchy.split("/");
		   // int k=iloscRuchow.length();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	//	System.out.println("Poziom obecny"+poziomObecny);
		for(int i =0;i<64;i++) {
			String cyfra=Integer.toString(i+1);
			if(Integer.parseInt(iloscRuchow[i])>0) {
				tablicaPrzyciskow[i].setText(cyfra+" level "+iloscRuchow[i]+" ruchow");
			}
			else {
			tablicaPrzyciskow[i].setText(cyfra+" level");
			}
			tablicaPrzyciskow[i].setFont(alfa);
			if(i<=poziomObecny) {
				tablicaPrzyciskow[i].setBackground(Color.PINK);
				tablicaPrzyciskow[i].addActionListener(this);
			}
		}
		
		
 }
 
 public void actionPerformed(ActionEvent a) {
		if(a.getSource()==level1) {
		zLevelami.setVisible(false);
		PierwszyLevel p=new PierwszyLevel();
		p.uruchom();
		}
		if(a.getSource()==level2) {
			zLevelami.setVisible(false);
			DrugiLevel p=new DrugiLevel();
			p.uruchom();
			}
		if(a.getSource()==level3) {
			zLevelami.setVisible(false);
			TrzeciLevel p=new TrzeciLevel();
			p.uruchom();
			}
		if(a.getSource()==level4) {
			zLevelami.setVisible(false);
			CzwartyLevel p=new CzwartyLevel();
			p.uruchom();
			}
		if(a.getSource()==level5) {
			zLevelami.setVisible(false);
			PiatyLevel p=new PiatyLevel();
			p.uruchom();
			}
		if(a.getSource()==level6) {
			zLevelami.setVisible(false);
			SzostyLevel p=new SzostyLevel();
			p.uruchom();
			}
		if(a.getSource()==level7) {
			zLevelami.setVisible(false);
			SiodmyLevel p=new SiodmyLevel();
			p.uruchom();
			}
		if(a.getSource()==level8) {
			zLevelami.setVisible(false);
			OsmyLevel p=new OsmyLevel();
			p.uruchom();
			}
		if(a.getSource()==level9) {
			zLevelami.setVisible(false);
			DziewiatyLevel p=new DziewiatyLevel();
			p.uruchom();
			}
		if(a.getSource()==level10) {
			zLevelami.setVisible(false);
			DziesiatyLevel p=new DziesiatyLevel();
			p.uruchom();
			}
		if(a.getSource()==level11) {
			zLevelami.setVisible(false);
			JedenastyLevel p=new JedenastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level12) {
			zLevelami.setVisible(false);
			DwunastyLevel p=new DwunastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level13) {
			zLevelami.setVisible(false);
			TrzynastyLevel p=new TrzynastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level14) {
			zLevelami.setVisible(false);
			CzternatyLevel p=new CzternatyLevel();
			p.uruchom();
		}
		if(a.getSource()==level15) {
			zLevelami.setVisible(false);
			PietnastyLevel p=new PietnastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level16) {
			zLevelami.setVisible(false);
			SzesnastyLevel p=new SzesnastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level17) {
			zLevelami.setVisible(false);
			SiedemnastyLevel p=new SiedemnastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level18) {
			zLevelami.setVisible(false);
			OsiemnastyLevel p=new OsiemnastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level19) {
			zLevelami.setVisible(false);
			DziewietnastyLevel p=new DziewietnastyLevel();
			p.uruchom();
		}
		if(a.getSource()==level20) {
			zLevelami.setVisible(false);
			DwudziestyLevel p=new DwudziestyLevel();
			p.uruchom();
		}
		if(a.getSource()==level21) {
			zLevelami.setVisible(false);
			Dwudziesty1Level p=new Dwudziesty1Level();
			p.uruchom();
		}
		if(a.getSource()==level22) {
			zLevelami.setVisible(false);
			Dwudziesty2Level p=new Dwudziesty2Level();
			p.uruchom();
		}
		if(a.getSource()==level23) {
			zLevelami.setVisible(false);
			Dwudziesty3Level p=new Dwudziesty3Level();
			p.uruchom();
		}
		if(a.getSource()==level24) {
			zLevelami.setVisible(false);
			Dwudziesty4Level p=new Dwudziesty4Level();
			p.uruchom();
		}
		if(a.getSource()==level25) {
			zLevelami.setVisible(false);
			Dwudziesty5Level p=new Dwudziesty5Level();
			p.uruchom();
		}
		if(a.getSource()==level26) {
			zLevelami.setVisible(false);
			Dwudziesty6Level p=new Dwudziesty6Level();
			p.uruchom();
		}
		if(a.getSource()==level27) {
			zLevelami.setVisible(false);
			Dwudziesty7Level p=new Dwudziesty7Level();
			p.uruchom();
		}
		if(a.getSource()==level28) {
			zLevelami.setVisible(false);
			Dwudziesty8Level p=new Dwudziesty8Level();
			p.uruchom();
		}
		if(a.getSource()==level29) {
			zLevelami.setVisible(false);
			Dwudziesty9Level p=new Dwudziesty9Level();
			p.uruchom();
		}
		if(a.getSource()==level30) {
			zLevelami.setVisible(false);
			TrzydziestyLevel p=new TrzydziestyLevel();
			p.uruchom();
		}
		if(a.getSource()==level31) {
			zLevelami.setVisible(false);
			Trzydziesty1Level p=new Trzydziesty1Level();
			p.uruchom();
		}
		if(a.getSource()==level32) {
			zLevelami.setVisible(false);
			Trzydziesty2Level p=new Trzydziesty2Level();
			p.uruchom();
		}
		if(a.getSource()==level33) {
			zLevelami.setVisible(false);
			Trzydziesty3Level p=new Trzydziesty3Level();
			p.uruchom();
		}
		if(a.getSource()==level34) {
			zLevelami.setVisible(false);
			Trzydziesty4Level p=new Trzydziesty4Level();
			p.uruchom();
		}
		if(a.getSource()==level35) {
			zLevelami.setVisible(false);
			Trzydziesty5Level p=new Trzydziesty5Level();
			p.uruchom();
		}
		if(a.getSource()==level36) {
			zLevelami.setVisible(false);
			Trzydziesty6Level p=new Trzydziesty6Level();
			p.uruchom();
		}
		if(a.getSource()==level37) {
			zLevelami.setVisible(false);
			Trzydziesty7Level p=new Trzydziesty7Level();
			p.uruchom();
		}
		if(a.getSource()==level38) {
			zLevelami.setVisible(false);
			Trzydziesty8Level p=new Trzydziesty8Level();
			p.uruchom();
		}
		if(a.getSource()==level39) {
			zLevelami.setVisible(false);
			Trzydziesty9Level p=new Trzydziesty9Level();
			p.uruchom();
		}
		if(a.getSource()==level40) {
			zLevelami.setVisible(false);
			CzterdziestyLevel p=new CzterdziestyLevel();
			p.uruchom();
		}
		if(a.getSource()==level41) {
			zLevelami.setVisible(false);
			Czterdziesty1Level p=new Czterdziesty1Level();
			p.uruchom();
		}
		if(a.getSource()==level42) {
			zLevelami.setVisible(false);
			Czterdziesty2Level p=new Czterdziesty2Level();
			p.uruchom();
		}
		if(a.getSource()==level43) {
			zLevelami.setVisible(false);
			Czterdziesty3Level p=new Czterdziesty3Level();
			p.uruchom();
		}
		if(a.getSource()==level44) {
			zLevelami.setVisible(false);
			Czterdziesty4Level p=new Czterdziesty4Level();
			p.uruchom();
		}
		if(a.getSource()==level45) {
			zLevelami.setVisible(false);
			Czterdziesty5Level p=new Czterdziesty5Level();
			p.uruchom();
		}
		if(a.getSource()==level46) {
			zLevelami.setVisible(false);
			Czterdziesty6Level p=new Czterdziesty6Level();
			p.uruchom();
		}
		if(a.getSource()==level47) {
			zLevelami.setVisible(false);
			Czterdziesty7Level p=new Czterdziesty7Level();
			p.uruchom();
		}
		if(a.getSource()==level48) {
			zLevelami.setVisible(false);
			Czterdziesty8Level p=new Czterdziesty8Level();
			p.uruchom();
		}
		if(a.getSource()==level49) {
			zLevelami.setVisible(false);
			Czterdziesty9Level p=new Czterdziesty9Level();
			p.uruchom();
		}
		if(a.getSource()==level50) {
			zLevelami.setVisible(false);
			PiecdziesiatyLevel p=new PiecdziesiatyLevel();
			p.uruchom();
		}
		if(a.getSource()==level51) {
			zLevelami.setVisible(false);
			Piecdziesiaty1Level p=new Piecdziesiaty1Level();
			p.uruchom();
		}
		if(a.getSource()==level52) {
			zLevelami.setVisible(false);
			Piecdziesiaty2Level p=new Piecdziesiaty2Level();
			p.uruchom();
		}
		if(a.getSource()==level53) {
			zLevelami.setVisible(false);
			Piecdziesiaty3Level p=new Piecdziesiaty3Level();
			p.uruchom();
		}
		if(a.getSource()==level54) {
			zLevelami.setVisible(false);
			Piecdziesiaty4Level p=new Piecdziesiaty4Level();
			p.uruchom();
		}
		if(a.getSource()==level55) {
			zLevelami.setVisible(false);
			Piecdziesiaty5Level p=new Piecdziesiaty5Level();
			p.uruchom();
		}
		if(a.getSource()==level56) {
			zLevelami.setVisible(false);
			Piecdziesiaty6Level p=new Piecdziesiaty6Level();
			p.uruchom();
		}
		if(a.getSource()==level57) {
			zLevelami.setVisible(false);
			Piecdziesiaty7Level p=new Piecdziesiaty7Level();
			p.uruchom();
		}
		if(a.getSource()==level58) {
			zLevelami.setVisible(false);
			Piecdziesiaty8Level p=new Piecdziesiaty8Level();
			p.uruchom();
		}
		if(a.getSource()==level59) {
			zLevelami.setVisible(false);
			Piecdziesiaty9Level p=new Piecdziesiaty9Level();
			p.uruchom();
		}
		if(a.getSource()==level60) {
			zLevelami.setVisible(false);
			SzescdziesiatyLevel p=new SzescdziesiatyLevel();
			p.uruchom();
		}
		if(a.getSource()==level61) {
			zLevelami.setVisible(false);
			Szescdziesiaty1Level p=new Szescdziesiaty1Level();
			p.uruchom();
		}
		if(a.getSource()==level62) {
			zLevelami.setVisible(false);
			Szescdziesiaty2Level p=new Szescdziesiaty2Level();
			p.uruchom();
		}
		if(a.getSource()==level63) {
			zLevelami.setVisible(false);
			Szescdziesiaty3Level p=new Szescdziesiaty3Level();
			p.uruchom();
		}
		if(a.getSource()==level64) {
			zLevelami.setVisible(false);
			Szescdziesiaty4Level p=new Szescdziesiaty4Level();
			p.uruchom();
		}
		
	}
}
