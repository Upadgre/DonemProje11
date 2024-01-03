package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YabancıDilKategori extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int puan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YabancıDilKategori dilFrame = new YabancıDilKategori();
					dilFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public YabancıDilKategori() {
		puan =0;
		setTitle("Ünlü Tahmini Bilgi Yarışması");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//giriş sayfası

		JPanel dilGirisPaneli = new JPanel();
		dilGirisPaneli.setBounds(0, 0, 662, 363);
		contentPane.add(dilGirisPaneli);
		dilGirisPaneli.setLayout(null);
		dilGirisPaneli.setVisible(true);

		JLabel dilGirisMesaj1 = new JLabel("Bu kategoride sana yabancı bir dil göstereceğim");
		dilGirisMesaj1.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilGirisMesaj1.setHorizontalAlignment(SwingConstants.CENTER);
		dilGirisMesaj1.setBounds(21, 74, 613, 99);
		dilGirisPaneli.add(dilGirisMesaj1);

		JLabel dilGirisMesaj2 = new JLabel("Sen de onun hangi dil olduğunu tahmin edeceksin.");
		dilGirisMesaj2.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilGirisMesaj2.setHorizontalAlignment(SwingConstants.CENTER);
		dilGirisMesaj2.setBounds(45, 145, 572, 76);
		dilGirisPaneli.add(dilGirisMesaj2);

        //Paneller

		JPanel dilSoru1 = new JPanel();
		dilSoru1.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru1);
		dilSoru1.setLayout(null);
		dilSoru1.setVisible(false);


		JPanel dilSoru2 = new JPanel();
		dilSoru2.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru2);
		dilSoru2.setVisible(false);

		JPanel dilSoru3 = new JPanel();
		dilSoru3.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru3);
		dilSoru3.setLayout(null);
		dilSoru3.setVisible(false);


		JPanel dilSoru4 = new JPanel();
		dilSoru4.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru4);
		dilSoru4.setLayout(null);
		dilSoru4.setVisible(false);

		JPanel dilSoru5 = new JPanel();
		dilSoru5.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru5);
		dilSoru5.setLayout(null);
		dilSoru5.setVisible(false);

		JPanel dilSoru6 = new JPanel();
		dilSoru6.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru6);
		dilSoru6.setVisible(false);

		JPanel dilSoru7 = new JPanel();
		dilSoru7.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru7);
		dilSoru7.setLayout(null);
		dilSoru7.setVisible(false);

		JPanel dilSoru8 = new JPanel();
		dilSoru8.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru8);
		dilSoru8.setLayout(null);
		dilSoru8.setVisible(false);

		JPanel dilSoru9 = new JPanel();
		dilSoru9.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru9);
		dilSoru9.setLayout(null);
		dilSoru9.setVisible(false);

		JPanel dilSoru10 = new JPanel();
		dilSoru10.setBounds(0, 0, 662, 363);
		contentPane.add(dilSoru10);
		dilSoru10.setLayout(null);
		dilSoru10.setVisible(false);

		JPanel sonucEkrani_dil = new JPanel();
		sonucEkrani_dil.setBounds(0, 0, 662, 363);
		contentPane.add(sonucEkrani_dil);
		sonucEkrani_dil.setLayout(null);
		
		
		//opaklık ayarı
				dilGirisPaneli.setOpaque(false);
				dilSoru1.setOpaque(false);
				dilSoru2.setOpaque(false);
				dilSoru3.setOpaque(false);
				dilSoru4.setOpaque(false);
				dilSoru5.setOpaque(false);
				dilSoru6.setOpaque(false);
				dilSoru7.setOpaque(false);
				dilSoru8.setOpaque(false);
				dilSoru9.setOpaque(false);
				dilSoru10.setOpaque(false);
				sonucEkrani_dil.setOpaque(false);
				
				
				
	
		//Soru Textleri
		//1.Soru Sayfası

		JLabel dilSoru1_sorubaslik = new JLabel("Soru 1 :");
		dilSoru1_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru1_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru1_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru1.add(dilSoru1_sorubaslik);

		JLabel dilSoru1_soru = new JLabel("\"उमीत शिक्षक बहुत हैंडसम हैं।");
		dilSoru1_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 31));
		dilSoru1_soru.setBounds(95, 104, 420, 116);
		dilSoru1.add(dilSoru1_soru);

		//2.Soru Sayfası

		JLabel dilSoru2_sorubaslik = new JLabel("Soru 2 :");
		dilSoru2_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru2_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru2_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru2.add(dilSoru2_sorubaslik);

		JLabel dilSoru2_soru = new JLabel("\"La vita è un'arte e ogni giorno offre l'opportunità di creare un capolavoro nuovo.\"");
		dilSoru2_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		dilSoru2_soru.setBounds(31, 104, 600, 116);
		dilSoru2.add(dilSoru2_soru);
		
		//3.Soru Sayfası

		JLabel dilSoru3_sorubaslik = new JLabel("Soru 3 :");
		dilSoru3_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru3_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru3_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru3.add(dilSoru3_sorubaslik);

		JLabel dilSoru3_soru = new JLabel("사랑은 끝이 없는 여행이다.");
		dilSoru3_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 22));
		dilSoru3_soru.setBounds(95, 104, 420, 116);
		dilSoru3.add(dilSoru3_soru);
		
		//4.Soru Sayfası

		JLabel dilSoru4_sorubaslik = new JLabel("Soru 4 :");
		dilSoru4_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru4_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru4_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru4.add(dilSoru4_sorubaslik);

		JLabel dilSoru4_soru = new JLabel("Η αγάπη είναι η γλώσσα που μιλά η ψυχή.");
		dilSoru4_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
		dilSoru4_soru.setBounds(95, 104, 420, 116);
		dilSoru4.add(dilSoru4_soru);
		
		//5.Soru Sayfası

		JLabel dilSoru5_sorubaslik = new JLabel("Soru 5 :");
		dilSoru5_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru5_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru5_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru5.add(dilSoru5_sorubaslik);

		JLabel dilSoru5_soru = new JLabel("ความรักคือแรงบันดาลใจในการดำเนินชีวิต");
		dilSoru5_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
		dilSoru5_soru.setBounds(95, 104, 420, 116);
		dilSoru5.add(dilSoru5_soru);
		
		//6.Soru Sayfası

		JLabel dilSoru6_sorubaslik = new JLabel("Soru 6 :");
		dilSoru6_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru6_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru6_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru6.add(dilSoru6_sorubaslik);

		JLabel dilSoru6_soru = new JLabel("El amor todo lo puede.");
		dilSoru6_soru.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dilSoru6_soru.setBounds(95, 104, 420, 116);
		dilSoru6.add(dilSoru6_soru);
		
		//7.Soru Sayfası

		JLabel dilSoru7_sorubaslik = new JLabel("Soru 7 :");
		dilSoru7_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru7_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru7_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru7.add(dilSoru7_sorubaslik);

		JLabel dilSoru7_soru = new JLabel("La véritable générosité envers l'avenir consiste à tout donner au présent.");
		dilSoru7_soru.setBounds(95, 104, 420, 116);
		dilSoru7.add(dilSoru7_soru);
		
		//8.Soru Sayfası

		JLabel dilSoru8_sorubaslik = new JLabel("Soru 8 :");
		dilSoru8_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru8_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru8_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru8.add(dilSoru8_sorubaslik);

		JLabel dilSoru8_soru = new JLabel("愛不是目睹皆真，感受皆是真實。");
		dilSoru8_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 21));
		dilSoru8_soru.setBounds(95, 104, 420, 116);
		dilSoru8.add(dilSoru8_soru);
		
		//9.Soru Sayfası

		JLabel dilSoru9_sorubaslik = new JLabel("Soru 9 :");
		dilSoru9_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru9_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru9_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru9.add(dilSoru9_sorubaslik);

		JLabel dilSoru9_soru = new JLabel("Cinta sejati tak pernah pudar, bahkan seiring waktu, ia semakin bersinar");
		dilSoru9_soru.setBounds(95, 104, 420, 116);
		dilSoru9.add(dilSoru9_soru);
		//10.Soru Sayfası

		JLabel dilSoru10_sorubaslik = new JLabel("Soru 10 :");
		dilSoru10_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dilSoru10_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dilSoru10_sorubaslik.setBounds(85, 54, 130, 39);
		dilSoru10.add(dilSoru10_sorubaslik);

		JLabel dilSoru10_soru = new JLabel("愛は世界を回す力です。");
		dilSoru10_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 21));
		dilSoru10_soru.setBounds(95, 104, 420, 116);
		dilSoru10.add(dilSoru10_soru);
		
		//sonuc ekranı sonuc textleri
		
		JLabel sonucuGostermeMesaji_dil = new JLabel("Sonuç ekranını görmek için tıkla:");
		sonucuGostermeMesaji_dil.setHorizontalAlignment(SwingConstants.CENTER);
		sonucuGostermeMesaji_dil.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		sonucuGostermeMesaji_dil.setBounds(44, 73, 557, 71);
		sonucEkrani_dil.add(sonucuGostermeMesaji_dil);
		
		JButton sonucEkraniGotur_dil = new JButton("Sonuç Ekranı");
		sonucEkraniGotur_dil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonucEkrani frame2= new sonucEkrani();
				frame2.setVisible(true);
				dispose();
			}
		});
		sonucEkraniGotur_dil.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		sonucEkraniGotur_dil.setBounds(151, 211, 345, 87);
		sonucEkrani_dil.add(sonucEkraniGotur_dil);
		sonucEkrani_dil.setVisible(false);

		

		//1. Soru ekranı butonları
		//1.buton

		JButton dilSoru1_1 = new JButton("Hintçe");
		dilSoru1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru1.setVisible(false);
				dilSoru2.setVisible(true);
			}
		});
		dilSoru1_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru1_1.setBounds(85, 231, 200, 50);
		dilSoru1.add(dilSoru1_1);

		//2.buton

		JButton dilSoru1_2 = new JButton("Urduca");
		dilSoru1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru1.setVisible(false);
				dilSoru2.setVisible(true);
			}
		});
		dilSoru1_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru1_2.setBounds(377, 231, 200, 50);
		dilSoru1.add(dilSoru1_2);

		//3.buton

		JButton dilSoru1_3 = new JButton("Bengalce");
		dilSoru1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru1.setVisible(false);
				dilSoru2.setVisible(true);
			}
		});
		dilSoru1_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru1_3.setBounds(85, 292, 200, 50);
		dilSoru1.add(dilSoru1_3);

		//4.buton

		JButton dilSoru1_4 = new JButton("Tayca");
		dilSoru1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru1.setVisible(false);
				dilSoru2.setVisible(true);
			}
		});
		dilSoru1_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru1_4.setBounds(377, 292, 200, 50);
		dilSoru1.add(dilSoru1_4);

		//2. soru ekranı butonları
        //1. buton
		
		JButton dilSoru2_1 = new JButton("Fransızca");
		dilSoru2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru2.setVisible(false);
				dilSoru3.setVisible(true);
			}
		});
		dilSoru2.setLayout(null);
		dilSoru2_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru2_1.setBounds(85, 231, 200, 50);
		dilSoru2.add(dilSoru2_1);
		
        //2 buton
		
		JButton dilSoru2_2 = new JButton("İspanyolca");
		dilSoru2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru2.setVisible(false);
				dilSoru3.setVisible(true);
			}
		});
		dilSoru2_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru2_2.setBounds(377, 231, 200, 50);
		dilSoru2.add(dilSoru2_2);
		
		//3.buton

		JButton dilSoru2_3 = new JButton("İtalyanca");
		dilSoru2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru2.setVisible(false);
				dilSoru3.setVisible(true);
			}
		});
		dilSoru2_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru2_3.setBounds(85, 292, 200, 50);
		dilSoru2.add(dilSoru2_3);
		
		//4.buton

		JButton dilSoru2_4 = new JButton("Almanca");
		dilSoru2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru2.setVisible(false);
				dilSoru3.setVisible(true);
			}
		});
		dilSoru2_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru2_4.setBounds(377, 292, 200, 50);
		dilSoru2.add(dilSoru2_4);

		//3. Soru ekranı butonları
		//1.buton

		JButton dilSoru3_1 = new JButton("Çince");
		dilSoru3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru3.setVisible(false);
				dilSoru4.setVisible(true);
			}
		});
		dilSoru3_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru3_1.setBounds(85, 231, 200, 50);
		dilSoru3.add(dilSoru3_1);

		//2.buton

		JButton dilSoru3_2 = new JButton("Korece");
		dilSoru3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru3.setVisible(false);
				dilSoru4.setVisible(true);
			}
		});
		dilSoru3_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru3_2.setBounds(377, 231, 200, 50);
		dilSoru3.add(dilSoru3_2);

		//3.buton

		JButton dilSoru3_3 = new JButton("Japonca");
		dilSoru3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru3.setVisible(false);
				dilSoru4.setVisible(true);
			}
		});
		dilSoru3_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru3_3.setBounds(85, 292, 200, 50);
		dilSoru3.add(dilSoru3_3);

		//4.buton

		JButton dilSoru3_4 = new JButton("Tayca");
		dilSoru3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru3.setVisible(false);
				dilSoru4.setVisible(true);
			}
		});
		dilSoru3_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru3_4.setBounds(377, 292, 200, 50);
		dilSoru3.add(dilSoru3_4);

		//4. Soru ekranı butonları
		//1.buton

		JButton dilSoru4_1 = new JButton("Yunanca");
		dilSoru4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru4.setVisible(false);
				dilSoru5.setVisible(true);
			}
		});
		dilSoru4_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru4_1.setBounds(85, 231, 200, 50);
		dilSoru4.add(dilSoru4_1);

		//2.buton

		JButton dilSoru4_2 = new JButton("Rusça");
		dilSoru4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru4.setVisible(false);
				dilSoru5.setVisible(true);
			}
		});
		dilSoru4_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru4_2.setBounds(377, 231, 200, 50);
		dilSoru4.add(dilSoru4_2);

		//3.buton

		JButton dilSoru4_3 = new JButton("Fasça");
		dilSoru4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru4.setVisible(false);
				dilSoru5.setVisible(true);
			}
		});
		dilSoru4_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru4_3.setBounds(85, 292, 200, 50);
		dilSoru4.add(dilSoru4_3);

		//4.buton

		JButton dilSoru4_4 = new JButton("Romanca");
		dilSoru4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru4.setVisible(false);
				dilSoru5.setVisible(true);
			}
		});
		dilSoru4_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru4_4.setBounds(377, 292, 200, 50);
		dilSoru4.add(dilSoru4_4);

		//5. soru ekranı butonları
		//1.buton

		JButton dilSoru5_1 = new JButton("Laoca");
		dilSoru5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru5.setVisible(false);
				dilSoru6.setVisible(true);
			}
		});
		dilSoru5.setLayout(null);
		dilSoru5_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru5_1.setBounds(85, 231, 200, 50);
		dilSoru5.add(dilSoru5_1);

		//2.buton

		JButton dilSoru5_2 = new JButton("Hintçe");
		dilSoru5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru5.setVisible(false);
				dilSoru6.setVisible(true);
			}
		});
		dilSoru5_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru5_2.setBounds(377, 231, 200, 50);
		dilSoru5.add(dilSoru5_2);

		//3.buton

		JButton dilSoru5_3 = new JButton("Tayca");
		dilSoru5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru5.setVisible(false);
				dilSoru6.setVisible(true);
			}
		});
		dilSoru5_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru5_3.setBounds(85, 292, 200, 50);
		dilSoru5.add(dilSoru5_3);

		//4.buton

		JButton dilSoru5_4 = new JButton("Lü Dili");
		dilSoru5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru5.setVisible(false);
				dilSoru6.setVisible(true);
			}
		});
		dilSoru5_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru5_4.setBounds(377, 292, 200, 50);
		dilSoru5.add(dilSoru5_4);

		//6. Soru ekranı butonları
		//1.buton

		JButton dilSoru6_1 = new JButton("Portekizce");
		dilSoru6_1.setBounds(85, 231, 200, 50);
		dilSoru6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru6.setVisible(false);
				dilSoru7.setVisible(true);
			}
		});
		dilSoru6.setLayout(null);
		dilSoru6_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru6.add(dilSoru6_1);

		//2.buton

		JButton dilSoru6_2 = new JButton("İtalyanca");
		dilSoru6_2.setBounds(377, 231, 200, 50);
		dilSoru6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru6.setVisible(false);
				dilSoru7.setVisible(true);
			}
		});
		dilSoru6_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru6.add(dilSoru6_2);

		//3.buton

		JButton dilSoru6_3 = new JButton("Fransızca");
		dilSoru6_3.setBounds(85, 292, 200, 50);
		dilSoru6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru6.setVisible(false);
				dilSoru7.setVisible(true);
			}
		});
		dilSoru6_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru6.add(dilSoru6_3);

		//4.buton

		JButton dilSoru6_4 = new JButton("İspanyolca");
		dilSoru6_4.setBounds(377, 292, 200, 50);
		dilSoru6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru6.setVisible(false);
				dilSoru7.setVisible(true);
			}
		});
		dilSoru6_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru6.add(dilSoru6_4);

		//7. Soru ekranı butonları
		//1.buton

		JButton dilSoru7_1 = new JButton("İtalyanca");
		dilSoru7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru7.setVisible(false);
				dilSoru8.setVisible(true);
			}
		});
		dilSoru7_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru7_1.setBounds(85, 231, 200, 50);
		dilSoru7.add(dilSoru7_1);

		//2.buton

		JButton dilSoru7_2 = new JButton("Fransızca");
		dilSoru7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru7.setVisible(false);
				dilSoru8.setVisible(true);
			}
		});
		dilSoru7_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru7_2.setBounds(377, 231, 200, 50);
		dilSoru7.add(dilSoru7_2);

		//3.buton

		JButton dilSoru7_3 = new JButton("İnglizce");
		dilSoru7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru7.setVisible(false);
				dilSoru8.setVisible(true);
			}
		});
		dilSoru7_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru7_3.setBounds(85, 292, 200, 50);
		dilSoru7.add(dilSoru7_3);

		//4.buton

		JButton dilSoru7_4 = new JButton("İspanyolca");
		dilSoru7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru7.setVisible(false);
				dilSoru8.setVisible(true);
			}
		});
		dilSoru7_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru7_4.setBounds(377, 292, 200, 50);
		dilSoru7.add(dilSoru7_4);

		//8. Soru ekranı butonları
		//1.buton

		JButton dilSoru8_1 = new JButton("Korece");
		dilSoru8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru8.setVisible(false);
				dilSoru9.setVisible(true);
			}
		});
		dilSoru8_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru8_1.setBounds(85, 231, 200, 50);
		dilSoru8.add(dilSoru8_1);

		//2.buton

		JButton dilSoru8_2 = new JButton("Tayca");
		dilSoru8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru8.setVisible(false);
				dilSoru9.setVisible(true);
			}
		});
		dilSoru8_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru8_2.setBounds(377, 231, 200, 50);
		dilSoru8.add(dilSoru8_2);

		//3.buton

		JButton dilSoru8_3 = new JButton("Japonca");
		dilSoru8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru8.setVisible(false);
				dilSoru9.setVisible(true);
			}
		});
		dilSoru8_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru8_3.setBounds(85, 292, 200, 50);
		dilSoru8.add(dilSoru8_3);

		//4.buton

		JButton dilSoru8_4 = new JButton("Çince");
		dilSoru8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru8.setVisible(false);
				dilSoru9.setVisible(true);
			}
		});
		dilSoru8_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru8_4.setBounds(377, 292, 200, 50);
		dilSoru8.add(dilSoru8_4);

		//9. soru ekranı butonları
		//1.buton

		JButton dilSoru9_1 = new JButton("Endonezce");
		dilSoru9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru9.setVisible(false);
				dilSoru10.setVisible(true);
			}
		});
		dilSoru9.setLayout(null);
		dilSoru9_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru9_1.setBounds(85, 231, 200, 50);
		dilSoru9.add(dilSoru9_1);

		//2.buton

		JButton dilSoru9_2 = new JButton("Malayca");
		dilSoru9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru9.setVisible(false);
				dilSoru10.setVisible(true);
			}
		});
		dilSoru9_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru9_2.setBounds(377, 231, 200, 50);
		dilSoru9.add(dilSoru9_2);

		//3.buton

		JButton dilSoru9_3 = new JButton("Filipince");
		dilSoru9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru9.setVisible(false);
				dilSoru10.setVisible(true);
			}
		});
		dilSoru9_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru9_3.setBounds(85, 292, 200, 50);
		dilSoru9.add(dilSoru9_3);

		//4.buton

		JButton dilSoru9_4 = new JButton("Cava Dili");
		dilSoru9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru9.setVisible(false);
				dilSoru10.setVisible(true);
			}
		});
		dilSoru9_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru9_4.setBounds(377, 292, 200, 50);
		dilSoru9.add(dilSoru9_4);

		//10. Soru ekranı butonları
		//1.buton

		JButton dilSoru10_1 = new JButton("Çince");
		dilSoru10_1.setBounds(85, 231, 200, 50);
		dilSoru10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru10.setVisible(false);
				sonucEkrani_dil.setVisible(true);
			}
		});
		dilSoru10.setLayout(null);
		dilSoru10_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru10.add(dilSoru10_1);

		//2.buton

		JButton dilSoru10_2 = new JButton("Korece");
		dilSoru10_2.setBounds(377, 231, 200, 50);
		dilSoru10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru10.setVisible(false);
				sonucEkrani_dil.setVisible(true);
			}
		});
		dilSoru10_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru10.add(dilSoru10_2);

		//3.buton

		JButton dilSoru10_3 = new JButton("Japonca");
		dilSoru10_3.setBounds(85, 292, 200, 50);
		dilSoru10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dilSoru10.setVisible(false);
				sonucEkrani_dil.setVisible(true);
			}
		});
		dilSoru10_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru10.add(dilSoru10_3);

		//4.buton

		JButton dilSoru10_4 = new JButton("Tayca");
		dilSoru10_4.setBounds(377, 292, 200, 50);
		dilSoru10_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilSoru10.setVisible(false);
				sonucEkrani_dil.setVisible(true);
			}
		});
		dilSoru10_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dilSoru10.add(dilSoru10_4);

		setLocationRelativeTo(null);

		JButton dilOyunBaslat = new JButton("Yolla Gelsin!");
		dilOyunBaslat.setFont(new Font("Segoe Script", Font.PLAIN, 19));

		dilOyunBaslat.setBounds(230, 242, 202, 62);
		dilGirisPaneli.add(dilOyunBaslat);
		dilOyunBaslat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dilGirisPaneli.setVisible(false);
				dilSoru1.setVisible(true);
			}
		});
        ImageIcon dilIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\YabancıDilBackgroundd.jpg", 662, 363);
		
		JLabel dilBackgroundLabel = new JLabel(dilIcon);
		dilBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(dilBackgroundLabel);
		dilBackgroundLabel.setOpaque(true);



	}
	protected static ImageIcon createResizedImageIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(path);
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
	 public static ImageIcon createImageIcon(String path) {
	        return new ImageIcon(path);
	    }
	public static int getPuan() {
	    return puan;
	}
}
