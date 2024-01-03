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
import java.awt.Color;

public class UzayKategori extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int uzayPuan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UzayKategori uzayFrame = new UzayKategori();
					uzayFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		});
	}

	public UzayKategori() {
		uzayPuan = 0;
		setTitle("Uzay Kategorisi Bilgi Yarışması");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//giriş sayfası

		JPanel uzayGirisPaneli = new JPanel();
		uzayGirisPaneli.setBounds(0, 0, 662, 363);
		contentPane.add(uzayGirisPaneli);
		uzayGirisPaneli.setLayout(null);
		uzayGirisPaneli.setVisible(true);

		JLabel uzayGirisMesaj1 = new JLabel("Uçsuz bucaksız uzayın sınırlarını zorlamak istiyorsun demek...");
		uzayGirisMesaj1.setForeground(new Color(255, 255, 255));
		uzayGirisMesaj1.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzayGirisMesaj1.setHorizontalAlignment(SwingConstants.CENTER);
		uzayGirisMesaj1.setBounds(24, 42, 613, 99);
		uzayGirisPaneli.add(uzayGirisMesaj1);

		JLabel uzayGirisMesaj2 = new JLabel("O halde gel seninle ufak bir uzay gezisine çıkalım");
		uzayGirisMesaj2.setForeground(new Color(255, 255, 255));
		uzayGirisMesaj2.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzayGirisMesaj2.setHorizontalAlignment(SwingConstants.CENTER);
		uzayGirisMesaj2.setBounds(45, 145, 572, 76);
		uzayGirisPaneli.add(uzayGirisMesaj2);

        //Paneller

		JPanel uzaySoru1 = new JPanel();
		uzaySoru1.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru1);
		uzaySoru1.setLayout(null);
		uzaySoru1.setVisible(false);
		


		JPanel uzaySoru2 = new JPanel();
		uzaySoru2.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru2);
		uzaySoru2.setVisible(false);

		JPanel uzaySoru3 = new JPanel();
		uzaySoru3.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru3);
		uzaySoru3.setLayout(null);
		uzaySoru3.setVisible(false);


		JPanel uzaySoru4 = new JPanel();
		uzaySoru4.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru4);
		uzaySoru4.setLayout(null);
		uzaySoru4.setVisible(false);

		JPanel uzaySoru5 = new JPanel();
		uzaySoru5.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru5);
		uzaySoru5.setLayout(null);
		uzaySoru5.setVisible(false);

		JPanel uzaySoru6 = new JPanel();
		uzaySoru6.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru6);
		uzaySoru6.setVisible(false);

		JPanel uzaySoru7 = new JPanel();
		uzaySoru7.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru7);
		uzaySoru7.setLayout(null);
		uzaySoru7.setVisible(false);

		JPanel uzaySoru8 = new JPanel();
		uzaySoru8.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru8);
		uzaySoru8.setLayout(null);
		uzaySoru8.setVisible(false);

		JPanel uzaySoru9 = new JPanel();
		uzaySoru9.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru9);
		uzaySoru9.setLayout(null);
		uzaySoru9.setVisible(false);

		JPanel uzaySoru10 = new JPanel();
		uzaySoru10.setBounds(0, 0, 662, 363);
		contentPane.add(uzaySoru10);
		uzaySoru10.setLayout(null);
		uzaySoru10.setVisible(false);

		JPanel sonucEkrani_uzay = new JPanel();
		sonucEkrani_uzay.setBounds(0, 0, 662, 363);
		contentPane.add(sonucEkrani_uzay);
		sonucEkrani_uzay.setLayout(null);
		
		//opaklık ayarı
		uzayGirisPaneli.setOpaque(false);
		uzaySoru1.setOpaque(false);
		uzaySoru2.setOpaque(false);
		uzaySoru3.setOpaque(false);
		uzaySoru4.setOpaque(false);
		uzaySoru5.setOpaque(false);
		uzaySoru6.setOpaque(false);
		uzaySoru7.setOpaque(false);
		uzaySoru8.setOpaque(false);
		uzaySoru9.setOpaque(false);
		uzaySoru10.setOpaque(false);
		sonucEkrani_uzay.setOpaque(false);

		
	
		//Soru Textleri
		//1.Soru Sayfası

		JLabel uzaySoru1_sorubaslik = new JLabel("Soru 1 :");
		uzaySoru1_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru1_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru1_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru1.add(uzaySoru1_sorubaslik);

		JLabel uzaySoru1_soru = new JLabel("Güneş sistemimizin kütlesinin yüzde kaçını güneş oluşturur?");
		uzaySoru1_soru.setBounds(95, 104, 420, 116);
		uzaySoru1.add(uzaySoru1_soru);
		

		//2.Soru Sayfası

		JLabel uzaySoru2_sorubaslik = new JLabel("Soru 2 :");
		uzaySoru2_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru2_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru2_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru2.add(uzaySoru2_sorubaslik);

		JLabel uzaySoru2_soru = new JLabel("Güneşten gelen ışıklar yaklaşık kaç dakikada dünya üzerine ulaşır?");
		uzaySoru2_soru.setBounds(95, 104, 420, 116);
		uzaySoru2.add(uzaySoru2_soru);
		
		//3.Soru Sayfası

		JLabel uzaySoru3_sorubaslik = new JLabel("Soru 3 :");
		uzaySoru3_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru3_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru3_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru3.add(uzaySoru3_sorubaslik);

		JLabel uzaySoru3_soru = new JLabel("Uzaya ilk çıkan insan kimdir?");
		uzaySoru3_soru.setBounds(95, 104, 420, 116);
		uzaySoru3.add(uzaySoru3_soru);
		
		//4.Soru Sayfası

		JLabel uzaySoru4_sorubaslik = new JLabel("Soru 4 :");
		uzaySoru4_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru4_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru4_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru4.add(uzaySoru4_sorubaslik);

		JLabel uzaySoru4_soru = new JLabel("Güneş sisteminde en hızlı kendi ekseni etrafında dönen gezegen hangisidir?");
		uzaySoru4_soru.setBounds(106, 104, 450, 116);
		uzaySoru4.add(uzaySoru4_soru);
		
		//5.Soru Sayfası

		JLabel uzaySoru5_sorubaslik = new JLabel("Soru 5 :");
		uzaySoru5_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru5_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru5_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru5.add(uzaySoru5_sorubaslik);

		JLabel uzaySoru5_soru = new JLabel("Güneş sisteminde uydusu olmayan iki gezegen hangileridir?");
		uzaySoru5_soru.setBounds(95, 104, 420, 116);
		uzaySoru5.add(uzaySoru5_soru);
		
		//6.Soru Sayfası

		JLabel uzaySoru6_sorubaslik = new JLabel("Soru 6 :");
		uzaySoru6_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru6_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru6_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru6.add(uzaySoru6_sorubaslik);

		JLabel uzaySoru6_soru = new JLabel("Güneş sistemindeki en sıcak gezegen hangisidir?");
		uzaySoru6_soru.setBounds(95, 104, 420, 116);
		uzaySoru6.add(uzaySoru6_soru);
		
		//7.Soru Sayfası

		JLabel uzaySoru7_sorubaslik = new JLabel("Soru 7 :");
		uzaySoru7_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru7_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru7_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru7.add(uzaySoru7_sorubaslik);

		JLabel uzaySoru7_soru = new JLabel("Güneş sisteminde en çok uydusu olan Jüpiterin kaç uydusu vardır?");
		uzaySoru7_soru.setBounds(95, 104, 420, 116);
		uzaySoru7.add(uzaySoru7_soru);
		
		//8.Soru Sayfası

		JLabel uzaySoru8_sorubaslik = new JLabel("Soru 8 :");
		uzaySoru8_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru8_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru8_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru8.add(uzaySoru8_sorubaslik);

		JLabel uzaySoru8_soru = new JLabel("Halkalı gezegen olarak bilinen gezegen hangisidir?");
		uzaySoru8_soru.setBounds(95, 104, 420, 116);
		uzaySoru8.add(uzaySoru8_soru);
		
		//9.Soru Sayfası

		JLabel uzaySoru9_sorubaslik = new JLabel("Soru 9 :");
		uzaySoru9_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru9_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru9_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru9.add(uzaySoru9_sorubaslik);

		JLabel uzaySoru9_soru = new JLabel("Uzaya ilk gönderilen canlılardan biri olan Laika, hangi hayvandı?");
		uzaySoru9_soru.setBounds(95, 104, 420, 116);
		uzaySoru9.add(uzaySoru9_soru);
		//10.Soru Sayfası

		JLabel uzaySoru10_sorubaslik = new JLabel("Soru 10 :");
		uzaySoru10_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		uzaySoru10_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		uzaySoru10_sorubaslik.setBounds(85, 54, 130, 39);
		uzaySoru10.add(uzaySoru10_sorubaslik);

		JLabel uzaySoru10_soru = new JLabel("Kendi galaksimiz hariç bize en yakın galaksi hangisidir?");
		uzaySoru10_soru.setBounds(95, 104, 420, 116);
		uzaySoru10.add(uzaySoru10_soru);
		//soruların renk
		
		uzaySoru1_soru.setForeground(new Color(255, 255, 255));
		uzaySoru2_soru.setForeground(new Color(255, 255, 255));
		uzaySoru3_soru.setForeground(new Color(255, 255, 255));
		uzaySoru4_soru.setForeground(new Color(255, 255, 255));
		uzaySoru5_soru.setForeground(new Color(255, 255, 255));
		uzaySoru6_soru.setForeground(new Color(255, 255, 255));
		uzaySoru7_soru.setForeground(new Color(255, 255, 255));
		uzaySoru8_soru.setForeground(new Color(255, 255, 255));
		uzaySoru9_soru.setForeground(new Color(255, 255, 255));
		uzaySoru10_soru.setForeground(new Color(255, 255, 255));
		
		uzaySoru1_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru2_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru3_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru4_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru5_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru6_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru7_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru8_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru9_sorubaslik.setForeground(new Color(255, 255, 255));
		uzaySoru10_sorubaslik.setForeground(new Color(255, 255, 255));
		
		
		
		
		
		//sonuc ekranı sonuc textleri
		
		JLabel sonucuGostermeMesaji = new JLabel("Sonuç ekranını görmek için tıkla:");
		sonucuGostermeMesaji.setHorizontalAlignment(SwingConstants.CENTER);
		sonucuGostermeMesaji.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		sonucuGostermeMesaji.setBounds(44, 73, 557, 71);
		sonucuGostermeMesaji.setForeground(new Color(255, 255, 255));
		sonucEkrani_uzay.add(sonucuGostermeMesaji);
		
		JButton sonucEkraniGotur = new JButton("Sonuç Ekranı");
		sonucEkraniGotur.setForeground(new Color(211, 211, 211));
		sonucEkraniGotur.setBackground(new Color(0, 0, 40));
		sonucEkraniGotur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonucEkrani sonucFrame= new sonucEkrani();
				sonucFrame.setVisible(true);
				dispose();
			}
		});
		sonucEkraniGotur.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		sonucEkraniGotur.setBounds(151, 211, 345, 87);
		sonucEkrani_uzay.add(sonucEkraniGotur);
		sonucEkrani_uzay.setVisible(false);

		

		//1. Soru ekranı butonları
		//1.buton

		JButton uzaySoru1_1 = new JButton("%99");
		uzaySoru1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru1.setVisible(false);
				uzaySoru2.setVisible(true);
			}
		});
		uzaySoru1_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru1_1.setBounds(85, 231, 200, 50);
		uzaySoru1.add(uzaySoru1_1);

		//2.buton

		JButton uzaySoru1_2 = new JButton("%70");
		uzaySoru1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru1.setVisible(false);
				uzaySoru2.setVisible(true);
			}
		});
		uzaySoru1_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru1_2.setBounds(377, 231, 200, 50);
		uzaySoru1.add(uzaySoru1_2);

		//3.buton

		JButton uzaySoru1_3 = new JButton("%45");
		uzaySoru1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru1.setVisible(false);
				uzaySoru2.setVisible(true);
			}
		});
		uzaySoru1_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru1_3.setBounds(85, 292, 200, 50);
		uzaySoru1.add(uzaySoru1_3);

		//4.buton

		JButton uzaySoru1_4 = new JButton("%30");
		uzaySoru1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru1.setVisible(false);
				uzaySoru2.setVisible(true);
			}
		});
		uzaySoru1_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru1_4.setBounds(377, 292, 200, 50);
		uzaySoru1.add(uzaySoru1_4);

		//2. soru ekranı butonları
        //1. buton
		
		JButton uzaySoru2_1 = new JButton("40 Dakika");
		uzaySoru2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru2.setVisible(false);
				uzaySoru3.setVisible(true);
			}
		});
		uzaySoru2.setLayout(null);
		uzaySoru2_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru2_1.setBounds(85, 231, 200, 50);
		uzaySoru2.add(uzaySoru2_1);
		
        //2 buton
		
		JButton uzaySoru2_2 = new JButton("20 Dakika");
		uzaySoru2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru2.setVisible(false);
				uzaySoru3.setVisible(true);
			}
		});
		uzaySoru2_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru2_2.setBounds(377, 231, 200, 50);
		uzaySoru2.add(uzaySoru2_2);
		
		//3.buton

		JButton uzaySoru2_3 = new JButton("8  Dakika");
		uzaySoru2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru2.setVisible(false);
				uzaySoru3.setVisible(true);
			}
		});
		uzaySoru2_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru2_3.setBounds(85, 292, 200, 50);
		uzaySoru2.add(uzaySoru2_3);
		
		//4.buton

		JButton uzaySoru2_4 = new JButton("2 Dakika");
		uzaySoru2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru2.setVisible(false);
				uzaySoru3.setVisible(true);
			}
		});
		uzaySoru2_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru2_4.setBounds(377, 292, 200, 50);
		uzaySoru2.add(uzaySoru2_4);

		//3. Soru ekranı butonları
		//1.buton

		JButton uzaySoru3_1 = new JButton("Neil Armstrong");
		uzaySoru3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru3.setVisible(false);
				uzaySoru4.setVisible(true);
			}
		});
		uzaySoru3_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru3_1.setBounds(85, 231, 200, 50);
		uzaySoru3.add(uzaySoru3_1);

		//2.buton

		JButton uzaySoru3_2 = new JButton("Yuri Gagarin");
		uzaySoru3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru3.setVisible(false);
				uzaySoru4.setVisible(true);
			}
		});
		uzaySoru3_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru3_2.setBounds(377, 231, 200, 50);
		uzaySoru3.add(uzaySoru3_2);

		//3.buton

		JButton uzaySoru3_3 = new JButton("Buzz Aldrin");
		uzaySoru3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru3.setVisible(false);
				uzaySoru4.setVisible(true);
			}
		});
		uzaySoru3_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru3_3.setBounds(85, 292, 200, 50);
		uzaySoru3.add(uzaySoru3_3);

		//4.buton

		JButton uzaySoru3_4 = new JButton("Alan Shepard");
		uzaySoru3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru3.setVisible(false);
				uzaySoru4.setVisible(true);
			}
		});
		uzaySoru3_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru3_4.setBounds(377, 292, 200, 50);
		uzaySoru3.add(uzaySoru3_4);

		//4. Soru ekranı butonları
		//1.buton

		JButton uzaySoru4_1 = new JButton("Jüpiter");
		uzaySoru4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru4.setVisible(false);
				uzaySoru5.setVisible(true);
			}
		});
		uzaySoru4_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru4_1.setBounds(85, 231, 200, 50);
		uzaySoru4.add(uzaySoru4_1);

		//2.buton

		JButton uzaySoru4_2 = new JButton("Satürn");
		uzaySoru4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru4.setVisible(false);
				uzaySoru5.setVisible(true);
			}
		});
		uzaySoru4_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru4_2.setBounds(377, 231, 200, 50);
		uzaySoru4.add(uzaySoru4_2);

		//3.buton

		JButton uzaySoru4_3 = new JButton("Mars");
		uzaySoru4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru4.setVisible(false);
				uzaySoru5.setVisible(true);
			}
		});
		uzaySoru4_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru4_3.setBounds(85, 292, 200, 50);
		uzaySoru4.add(uzaySoru4_3);

		//4.buton

		JButton uzaySoru4_4 = new JButton("Venüs");
		uzaySoru4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru4.setVisible(false);
				uzaySoru5.setVisible(true);
			}
		});
		uzaySoru4_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru4_4.setBounds(377, 292, 200, 50);
		uzaySoru4.add(uzaySoru4_4);

		//5. soru ekranı butonları
		//1.buton

		JButton uzaySoru5_1 = new JButton("Merkür ve Venüs");
		uzaySoru5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru5.setVisible(false);
				uzaySoru6.setVisible(true);
			}
		});
		uzaySoru5.setLayout(null);
		uzaySoru5_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru5_1.setBounds(85, 231, 200, 50);
		uzaySoru5.add(uzaySoru5_1);

		//2.buton

		JButton uzaySoru5_2 = new JButton("Uranüs ve Neptün");
		uzaySoru5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru5.setVisible(false);
				uzaySoru6.setVisible(true);
			}
		});
		uzaySoru5_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru5_2.setBounds(377, 231, 200, 50);
		uzaySoru5.add(uzaySoru5_2);

		//3.buton

		JButton uzaySoru5_3 = new JButton("Mars ve Jüpiter");
		uzaySoru5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uzaySoru5.setVisible(false);
				uzaySoru6.setVisible(true);
			}
		});
		uzaySoru5_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru5_3.setBounds(85, 292, 200, 50);
		uzaySoru5.add(uzaySoru5_3);

		//4.buton

		JButton uzaySoru5_4 = new JButton("Plüton ve Dünya");
		uzaySoru5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru5.setVisible(false);
				uzaySoru6.setVisible(true);
			}
		});
		uzaySoru5_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru5_4.setBounds(377, 292, 200, 50);
		uzaySoru5.add(uzaySoru5_4);

		//6. Soru ekranı butonları
		//1.buton

		JButton uzaySoru6_1 = new JButton("Merkür");
		uzaySoru6_1.setBounds(85, 231, 200, 50);
		uzaySoru6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru6.setVisible(false);
				uzaySoru7.setVisible(true);
			}
		});
		uzaySoru6.setLayout(null);
		uzaySoru6_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru6.add(uzaySoru6_1);

		//2.buton

		JButton uzaySoru6_2 = new JButton("Mars");
		uzaySoru6_2.setBounds(377, 231, 200, 50);
		uzaySoru6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru6.setVisible(false);
				uzaySoru7.setVisible(true);
			}
		});
		uzaySoru6_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru6.add(uzaySoru6_2);

		//3.buton

		JButton uzaySoru6_3 = new JButton("Dünya");
		uzaySoru6_3.setBounds(85, 292, 200, 50);
		uzaySoru6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru6.setVisible(false);
				uzaySoru7.setVisible(true);
			}
		});
		uzaySoru6_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru6.add(uzaySoru6_3);

		//4.buton

		JButton uzaySoru6_4 = new JButton("Venüs");
		uzaySoru6_4.setBounds(377, 292, 200, 50);
		uzaySoru6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru6.setVisible(false);
				uzaySoru7.setVisible(true);
			}
		});
		uzaySoru6_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru6.add(uzaySoru6_4);

		//7. Soru ekranı butonları
		//1.buton

		JButton uzaySoru7_1 = new JButton("152");
		uzaySoru7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru7.setVisible(false);
				uzaySoru8.setVisible(true);
			}
		});
		uzaySoru7_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru7_1.setBounds(85, 231, 200, 50);
		uzaySoru7.add(uzaySoru7_1);

		//2.buton

		JButton uzaySoru7_2 = new JButton("95");
		uzaySoru7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru7.setVisible(false);
				uzaySoru8.setVisible(true);
			}
		});
		uzaySoru7_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru7_2.setBounds(377, 231, 200, 50);
		uzaySoru7.add(uzaySoru7_2);

		//3.buton

		JButton uzaySoru7_3 = new JButton("87");
		uzaySoru7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru7.setVisible(false);
				uzaySoru8.setVisible(true);
			}
		});
		uzaySoru7_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru7_3.setBounds(85, 292, 200, 50);
		uzaySoru7.add(uzaySoru7_3);

		//4.buton

		JButton uzaySoru7_4 = new JButton("63");
		uzaySoru7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru7.setVisible(false);
				uzaySoru8.setVisible(true);
			}
		});
		uzaySoru7_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru7_4.setBounds(377, 292, 200, 50);
		uzaySoru7.add(uzaySoru7_4);

		//8. Soru ekranı butonları
		//1.buton

		JButton uzaySoru8_1 = new JButton("Jüpiter");
		uzaySoru8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru8.setVisible(false);
				uzaySoru9.setVisible(true);
			}
		});
		uzaySoru8_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru8_1.setBounds(85, 231, 200, 50);
		uzaySoru8.add(uzaySoru8_1);

		//2.buton

		JButton uzaySoru8_2 = new JButton("Uranüs");
		uzaySoru8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru8.setVisible(false);
				uzaySoru9.setVisible(true);
			}
		});
		uzaySoru8_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru8_2.setBounds(377, 231, 200, 50);
		uzaySoru8.add(uzaySoru8_2);

		//3.buton

		JButton uzaySoru8_3 = new JButton("Neptün");
		uzaySoru8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru8.setVisible(false);
				uzaySoru9.setVisible(true);
			}
		});
		uzaySoru8_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru8_3.setBounds(85, 292, 200, 50);
		uzaySoru8.add(uzaySoru8_3);

		//4.buton

		JButton uzaySoru8_4 = new JButton("Satürn");
		uzaySoru8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru8.setVisible(false);
				uzaySoru9.setVisible(true);
			}
		});
		uzaySoru8_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru8_4.setBounds(377, 292, 200, 50);
		uzaySoru8.add(uzaySoru8_4);

		//9. soru ekranı butonları
		//1.buton

		JButton uzaySoru9_1 = new JButton("Köpek");
		uzaySoru9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru9.setVisible(false);
				uzaySoru10.setVisible(true);
			}
		});
		uzaySoru9.setLayout(null);
		uzaySoru9_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru9_1.setBounds(85, 231, 200, 50);
		uzaySoru9.add(uzaySoru9_1);

		//2.buton

		JButton uzaySoru9_2 = new JButton("Maymun");
		uzaySoru9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru9.setVisible(false);
				uzaySoru10.setVisible(true);
			}
		});
		uzaySoru9_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru9_2.setBounds(377, 231, 200, 50);
		uzaySoru9.add(uzaySoru9_2);

		//3.buton

		JButton uzaySoru9_3 = new JButton("Hamster");
		uzaySoru9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru9.setVisible(false);
				uzaySoru10.setVisible(true);
			}
		});
		uzaySoru9_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru9_3.setBounds(85, 292, 200, 50);
		uzaySoru9.add(uzaySoru9_3);

		//4.buton

		JButton uzaySoru9_4 = new JButton("Kedi");
		uzaySoru9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru9.setVisible(false);
				uzaySoru10.setVisible(true);
			}
		});
		uzaySoru9_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru9_4.setBounds(377, 292, 200, 50);
		uzaySoru9.add(uzaySoru9_4);
		
		

		//10. Soru ekranı butonları
		//1.buton

		JButton uzaySoru10_1 = new JButton("Karina");
		uzaySoru10_1.setBounds(85, 231, 200, 50);
		uzaySoru10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru10.setVisible(false);
				sonucEkrani_uzay.setVisible(true);
			}
		});
		uzaySoru10.setLayout(null);
		uzaySoru10_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru10.add(uzaySoru10_1);

		//2.buton

		JButton uzaySoru10_2 = new JButton("Sombrero");
		uzaySoru10_2.setBounds(377, 231, 200, 50);
		uzaySoru10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru10.setVisible(false);
				sonucEkrani_uzay.setVisible(true);
			}
		});
		uzaySoru10_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru10.add(uzaySoru10_2);

		//3.buton

		JButton uzaySoru10_3 = new JButton("Andromeda");
		uzaySoru10_3.setBounds(85, 292, 200, 50);
		uzaySoru10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayPuan +=1;
				uzaySoru10.setVisible(false);
				sonucEkrani_uzay.setVisible(true);
			}
		});
		uzaySoru10_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru10.add(uzaySoru10_3);

		//4.buton

		JButton uzaySoru10_4 = new JButton("Bode");
		uzaySoru10_4.setBounds(377, 292, 200, 50);
		uzaySoru10_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzaySoru10.setVisible(false);
				sonucEkrani_uzay.setVisible(true);
				
			}
		});
		uzaySoru10_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		uzaySoru10.add(uzaySoru10_4);

		setLocationRelativeTo(null);
		
		//Oyun başlatma butonu

		JButton uzayOyunBaslat = new JButton("Yolla Gelsin!");
		uzayOyunBaslat.setFont(new Font("Segoe Script", Font.PLAIN, 19));

		uzayOyunBaslat.setBounds(230, 242, 202, 62);
		uzayGirisPaneli.add(uzayOyunBaslat);
		uzayOyunBaslat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uzayGirisPaneli.setVisible(false);
				uzaySoru1.setVisible(true);
			}
		});
		//1
				uzayOyunBaslat.setForeground(new Color(211, 211, 211));
				uzayOyunBaslat.setBackground(new Color(0, 0, 40));
				
			
				
		//1
		uzaySoru1_1.setForeground(new Color(211, 211, 211));
		uzaySoru1_1.setBackground(new Color(0, 0, 40));
		
		uzaySoru1_2.setForeground(new Color(211, 211, 211));
		uzaySoru1_2.setBackground(new Color(0, 0, 40));
		
		uzaySoru1_3.setForeground(new Color(211, 211, 211));
		uzaySoru1_3.setBackground(new Color(0, 0, 40));
		
		uzaySoru1_4.setForeground(new Color(211, 211, 211));
		uzaySoru1_4.setBackground(new Color(0, 0, 40));
		
		//2
				uzaySoru2_1.setForeground(new Color(211, 211, 211));
				uzaySoru2_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru2_2.setForeground(new Color(211, 211, 211));
				uzaySoru2_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru2_3.setForeground(new Color(211, 211, 211));
				uzaySoru2_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru2_4.setForeground(new Color(211, 211, 211));
				uzaySoru2_4.setBackground(new Color(0, 0, 40));
				//3
				uzaySoru3_1.setForeground(new Color(211, 211, 211));
				uzaySoru3_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru3_2.setForeground(new Color(211, 211, 211));
				uzaySoru3_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru3_3.setForeground(new Color(211, 211, 211));
				uzaySoru3_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru3_4.setForeground(new Color(211, 211, 211));
				uzaySoru3_4.setBackground(new Color(0, 0, 40));
				
				//4
				
				uzaySoru4_1.setForeground(new Color(211, 211, 211));
				uzaySoru4_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru4_2.setForeground(new Color(211, 211, 211));
				uzaySoru4_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru4_3.setForeground(new Color(211, 211, 211));
				uzaySoru4_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru4_4.setForeground(new Color(211, 211, 211));
				uzaySoru4_4.setBackground(new Color(0, 0, 40));
				
				//5
				
				uzaySoru5_1.setForeground(new Color(211, 211, 211));
				uzaySoru5_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru5_2.setForeground(new Color(211, 211, 211));
				uzaySoru5_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru5_3.setForeground(new Color(211, 211, 211));
				uzaySoru5_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru5_4.setForeground(new Color(211, 211, 211));
				uzaySoru5_4.setBackground(new Color(0, 0, 40));
				
				//6
				
				uzaySoru6_1.setForeground(new Color(211, 211, 211));
				uzaySoru6_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru6_2.setForeground(new Color(211, 211, 211));
				uzaySoru6_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru6_3.setForeground(new Color(211, 211, 211));
				uzaySoru6_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru6_4.setForeground(new Color(211, 211, 211));
				uzaySoru6_4.setBackground(new Color(0, 0, 40));
				
				//7
				
				uzaySoru7_1.setForeground(new Color(211, 211, 211));
				uzaySoru7_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru7_2.setForeground(new Color(211, 211, 211));
				uzaySoru7_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru7_3.setForeground(new Color(211, 211, 211));
				uzaySoru7_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru7_4.setForeground(new Color(211, 211, 211));
				uzaySoru7_4.setBackground(new Color(0, 0, 40));
				
				//8
				uzaySoru8_1.setForeground(new Color(211, 211, 211));
				uzaySoru8_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru8_2.setForeground(new Color(211, 211, 211));
				uzaySoru8_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru8_3.setForeground(new Color(211, 211, 211));
				uzaySoru8_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru8_4.setForeground(new Color(211, 211, 211));
				uzaySoru8_4.setBackground(new Color(0, 0, 40));
				
				//1
				
				uzaySoru9_1.setForeground(new Color(211, 211, 211));
				uzaySoru9_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru9_2.setForeground(new Color(211, 211, 211));
				uzaySoru9_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru9_3.setForeground(new Color(211, 211, 211));
				uzaySoru9_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru9_4.setForeground(new Color(211, 211, 211));
				uzaySoru9_4.setBackground(new Color(0, 0, 40));
				//10
				uzaySoru10_1.setForeground(new Color(211, 211, 211));
				uzaySoru10_1.setBackground(new Color(0, 0, 40));
				
				uzaySoru10_2.setForeground(new Color(211, 211, 211));
				uzaySoru10_2.setBackground(new Color(0, 0, 40));
				
				uzaySoru10_3.setForeground(new Color(211, 211, 211));
				uzaySoru10_3.setBackground(new Color(0, 0, 40));
				
				uzaySoru10_4.setForeground(new Color(211, 211, 211));
				uzaySoru10_4.setBackground(new Color(0, 0, 40));
				
				

		//arkaplan fotosu
		ImageIcon uzayIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\UzayBackground.png",662, 363);
		
		JLabel uzayBackgroundLabel = new JLabel(uzayIcon);
		uzayBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(uzayBackgroundLabel);


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
	    return uzayPuan;
	}
}
