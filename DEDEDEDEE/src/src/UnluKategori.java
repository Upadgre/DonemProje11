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

public class UnluKategori extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int puan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnluKategori unluFrame = new UnluKategori();
					unluFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UnluKategori() {
		puan = 0;
		setTitle("Ünlü Tahmini Bilgi Yarışması");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//giriş sayfası

		JPanel unluGirisPaneli = new JPanel();
		unluGirisPaneli.setBounds(0, 0, 662, 363);
		contentPane.add(unluGirisPaneli);
		unluGirisPaneli.setLayout(null);
		unluGirisPaneli.setVisible(true);

		JLabel unluGirisMesaj1 = new JLabel("Magazini ve ünlüleri takip ediyorsan tam aradığın yerdesin");
		unluGirisMesaj1.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluGirisMesaj1.setHorizontalAlignment(SwingConstants.CENTER);
		unluGirisMesaj1.setBounds(24, 42, 613, 99);
		unluGirisPaneli.add(unluGirisMesaj1);

		JLabel unluGirisMesaj2 = new JLabel("Gel seninle kırmızı halıda turlayalım!");
		unluGirisMesaj2.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluGirisMesaj2.setHorizontalAlignment(SwingConstants.CENTER);
		unluGirisMesaj2.setBounds(45, 145, 572, 76);
		unluGirisPaneli.add(unluGirisMesaj2);

        //Paneller

		JPanel unluSoru1 = new JPanel();
		unluSoru1.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru1);
		unluSoru1.setLayout(null);
		unluSoru1.setVisible(false);


		JPanel unluSoru2 = new JPanel();
		unluSoru2.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru2);
		unluSoru2.setVisible(false);

		JPanel unluSoru3 = new JPanel();
		unluSoru3.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru3);
		unluSoru3.setLayout(null);
		unluSoru3.setVisible(false);


		JPanel unluSoru4 = new JPanel();
		unluSoru4.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru4);
		unluSoru4.setLayout(null);
		unluSoru4.setVisible(false);

		JPanel unluSoru5 = new JPanel();
		unluSoru5.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru5);
		unluSoru5.setLayout(null);
		unluSoru5.setVisible(false);

		JPanel unluSoru6 = new JPanel();
		unluSoru6.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru6);
		unluSoru6.setVisible(false);

		JPanel unluSoru7 = new JPanel();
		unluSoru7.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru7);
		unluSoru7.setLayout(null);
		unluSoru7.setVisible(false);

		JPanel unluSoru8 = new JPanel();
		unluSoru8.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru8);
		unluSoru8.setLayout(null);
		unluSoru8.setVisible(false);

		JPanel unluSoru9 = new JPanel();
		unluSoru9.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru9);
		unluSoru9.setLayout(null);
		unluSoru9.setVisible(false);

		JPanel unluSoru10 = new JPanel();
		unluSoru10.setBounds(0, 0, 662, 363);
		contentPane.add(unluSoru10);
		unluSoru10.setLayout(null);
		unluSoru10.setVisible(false);

		JPanel sonucEkrani_unlu = new JPanel();
		sonucEkrani_unlu.setBounds(0, 0, 662, 363);
		contentPane.add(sonucEkrani_unlu);
		sonucEkrani_unlu.setLayout(null);
		
		//opaklık ayarı
		
		unluGirisPaneli.setOpaque(false);
		unluSoru1.setOpaque(false);
		unluSoru2.setOpaque(false);
		unluSoru3.setOpaque(false);
		unluSoru4.setOpaque(false);
		unluSoru5.setOpaque(false);
		unluSoru6.setOpaque(false);
		unluSoru7.setOpaque(false);
		unluSoru8.setOpaque(false);
		unluSoru9.setOpaque(false);
		unluSoru10.setOpaque(false);
		sonucEkrani_unlu.setOpaque(false);
	


		
	
		//Soru Textleri
		//1.Soru Sayfası

		JLabel unluSoru1_sorubaslik = new JLabel("Soru 1 :");
		unluSoru1_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru1_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru1_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru1.add(unluSoru1_sorubaslik);

		//2.Soru Sayfası

		JLabel unluSoru2_sorubaslik = new JLabel("Soru 2 :");
		unluSoru2_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru2_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru2_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru2.add(unluSoru2_sorubaslik);
		
		//3.Soru Sayfası

		JLabel unluSoru3_sorubaslik = new JLabel("Soru 3 :");
		unluSoru3_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru3_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru3_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru3.add(unluSoru3_sorubaslik);
		
		//4.Soru Sayfası

		JLabel unluSoru4_sorubaslik = new JLabel("Soru 4 :");
		unluSoru4_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru4_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru4_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru4.add(unluSoru4_sorubaslik);
		
		//5.Soru Sayfası

		JLabel unluSoru5_sorubaslik = new JLabel("Soru 5 :");
		unluSoru5_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru5_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru5_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru5.add(unluSoru5_sorubaslik);
		
		//6.Soru Sayfası

		JLabel unluSoru6_sorubaslik = new JLabel("Soru 6 :");
		unluSoru6_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru6_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru6_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru6.add(unluSoru6_sorubaslik);
		
		//7.Soru Sayfası

		JLabel unluSoru7_sorubaslik = new JLabel("Soru 7 :");
		unluSoru7_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru7_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru7_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru7.add(unluSoru7_sorubaslik);

		
		//8.Soru Sayfası

		JLabel unluSoru8_sorubaslik = new JLabel("Soru 8 :");
		unluSoru8_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru8_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru8_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru8.add(unluSoru8_sorubaslik);
		
		//9.Soru Sayfası

		JLabel unluSoru9_sorubaslik = new JLabel("Soru 9 :");
		unluSoru9_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru9_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru9_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru9.add(unluSoru9_sorubaslik);
		//10.Soru Sayfası

		JLabel unluSoru10_sorubaslik = new JLabel("Soru 10 :");
		unluSoru10_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		unluSoru10_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		unluSoru10_sorubaslik.setBounds(85, 54, 130, 39);
		unluSoru10.add(unluSoru10_sorubaslik);
		
		//sonuc ekranı sonuc textleri
		
		JLabel sonucuGostermeMesaji_unlu = new JLabel("Sonuç ekranını görmek için tıkla:");
		sonucuGostermeMesaji_unlu.setHorizontalAlignment(SwingConstants.CENTER);
		sonucuGostermeMesaji_unlu.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		sonucuGostermeMesaji_unlu.setBounds(44, 73, 557, 71);
		sonucEkrani_unlu.add(sonucuGostermeMesaji_unlu);
		
		JButton sonucEkraniGotur_unlu = new JButton("Sonuç Ekranı");
		sonucEkraniGotur_unlu.setBackground(new Color(159, 0, 80));
		sonucEkraniGotur_unlu.setForeground(new Color(255, 255, 255));
		sonucEkraniGotur_unlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonucEkrani frame2= new sonucEkrani();
				frame2.setVisible(true);
				dispose();
			}
		});
		sonucEkraniGotur_unlu.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		sonucEkraniGotur_unlu.setBounds(151, 211, 345, 87);
		sonucEkrani_unlu.add(sonucEkraniGotur_unlu);
		sonucEkrani_unlu.setVisible(false);

		

		//1. Soru ekranı butonları
		//1.buton

		JButton unluSoru1_1 = new JButton("Aleyna Tilki");
		unluSoru1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru1.setVisible(false);
				unluSoru2.setVisible(true);
			}
		});
		unluSoru1_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru1_1.setBounds(85, 231, 200, 50);
		unluSoru1.add(unluSoru1_1);

		//2.buton

		JButton unluSoru1_2 = new JButton("Selenay Sarıkaya");
		unluSoru1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru1.setVisible(false);
				unluSoru2.setVisible(true);
			}
		});
		unluSoru1_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru1_2.setBounds(377, 231, 200, 50);
		unluSoru1.add(unluSoru1_2);

		//3.buton

		JButton unluSoru1_3 = new JButton("Nil Anka");
		unluSoru1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru1.setVisible(false);
				unluSoru2.setVisible(true);
			}
		});
		unluSoru1_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru1_3.setBounds(85, 292, 200, 50);
		unluSoru1.add(unluSoru1_3);

		//4.buton

		JButton unluSoru1_4 = new JButton("Hadise");
		unluSoru1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru1.setVisible(false);
				unluSoru2.setVisible(true);
			}
		});
		unluSoru1_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru1_4.setBounds(377, 292, 200, 50);
		unluSoru1.add(unluSoru1_4);
		
		
	

		//2. soru ekranı butonları
        //1. buton
		
		JButton unluSoru2_1 = new JButton("Lalisa Manoban");
		unluSoru2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru2.setVisible(false);
				unluSoru3.setVisible(true);
			}
		});
		unluSoru2.setLayout(null);
		unluSoru2_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru2_1.setBounds(85, 231, 200, 50);
		unluSoru2.add(unluSoru2_1);
		
        //2 buton
		
		JButton unluSoru2_2 = new JButton("Kim Jennie");
		unluSoru2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru2.setVisible(false);
				unluSoru3.setVisible(true);
			}
		});
		unluSoru2_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru2_2.setBounds(377, 231, 200, 50);
		unluSoru2.add(unluSoru2_2);
		
		//3.buton

		JButton unluSoru2_3 = new JButton("Choi Yena");
		unluSoru2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru2.setVisible(false);
				unluSoru3.setVisible(true);
			}
		});
		unluSoru2_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru2_3.setBounds(85, 292, 200, 50);
		unluSoru2.add(unluSoru2_3);
		
		//4.buton

		JButton unluSoru2_4 = new JButton("Lee Chaeyeon");
		unluSoru2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru2.setVisible(false);
				unluSoru3.setVisible(true);
			}
		});
		unluSoru2_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru2_4.setBounds(377, 292, 200, 50);
		unluSoru2.add(unluSoru2_4);
		
		

		//3. Soru ekranı butonları
		//1.buton

		JButton unluSoru3_1 = new JButton("Salman Khan");
		unluSoru3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru3.setVisible(false);
				unluSoru4.setVisible(true);
			}
		});
		unluSoru3_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru3_1.setBounds(85, 231, 200, 50);
		unluSoru3.add(unluSoru3_1);

		//2.buton

		JButton unluSoru3_2 = new JButton("Aamir Khan");
		unluSoru3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru3.setVisible(false);
				unluSoru4.setVisible(true);
			}
		});
		unluSoru3_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru3_2.setBounds(377, 231, 200, 50);
		unluSoru3.add(unluSoru3_2);

		//3.buton

		JButton unluSoru3_3 = new JButton("Shah Rukh Khan");
		unluSoru3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru3.setVisible(false);
				unluSoru4.setVisible(true);
			}
		});
		unluSoru3_3.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		unluSoru3_3.setBounds(85, 292, 200, 50);
		unluSoru3.add(unluSoru3_3);

		//4.buton

		JButton unluSoru3_4 = new JButton("Ranbir Kapoor");
		unluSoru3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru3.setVisible(false);
				unluSoru4.setVisible(true);
			}
		});
		unluSoru3_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru3_4.setBounds(377, 292, 200, 50);
		unluSoru3.add(unluSoru3_4);

		//4. Soru ekranı butonları
		//1.buton

		JButton unluSoru4_1 = new JButton("Alparslan Özmol");
		unluSoru4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru4.setVisible(false);
				unluSoru5.setVisible(true);
			}
		});
		unluSoru4_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru4_1.setBounds(85, 231, 200, 50);
		unluSoru4.add(unluSoru4_1);

		//2.buton

		JButton unluSoru4_2 = new JButton("Çaycı Hüseyin");
		unluSoru4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru4.setVisible(false);
				unluSoru5.setVisible(true);
			}
		});
		unluSoru4_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru4_2.setBounds(377, 231, 200, 50);
		unluSoru4.add(unluSoru4_2);

		//3.buton

		JButton unluSoru4_3 = new JButton("Süleyman Yağcı");
		unluSoru4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru4.setVisible(false);
				unluSoru5.setVisible(true);
			}
		});
		unluSoru4_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru4_3.setBounds(85, 292, 200, 50);
		unluSoru4.add(unluSoru4_3);

		//4.buton

		JButton unluSoru4_4 = new JButton("Tamer Karadağlı");
		unluSoru4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru4.setVisible(false);
				unluSoru5.setVisible(true);
			}
		});
		unluSoru4_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru4_4.setBounds(377, 292, 200, 50);
		unluSoru4.add(unluSoru4_4);

		//5. soru ekranı butonları
		//1.buton

		JButton unluSoru5_1 = new JButton("Gigi Hadid");
		unluSoru5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru5.setVisible(false);
				unluSoru6.setVisible(true);
			}
		});
		unluSoru5.setLayout(null);
		unluSoru5_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru5_1.setBounds(85, 231, 200, 50);
		unluSoru5.add(unluSoru5_1);

		//2.buton

		JButton unluSoru5_2 = new JButton("Kendall Jenner");
		unluSoru5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru5.setVisible(false);
				unluSoru6.setVisible(true);
			}
		});
		unluSoru5_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru5_2.setBounds(377, 231, 200, 50);
		unluSoru5.add(unluSoru5_2);

		//3.buton

		JButton unluSoru5_3 = new JButton("Bella Hadid");
		unluSoru5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru5.setVisible(false);
				unluSoru6.setVisible(true);
			}
		});
		unluSoru5_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru5_3.setBounds(85, 292, 200, 50);
		unluSoru5.add(unluSoru5_3);

		//4.buton

		JButton unluSoru5_4 = new JButton("Kim Kardashian");
		unluSoru5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru5.setVisible(false);
				unluSoru6.setVisible(true);
			}
		});
		unluSoru5_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru5_4.setBounds(377, 292, 200, 50);
		unluSoru5.add(unluSoru5_4);

		//6. Soru ekranı butonları
		//1.buton

		JButton unluSoru6_1 = new JButton("Rita Ora");
		unluSoru6_1.setBounds(85, 231, 200, 50);
		unluSoru6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru6.setVisible(false);
				unluSoru7.setVisible(true);
			}
		});
		unluSoru6.setLayout(null);
		unluSoru6_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru6.add(unluSoru6_1);

		//2.buton

		JButton unluSoru6_2 = new JButton("Ariana Grande");
		unluSoru6_2.setBounds(377, 231, 200, 50);
		unluSoru6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru6.setVisible(false);
				unluSoru7.setVisible(true);
			}
		});
		unluSoru6_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru6.add(unluSoru6_2);

		//3.buton

		JButton unluSoru6_3 = new JButton("Bebe Rexha");
		unluSoru6_3.setBounds(85, 292, 200, 50);
		unluSoru6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru6.setVisible(false);
				unluSoru7.setVisible(true);
			}
		});
		unluSoru6_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru6.add(unluSoru6_3);

		//4.buton

		JButton unluSoru6_4 = new JButton("Dua Lipa");
		unluSoru6_4.setBounds(377, 292, 200, 50);
		unluSoru6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru6.setVisible(false);
				unluSoru7.setVisible(true);
			}
		});
		unluSoru6_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru6.add(unluSoru6_4);

		//7. Soru ekranı butonları
		//1.buton

		JButton unluSoru7_1 = new JButton("Jamie Oliver");
		unluSoru7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru7.setVisible(false);
				unluSoru8.setVisible(true);
			}
		});
		unluSoru7_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru7_1.setBounds(85, 231, 200, 50);
		unluSoru7.add(unluSoru7_1);

		//2.buton

		JButton unluSoru7_2 = new JButton("Gordon Ramsay");
		unluSoru7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru7.setVisible(false);
				unluSoru8.setVisible(true);
			}
		});
		unluSoru7_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru7_2.setBounds(377, 231, 200, 50);
		unluSoru7.add(unluSoru7_2);

		//3.buton

		JButton unluSoru7_3 = new JButton("Bobby Flay");
		unluSoru7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru7.setVisible(false);
				unluSoru8.setVisible(true);
			}
		});
		unluSoru7_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru7_3.setBounds(85, 292, 200, 50);
		unluSoru7.add(unluSoru7_3);

		//4.buton

		JButton unluSoru7_4 = new JButton("Wolfgang Puck");
		unluSoru7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru7.setVisible(false);
				unluSoru8.setVisible(true);
			}
		});
		unluSoru7_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru7_4.setBounds(377, 292, 200, 50);
		unluSoru7.add(unluSoru7_4);

		//8. Soru ekranı butonları
		//1.buton

		JButton unluSoru8_1 = new JButton("Kang Hyewon");
		unluSoru8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru8.setVisible(false);
				unluSoru9.setVisible(true);
			}
		});
		unluSoru8_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru8_1.setBounds(85, 231, 200, 50);
		unluSoru8.add(unluSoru8_1);

		//2.buton

		JButton unluSoru8_2 = new JButton("Jo Yuri");
		unluSoru8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru8.setVisible(false);
				unluSoru9.setVisible(true);
			}
		});
		unluSoru8_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru8_2.setBounds(377, 231, 200, 50);
		unluSoru8.add(unluSoru8_2);

		//3.buton

		JButton unluSoru8_3 = new JButton("Park Jihyo");
		unluSoru8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru8.setVisible(false);
				unluSoru9.setVisible(true);
			}
		});
		unluSoru8_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru8_3.setBounds(85, 292, 200, 50);
		unluSoru8.add(unluSoru8_3);

		//4.buton

		JButton unluSoru8_4 = new JButton("Hoyeon Jung");
		unluSoru8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru8.setVisible(false);
				unluSoru9.setVisible(true);
			}
		});
		unluSoru8_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru8_4.setBounds(377, 292, 200, 50);
		unluSoru8.add(unluSoru8_4);

		//9. soru ekranı butonları
		//1.buton

		JButton unluSoru9_1 = new JButton("Sean Paul");
		unluSoru9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru9.setVisible(false);
				unluSoru10.setVisible(true);
			}
		});
		unluSoru9.setLayout(null);
		unluSoru9_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru9_1.setBounds(85, 231, 200, 50);
		unluSoru9.add(unluSoru9_1);

		//2.buton

		JButton unluSoru9_2 = new JButton("NElephant Man");
		unluSoru9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru9.setVisible(false);
				unluSoru10.setVisible(true);
			}
		});
		unluSoru9_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru9_2.setBounds(377, 231, 200, 50);
		unluSoru9.add(unluSoru9_2);

		//3.buton

		JButton unluSoru9_3 = new JButton("Shaggy");
		unluSoru9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru9.setVisible(false);
				unluSoru10.setVisible(true);
			}
		});
		unluSoru9_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru9_3.setBounds(85, 292, 200, 50);
		unluSoru9.add(unluSoru9_3);

		//4.buton

		JButton unluSoru9_4 = new JButton("Beenie Man");
		unluSoru9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru9.setVisible(false);
				unluSoru10.setVisible(true);
			}
		});
		unluSoru9_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru9_4.setBounds(377, 292, 200, 50);
		unluSoru9.add(unluSoru9_4);

		//10. Soru ekranı butonları
		//1.buton

		JButton unluSoru10_1 = new JButton("Bella Throne");
		unluSoru10_1.setBounds(85, 231, 200, 50);
		unluSoru10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru10.setVisible(false);
				sonucEkrani_unlu.setVisible(true);
			}
		});
		unluSoru10.setLayout(null);
		unluSoru10_1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru10.add(unluSoru10_1);

		//2.buton

		JButton unluSoru10_2 = new JButton("Caroline Sun");
		unluSoru10_2.setBounds(377, 231, 200, 50);
		unluSoru10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru10.setVisible(false);
				sonucEkrani_unlu.setVisible(true);
			}
		});
		unluSoru10_2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru10.add(unluSoru10_2);

		//3.buton

		JButton unluSoru10_3 = new JButton("Zendaya");
		unluSoru10_3.setBounds(85, 292, 200, 50);
		unluSoru10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				unluSoru10.setVisible(false);
				sonucEkrani_unlu.setVisible(true);
			}
		});
		unluSoru10_3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru10.add(unluSoru10_3);

		//4.buton

		JButton unluSoru10_4 = new JButton("Ariana Grande");
		unluSoru10_4.setBounds(377, 292, 200, 50);
		unluSoru10_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluSoru10.setVisible(false);
				sonucEkrani_unlu.setVisible(true);
			}
		});
		unluSoru10_4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		unluSoru10.add(unluSoru10_4);

		setLocationRelativeTo(null);

		JButton unluOyunBaslat = new JButton("Yolla Gelsin!");
		unluOyunBaslat.setForeground(new Color(255, 255, 255));
		unluOyunBaslat.setBackground(new Color(255, 0, 255));
		unluOyunBaslat.setFont(new Font("Segoe Script", Font.BOLD, 19));

		unluOyunBaslat.setBounds(230, 242, 202, 62);
		unluGirisPaneli.add(unluOyunBaslat);
		
		
		
		sonucEkraniGotur_unlu.setBackground(new Color(159, 0, 80));
		sonucEkraniGotur_unlu.setForeground(new Color(255, 255, 255));
		
		
		//1
		unluSoru1_1.setForeground(new Color(255, 255, 255));
		unluSoru1_1.setBackground(new Color(159, 0, 80));
		
		unluSoru1_2.setForeground(new Color(255, 255, 255));
		unluSoru1_2.setBackground(new Color(159, 0, 80));
		
		unluSoru1_3.setForeground(new Color(255, 255, 255));
		unluSoru1_3.setBackground(new Color(159, 0, 80));
		
		unluSoru1_4.setForeground(new Color(255, 255, 255));
		unluSoru1_4.setBackground(new Color(159, 0, 80));
		
		//2
		unluSoru2_1.setForeground(new Color(255, 255, 255));
		unluSoru2_1.setBackground(new Color(159, 0, 80));
		
		unluSoru2_2.setForeground(new Color(255, 255, 255));
		unluSoru2_2.setBackground(new Color(159, 0, 80));
		
		unluSoru2_3.setForeground(new Color(255, 255, 255));
		unluSoru2_3.setBackground(new Color(159, 0, 80));
		
		unluSoru2_4.setForeground(new Color(255, 255, 255));
		unluSoru2_4.setBackground(new Color(159, 0, 80));
		//3
		unluSoru3_1.setForeground(new Color(255, 255, 255));
		unluSoru3_1.setBackground(new Color(159, 0, 80));
		
		unluSoru3_2.setForeground(new Color(255, 255, 255));
		unluSoru3_2.setBackground(new Color(159, 0, 80));
		
		unluSoru3_3.setForeground(new Color(255, 255, 255));
		unluSoru3_3.setBackground(new Color(159, 0, 80));
		
		unluSoru3_4.setForeground(new Color(255, 255, 255));
		unluSoru3_4.setBackground(new Color(159, 0, 80));
		//4
		unluSoru4_1.setForeground(new Color(255, 255, 255));
		unluSoru4_1.setBackground(new Color(159, 0, 80));
		
		unluSoru4_2.setForeground(new Color(255, 255, 255));
		unluSoru4_2.setBackground(new Color(159, 0, 80));
		
		unluSoru4_3.setForeground(new Color(255, 255, 255));
		unluSoru4_3.setBackground(new Color(159, 0, 80));
		
		unluSoru4_4.setForeground(new Color(255, 255, 255));
		unluSoru4_4.setBackground(new Color(159, 0, 80));
		//5
		unluSoru5_1.setForeground(new Color(255, 255, 255));
		unluSoru5_1.setBackground(new Color(159, 0, 80));
		
		unluSoru5_2.setForeground(new Color(255, 255, 255));
		unluSoru5_2.setBackground(new Color(159, 0, 80));
		
		unluSoru5_3.setForeground(new Color(255, 255, 255));
		unluSoru5_3.setBackground(new Color(159, 0, 80));
		
		unluSoru5_4.setForeground(new Color(255, 255, 255));
		unluSoru5_4.setBackground(new Color(159, 0, 80));
		//6
		unluSoru6_1.setForeground(new Color(255, 255, 255));
		unluSoru6_1.setBackground(new Color(159, 0, 80));
		
		unluSoru6_2.setForeground(new Color(255, 255, 255));
		unluSoru6_2.setBackground(new Color(159, 0, 80));
		
		unluSoru6_3.setForeground(new Color(255, 255, 255));
		unluSoru6_3.setBackground(new Color(159, 0, 80));
		
		unluSoru6_4.setForeground(new Color(255, 255, 255));
		unluSoru6_4.setBackground(new Color(159, 0, 80));
		//7
		unluSoru7_1.setForeground(new Color(255, 255, 255));
		unluSoru7_1.setBackground(new Color(159, 0, 80));
		
		unluSoru7_2.setForeground(new Color(255, 255, 255));
		unluSoru7_2.setBackground(new Color(159, 0, 80));
		
		unluSoru7_3.setForeground(new Color(255, 255, 255));
		unluSoru7_3.setBackground(new Color(159, 0, 80));
		
		unluSoru7_4.setForeground(new Color(255, 255, 255));
		unluSoru7_4.setBackground(new Color(159, 0, 80));
		//8
		unluSoru8_1.setForeground(new Color(255, 255, 255));
		unluSoru8_1.setBackground(new Color(159, 0, 80));
		
		unluSoru8_2.setForeground(new Color(255, 255, 255));
		unluSoru8_2.setBackground(new Color(159, 0, 80));
		
		unluSoru8_3.setForeground(new Color(255, 255, 255));
		unluSoru8_3.setBackground(new Color(159, 0, 80));
		
		unluSoru8_4.setForeground(new Color(255, 255, 255));
		unluSoru8_4.setBackground(new Color(159, 0, 80));
		//9
		unluSoru9_1.setForeground(new Color(255, 255, 255));
		unluSoru9_1.setBackground(new Color(159, 0, 80));
		
		unluSoru9_2.setForeground(new Color(255, 255, 255));
		unluSoru9_2.setBackground(new Color(159, 0, 80));
		
		unluSoru9_3.setForeground(new Color(255, 255, 255));
		unluSoru9_3.setBackground(new Color(159, 0, 80));
		
		unluSoru9_4.setForeground(new Color(255, 255, 255));
		unluSoru9_4.setBackground(new Color(159, 0, 80));
		
		//10
		unluSoru10_1.setForeground(new Color(255, 255, 255));
		unluSoru10_1.setBackground(new Color(159, 0, 80));
		
		unluSoru10_2.setForeground(new Color(255, 255, 255));
		unluSoru10_2.setBackground(new Color(159, 0, 80));
		
		unluSoru10_3.setForeground(new Color(255, 255, 255));
		unluSoru10_3.setBackground(new Color(159, 0, 80));
		
		unluSoru10_4.setForeground(new Color(255, 255, 255));
		unluSoru10_4.setBackground(new Color(159, 0, 80));
			
		
		
		//Iconlar
		
		ImageIcon unluIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\UnluTahmin.jpg",662, 363);
		ImageIcon unluIcon1 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\AleynaTilki.jpeg",300,150);
		ImageIcon unluIcon2 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\yena2.jpg",180,200);
		ImageIcon unluIcon3 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\AamirKhan.jpg",180,200);
		ImageIcon unluIcon4 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\AlpaslanÖzmol.jpg",250,150);
		ImageIcon unluIcon5 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\bellaHadid1.jpg",275,150);
		ImageIcon unluIcon6 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\DuaLipa2.jpg",150,215);
		ImageIcon unluIcon7 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\Gordon Ramsay.jpg",200,200);
		ImageIcon unluIcon8 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\hoyeonJung.jpeg",300,150);
		ImageIcon unluIcon9 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\SeanPaul3.jpg",275,150);
		ImageIcon unluIcon10 = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\ünlufoto\\Zendaya.jpeg",150,200);
		
		/////////////////////////////////////////////////////////////////
		
		//1
		JLabel unluSoru1_unlu = new JLabel(unluIcon1);
		unluSoru1_unlu.setBounds(191, 11, 300, 150);
		unluSoru1.add(unluSoru1_unlu);
		unluOyunBaslat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unluGirisPaneli.setVisible(false);
				unluSoru1.setVisible(true);
			}
		});
		//2
		JLabel unluSoru2_unlu = new JLabel(unluIcon2);
		unluSoru2_unlu.setBounds(247, 11, 170, 200);
		unluSoru2.add(unluSoru2_unlu);
		
		//3
		
		JLabel unluSoru3_unlu = new JLabel(unluIcon3);
		unluSoru3_unlu.setBounds(241, 12, 180, 200);
		unluSoru3.add(unluSoru3_unlu);

			
		//4
		JLabel unluSoru4_unlu = new JLabel(unluIcon4);
		unluSoru4_unlu.setBounds(191, 11, 300, 150);
		unluSoru4.add(unluSoru4_unlu);
		
		//5
				JLabel unluSoru5_unlu = new JLabel(unluIcon5);
				unluSoru5_unlu.setBounds(191, 11, 275, 186);
				unluSoru5.add(unluSoru5_unlu);
				
				//6
				
				JLabel unluSoru6_unlu = new JLabel(unluIcon6);
				unluSoru6_unlu.setBounds(241, 12, 150, 215);
				unluSoru6.add(unluSoru6_unlu);

					
				//7
				JLabel unluSoru7_unlu = new JLabel(unluIcon7);
				unluSoru7_unlu.setBounds(191, 11, 300, 200);
				unluSoru7.add(unluSoru7_unlu);
				//8
				JLabel unluSoru8_unlu = new JLabel(unluIcon8);
				unluSoru8_unlu.setBounds(191, 11, 300, 150);
				unluSoru8.add(unluSoru8_unlu);
				
				//9
				
				JLabel unluSoru9_unlu = new JLabel(unluIcon9);
				unluSoru9_unlu.setBounds(178, 12, 306, 182);
				unluSoru9.add(unluSoru9_unlu);

					
				//10
				JLabel unluSoru10_unlu = new JLabel(unluIcon10);
				unluSoru10_unlu.setBounds(256, 11, 150, 200);
				unluSoru10.add(unluSoru10_unlu);
		
			
		
		
		
		/////////////////////////////////////////////////////////
		JLabel unluLabel = new JLabel(unluIcon);
		unluLabel.setBounds(0, 0, 662, 363);
		contentPane.add(unluLabel);


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
