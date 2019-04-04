import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Wygrane implements ActionListener{
JFrame ramkaWygranych=new JFrame();
JPanel doNapisu=new JPanel();
JLabel napis = new JLabel();
JButton kolejny=new JButton();
JButton menu=new JButton();
JPanel doBrawo=new JPanel();
JPanel doPrzycisku=new JPanel();
JLabel brawo=new JLabel();
int Poziom=0;
JFrame ramkaDoUsuniecia=new JFrame();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Wygrane(int poziom, JFrame ramka) {
		Poziom=poziom;
		ramkaDoUsuniecia=ramka;
	}
	
	public void wygrales(int poziom, int wynik) {
		Font alfa = new Font("serif", Font.ITALIC, 34);
		//ustawia ramke
		ramkaWygranych.setSize(1600, 950);
		ramkaWygranych.setVisible(true);
		ramkaWygranych.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramkaWygranych.setForeground(Color.DARK_GRAY);
		ramkaWygranych.getContentPane().add(BorderLayout.CENTER, doNapisu);
		ramkaWygranych.getContentPane().add(BorderLayout.NORTH, doBrawo);
		ramkaWygranych.getContentPane().add(BorderLayout.SOUTH, doPrzycisku);
		brawo.setText("Brawo!");
		brawo.setFont(alfa);
		doBrawo.add(brawo);
		napis.setText(" Wygra³eœ w "+wynik+" ruchach");
		napis.setFont(alfa);
		doNapisu.add(napis);
		kolejny.setText("Nastepny poziom");
		menu.setText("Wróæ do menu");
		doPrzycisku.add(menu);
		doPrzycisku.add(kolejny);
		kolejny.addActionListener(this);
		menu.addActionListener(this);
		
		String[] iloscRuchow=new String[64];
		try {
			File plikDoRuchow=new File("iloscRuchow.txt");
			FileReader czytacz=new FileReader(plikDoRuchow);
			BufferedReader wlasciwy=new BufferedReader(czytacz);
			String ruchy=wlasciwy.readLine();
		    iloscRuchow=ruchy.split("/");
		    wlasciwy.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(Integer.parseInt(iloscRuchow[poziom-1])==0) { ////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		try {
		//File plik=new File();
		FileWriter zapis=new FileWriter("daneDoPoziomow.txt");
		System.out.println("POZIOM"+poziom);
		zapis.write(poziom+48);
		zapis.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
		
		try {
			FileWriter zapis2=new FileWriter("iloscRuchow.txt");
		    for(int i=0;i<64;i++) {
		    	if(poziom-1==i) {
		    		if(Integer.parseInt(iloscRuchow[i])==0)
		    		zapis2.write(Integer.toString(wynik)+"/");
		    		else if(wynik<=Integer.parseInt(iloscRuchow[i])){
		    			zapis2.write(Integer.toString(wynik)+"/");
		    		}
		    		else if(wynik>Integer.parseInt(iloscRuchow[i])) {
		    			zapis2.write(iloscRuchow[i]+"/");
		    		}
		    	}
		    	else {
		    	zapis2.write(iloscRuchow[i]+"/");
		    	}
		    }
		  //  zapis2.write(0+"/");
		    zapis2.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ramkaWygranych.pack();
	
		
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==menu) {
			Levels levele=new Levels();
			ramkaWygranych.setVisible(false);
			ramkaDoUsuniecia.setVisible(false);
			levele.pokazLevele();
		}
		if(a.getSource()==kolejny) {
			//Levels twojeLevele=new Levels();
			ramkaWygranych.setVisible(false);
			ramkaDoUsuniecia.setVisible(false);
			//twojeLevele.pokazLevele();
			if(Poziom==1) {
				DrugiLevel drugi=new DrugiLevel();
				drugi.uruchom();
			}
			if(Poziom==2) {
				TrzeciLevel trzeci=new TrzeciLevel();
				trzeci.uruchom();
			}
			if(Poziom==3) {
				CzwartyLevel czwarty=new CzwartyLevel();
				czwarty.uruchom();
			}
			if(Poziom==4) {
				PiatyLevel piaty=new PiatyLevel();
				piaty.uruchom();
			}
			if(Poziom==5) {
				SzostyLevel szosty= new SzostyLevel();
				szosty.uruchom();
			}
			if(Poziom==6) {
				SiodmyLevel siodmy=new SiodmyLevel();
				siodmy.uruchom();
			}
			if(Poziom==7) {
				OsmyLevel siodmy=new OsmyLevel();
				siodmy.uruchom();
			}
			if(Poziom==8) {
				DziewiatyLevel dziewiaty=new DziewiatyLevel();
				dziewiaty.uruchom();
			}
			if(Poziom==9) {
				DziesiatyLevel dziesiaty=new DziesiatyLevel();
				dziesiaty.uruchom();
			}
			if(Poziom==10) {
				JedenastyLevel jedenasty=new JedenastyLevel();
				jedenasty.uruchom();
			}
			if(Poziom==11) {
				DwunastyLevel dwunasty=new DwunastyLevel();
				dwunasty.uruchom();
			}
			if(Poziom==12) {
				TrzynastyLevel trzynasty=new TrzynastyLevel();
				trzynasty.uruchom();
			}
			if(Poziom==13) {
				CzternatyLevel czternasty=new CzternatyLevel();
				czternasty.uruchom();
			}
			if(Poziom==14) {
				PietnastyLevel pietnasty=new PietnastyLevel();
				pietnasty.uruchom();
			}
			if(Poziom==15) {
				SzesnastyLevel szesnasty=new SzesnastyLevel();
				szesnasty.uruchom();
			}
			if(Poziom==16) {
				SiedemnastyLevel siedemnasty=new SiedemnastyLevel();
				siedemnasty.uruchom();
			}
			if(Poziom==17) {
				OsiemnastyLevel osiemnasty=new OsiemnastyLevel();
				osiemnasty.uruchom();
			}
			if(Poziom==18) {
				DziewietnastyLevel dziewietnasty=new DziewietnastyLevel();
				dziewietnasty.uruchom();
			}
			if(Poziom==19) {
				DwudziestyLevel dwudziesty=new DwudziestyLevel();
				dwudziesty.uruchom();
			}
			if(Poziom==20) {
				Dwudziesty1Level dwudziesty1=new Dwudziesty1Level();
				dwudziesty1.uruchom();
			}
			if(Poziom==21) {
				Dwudziesty2Level dwudziesty2=new Dwudziesty2Level();
				dwudziesty2.uruchom();
			}
			if(Poziom==22) {
				Dwudziesty3Level dwudziesty3=new Dwudziesty3Level();
				dwudziesty3.uruchom();
			}
			if(Poziom==23) {
				Dwudziesty4Level dwudziesty4=new Dwudziesty4Level();
				dwudziesty4.uruchom();
			}
			if(Poziom==24) {
				Dwudziesty5Level dwudziesty5=new Dwudziesty5Level();
				dwudziesty5.uruchom();
			}
			if(Poziom==25) {
				Dwudziesty6Level dwudziesty6=new Dwudziesty6Level();
				dwudziesty6.uruchom();
			}
			if(Poziom==26) {
				Dwudziesty7Level dwudziesty7=new Dwudziesty7Level();
				dwudziesty7.uruchom();
			}
			if(Poziom==27) {
				Dwudziesty8Level dwudziesty8=new Dwudziesty8Level();
				dwudziesty8.uruchom();
			}
			if(Poziom==28) {
				Dwudziesty9Level dwudziesty9=new Dwudziesty9Level();
				dwudziesty9.uruchom();
			}
			if(Poziom==29) {
				TrzydziestyLevel trzydziesty=new TrzydziestyLevel();
				trzydziesty.uruchom();
			}
			if(Poziom==30) {
				Trzydziesty1Level trzydziesty1=new Trzydziesty1Level();
				trzydziesty1.uruchom();
			}
			if(Poziom==31) {
				Trzydziesty2Level trzydziesty2=new Trzydziesty2Level();
				trzydziesty2.uruchom();
			}
			if(Poziom==32) {
				Trzydziesty3Level trzydziesty3=new Trzydziesty3Level();
				trzydziesty3.uruchom();
			}
			if(Poziom==33) {
				Trzydziesty4Level trzydziesty4=new Trzydziesty4Level();
				trzydziesty4.uruchom();
			}
			if(Poziom==34) {
				Trzydziesty5Level trzydziesty5=new Trzydziesty5Level();
				trzydziesty5.uruchom();
			}
			if(Poziom==35) {
				Trzydziesty6Level trzydziesty6=new Trzydziesty6Level();
				trzydziesty6.uruchom();
			}
			if(Poziom==36) {
				Trzydziesty7Level trzydziesty7=new Trzydziesty7Level();
				trzydziesty7.uruchom();
			}
			if(Poziom==37) {
				Trzydziesty8Level trzydziesty8=new Trzydziesty8Level();
				trzydziesty8.uruchom();
			}
			if(Poziom==38) {
				Trzydziesty9Level trzydziesty9=new Trzydziesty9Level();
				trzydziesty9.uruchom();
			}
			if(Poziom==39) {
				CzterdziestyLevel czterdziesty=new CzterdziestyLevel();
				czterdziesty.uruchom();
			}
			if(Poziom==40) {
				Czterdziesty1Level czterdziesty1=new Czterdziesty1Level();
				czterdziesty1.uruchom();
			}
			if(Poziom==41) {
				Czterdziesty2Level czterdziesty2=new Czterdziesty2Level();
				czterdziesty2.uruchom();
			}
			if(Poziom==42) {
				Czterdziesty3Level czterdziesty3=new Czterdziesty3Level();
				czterdziesty3.uruchom();
			}
			if(Poziom==43) {
				Czterdziesty4Level czterdziesty4=new Czterdziesty4Level();
				czterdziesty4.uruchom();
			}
			if(Poziom==44) {
				Czterdziesty5Level czterdziesty5=new Czterdziesty5Level();
				czterdziesty5.uruchom();
			}
			if(Poziom==45) {
				Czterdziesty6Level czterdziesty6=new Czterdziesty6Level();
				czterdziesty6.uruchom();
			}
			if(Poziom==46) {
				Czterdziesty7Level czterdziesty7=new Czterdziesty7Level();
				czterdziesty7.uruchom();
			}
			if(Poziom==47) {
				Czterdziesty8Level czterdziesty8=new Czterdziesty8Level();
				czterdziesty8.uruchom();
			}
			if(Poziom==48) {
				Czterdziesty9Level czterdziesty9=new Czterdziesty9Level();
				czterdziesty9.uruchom();
			}
			if(Poziom==49) {
				PiecdziesiatyLevel piecdziesiaty=new PiecdziesiatyLevel();
				piecdziesiaty.uruchom();
			}
			if(Poziom==50) {
				Piecdziesiaty1Level piecdziesiaty1=new Piecdziesiaty1Level();
				piecdziesiaty1.uruchom();
			}
			if(Poziom==51) {
				Piecdziesiaty2Level piecdziesiaty2=new Piecdziesiaty2Level();
				piecdziesiaty2.uruchom();
			}
			if(Poziom==52) {
				Piecdziesiaty3Level piecdziesiaty3=new Piecdziesiaty3Level();
				piecdziesiaty3.uruchom();
			}
			if(Poziom==53) {
				Piecdziesiaty4Level piecdziesiaty4=new Piecdziesiaty4Level();
				piecdziesiaty4.uruchom();
			}
			if(Poziom==54) {
				Piecdziesiaty5Level piecdziesiaty5=new Piecdziesiaty5Level();
				piecdziesiaty5.uruchom();
			}
			if(Poziom==55) {
				Piecdziesiaty6Level piecdziesiaty6=new Piecdziesiaty6Level();
				piecdziesiaty6.uruchom();
			}
			if(Poziom==56) {
				Piecdziesiaty7Level piecdziesiaty7=new Piecdziesiaty7Level();
				piecdziesiaty7.uruchom();
			}
			if(Poziom==57) {
				Piecdziesiaty8Level piecdziesiaty8=new Piecdziesiaty8Level();
				piecdziesiaty8.uruchom();
			}
			if(Poziom==58) {
				Piecdziesiaty9Level piecdziesiaty9=new Piecdziesiaty9Level();
				piecdziesiaty9.uruchom();
			}
			if(Poziom==59) {
				SzescdziesiatyLevel szescdziesiaty=new SzescdziesiatyLevel();
				szescdziesiaty.uruchom();
			}
			if(Poziom==60) {
				Szescdziesiaty1Level szescdziesiaty1=new Szescdziesiaty1Level();
				szescdziesiaty1.uruchom();
			}
			if(Poziom==61) {
				Szescdziesiaty2Level szescdziesiaty2=new Szescdziesiaty2Level();
				szescdziesiaty2.uruchom();
			}
			if(Poziom==62) {
				Szescdziesiaty3Level szescdziesiaty3=new Szescdziesiaty3Level();
				szescdziesiaty3.uruchom();
			}
			if(Poziom==63) {
				Szescdziesiaty4Level szescdziesiaty4=new Szescdziesiaty4Level();
				szescdziesiaty4.uruchom();
			}
			if(Poziom==64) {
				Koniec koniec=new Koniec();
				koniec.toJuzJestKoniec();
			}
		}
	}
}
