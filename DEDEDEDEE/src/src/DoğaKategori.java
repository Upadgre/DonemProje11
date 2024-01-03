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

public class DoğaKategori extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int puan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoğaKategori dogaFrame = new DoğaKategori();
					dogaFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DoğaKategori() {
		puan =0;
		setTitle("Ünlü Tahmini Bilgi Yarışması");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//giriş sayfası

		JPanel dogaGirisPaneli = new JPanel();
		dogaGirisPaneli.setBounds(0, 0, 662, 363);
		contentPane.add(dogaGirisPaneli);
		dogaGirisPaneli.setLayout(null);
		dogaGirisPaneli.setVisible(true);

		JLabel dogaGirisMesaj1 = new JLabel("Uçsuz bucaksız dogaın sınırlarını zorlamak istiyorsun demek...");
		dogaGirisMesaj1.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaGirisMesaj1.setHorizontalAlignment(SwingConstants.CENTER);
		dogaGirisMesaj1.setBounds(24, 60, 613, 99);
		dogaGirisPaneli.add(dogaGirisMesaj1);

		JLabel dogaGirisMesaj2 = new JLabel("O halde gel seninle ufak bir doga gezisine çıkalım");
		dogaGirisMesaj2.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaGirisMesaj2.setHorizontalAlignment(SwingConstants.CENTER);
		dogaGirisMesaj2.setBounds(45, 145, 572, 76);
		dogaGirisPaneli.add(dogaGirisMesaj2);

        //Paneller

		JPanel dogaSoru1 = new JPanel();
		dogaSoru1.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru1);
		dogaSoru1.setLayout(null);
		dogaSoru1.setVisible(false);


		JPanel dogaSoru2 = new JPanel();
		dogaSoru2.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru2);
		dogaSoru2.setVisible(false);

		JPanel dogaSoru3 = new JPanel();
		dogaSoru3.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru3);
		dogaSoru3.setLayout(null);
		dogaSoru3.setVisible(false);


		JPanel dogaSoru4 = new JPanel();
		dogaSoru4.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru4);
		dogaSoru4.setLayout(null);
		dogaSoru4.setVisible(false);

		JPanel dogaSoru5 = new JPanel();
		dogaSoru5.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru5);
		dogaSoru5.setLayout(null);
		dogaSoru5.setVisible(false);

		JPanel dogaSoru6 = new JPanel();
		dogaSoru6.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru6);
		dogaSoru6.setVisible(false);

		JPanel dogaSoru7 = new JPanel();
		dogaSoru7.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru7);
		dogaSoru7.setLayout(null);
		dogaSoru7.setVisible(false);

		JPanel dogaSoru8 = new JPanel();
		dogaSoru8.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru8);
		dogaSoru8.setLayout(null);
		dogaSoru8.setVisible(false);

		JPanel dogaSoru9 = new JPanel();
		dogaSoru9.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru9);
		dogaSoru9.setLayout(null);
		dogaSoru9.setVisible(false);

		JPanel dogaSoru10 = new JPanel();
		dogaSoru10.setBounds(0, 0, 662, 363);
		contentPane.add(dogaSoru10);
		dogaSoru10.setLayout(null);
		dogaSoru10.setVisible(false);

		JPanel sonucEkrani_doga = new JPanel();
		sonucEkrani_doga.setBounds(0, 0, 662, 363);
		contentPane.add(sonucEkrani_doga);
		sonucEkrani_doga.setLayout(null);
		
		//opaklık ayarları
		
		dogaGirisPaneli.setOpaque(false);
		dogaSoru1.setOpaque(false);
		dogaSoru2.setOpaque(false);
		dogaSoru3.setOpaque(false);
		dogaSoru4.setOpaque(false);
		dogaSoru5.setOpaque(false);
		dogaSoru6.setOpaque(false);
		dogaSoru7.setOpaque(false);
		dogaSoru8.setOpaque(false);
		dogaSoru9.setOpaque(false);
		dogaSoru10.setOpaque(false);
		sonucEkrani_doga.setOpaque(false);

		
	
		//Soru Textleri
		//1.Soru Sayfası

		JLabel dogaSoru1_sorubaslik = new JLabel("Soru 1 :");
		dogaSoru1_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru1_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru1_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru1.add(dogaSoru1_sorubaslik);

		JLabel dogaSoru1_soru = new JLabel("Mavi balinaların dillerinin ağırlığı yetişkin bir filin ağırlığı kadardır");
		dogaSoru1_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru1_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru1_soru.setBounds(89, 104, 484, 116);
		dogaSoru1.add(dogaSoru1_soru);

		//2.Soru Sayfası

		JLabel dogaSoru2_sorubaslik = new JLabel("Soru 2 :");
		dogaSoru2_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru2_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru2_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru2.add(dogaSoru2_sorubaslik);

		JLabel dogaSoru2_soru = new JLabel("Kara sinekler \"Fa\" notasıyla vızıldarlar");
		dogaSoru2_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru2_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru2_soru.setBounds(95, 104, 420, 116);
		dogaSoru2.add(dogaSoru2_soru);
		
		//3.Soru Sayfası

		JLabel dogaSoru3_sorubaslik = new JLabel("Soru 3 :");
		dogaSoru3_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru3_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru3_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru3.add(dogaSoru3_sorubaslik);

		JLabel dogaSoru3_soru = new JLabel("Dişi imparator pengueni  kuluçkada 2 ay boyunca erkeğin yemek getirmesini bekler");
		dogaSoru3_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru3_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		dogaSoru3_soru.setBounds(26, 104, 610, 116);
		dogaSoru3.add(dogaSoru3_soru);
		
		//4.Soru Sayfası

		JLabel dogaSoru4_sorubaslik = new JLabel("Soru 4 :");
		dogaSoru4_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru4_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru4_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru4.add(dogaSoru4_sorubaslik);

		JLabel dogaSoru4_soru = new JLabel("İstiridyeler yaşamları boyunca birçok kez kendi cinsiyetlerini değiştirirler.");
		dogaSoru4_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru4_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru4_soru.setBounds(32, 104, 598, 116);
		dogaSoru4.add(dogaSoru4_soru);
		
		//5.Soru Sayfası

		JLabel dogaSoru5_sorubaslik = new JLabel("Soru 5 :");
		dogaSoru5_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru5_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru5_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru5.add(dogaSoru5_sorubaslik);

		JLabel dogaSoru5_soru = new JLabel("En uzun hamilelik süresi olan memeliler yunuslardır");
		dogaSoru5_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		dogaSoru5_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru5_soru.setBounds(95, 104, 420, 116);
		dogaSoru5.add(dogaSoru5_soru);
		
		//6.Soru Sayfası

		JLabel dogaSoru6_sorubaslik = new JLabel("Soru 6 :");
		dogaSoru6_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru6_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru6_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru6.add(dogaSoru6_sorubaslik);

		JLabel dogaSoru6_soru = new JLabel("Yeni doğmuş zürafalar 1 yıl kadar yürüyemez");
		dogaSoru6_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru6_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru6_soru.setBounds(95, 104, 420, 116);
		dogaSoru6.add(dogaSoru6_soru);
		
		//7.Soru Sayfası

		JLabel dogaSoru7_sorubaslik = new JLabel("Soru 7 :");
		dogaSoru7_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru7_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru7_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru7.add(dogaSoru7_sorubaslik);

		JLabel dogaSoru7_soru = new JLabel("Tarantulalar avlarını bütün şekilde yutarlar");
		dogaSoru7_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru7_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru7_soru.setBounds(95, 104, 420, 116);
		dogaSoru7.add(dogaSoru7_soru);
		
		//8.Soru Sayfası

		JLabel dogaSoru8_sorubaslik = new JLabel("Soru 8 :");
		dogaSoru8_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru8_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru8_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru8.add(dogaSoru8_sorubaslik);

		JLabel dogaSoru8_soru = new JLabel("Bütün kaplanların çizgileri aynıdır.");
		dogaSoru8_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru8_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru8_soru.setBounds(95, 104, 420, 116);
		dogaSoru8.add(dogaSoru8_soru);
		
		//9.Soru Sayfası

		JLabel dogaSoru9_sorubaslik = new JLabel("Soru 9 :");
		dogaSoru9_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru9_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru9_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru9.add(dogaSoru9_sorubaslik);

		JLabel dogaSoru9_soru = new JLabel("Kar leoparları bir seferde 15 metre ileriye zıplayabilirler");
		dogaSoru9_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru9_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru9_soru.setBounds(95, 104, 420, 116);
		dogaSoru9.add(dogaSoru9_soru);
		//10.Soru Sayfası

		JLabel dogaSoru10_sorubaslik = new JLabel("Soru 10 :");
		dogaSoru10_sorubaslik.setFont(new Font("Segoe Script", Font.BOLD, 17));
		dogaSoru10_sorubaslik.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru10_sorubaslik.setBounds(85, 54, 130, 39);
		dogaSoru10.add(dogaSoru10_sorubaslik);

		JLabel dogaSoru10_soru = new JLabel("Boz ayılar 48 km hızla koşabilirler");
		dogaSoru10_soru.setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		dogaSoru10_soru.setHorizontalAlignment(SwingConstants.CENTER);
		dogaSoru10_soru.setBounds(95, 104, 420, 116);
		dogaSoru10.add(dogaSoru10_soru);
		
		//sonuc ekranı sonuc textleri
		
		JLabel sonucuGostermeMesaji_doga = new JLabel("Sonuç ekranını görmek için tıkla:");
		sonucuGostermeMesaji_doga.setHorizontalAlignment(SwingConstants.CENTER);
		sonucuGostermeMesaji_doga.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		sonucuGostermeMesaji_doga.setBounds(44, 120, 557, 71);
		sonucEkrani_doga.add(sonucuGostermeMesaji_doga);
		
		JButton sonucEkraniGotur_doga = new JButton("Sonuç Ekranı");
		sonucEkraniGotur_doga.setBackground(new Color(0, 64, 0));
		sonucEkraniGotur_doga.setForeground(new Color(255, 255, 255));
		sonucEkraniGotur_doga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonucEkrani frame2= new sonucEkrani();
				frame2.setVisible(true);
				dispose();
			}
		});
		sonucEkraniGotur_doga.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		sonucEkraniGotur_doga.setBounds(151, 211, 345, 87);
		sonucEkrani_doga.add(sonucEkraniGotur_doga);
		sonucEkrani_doga.setVisible(false);

		

		//1. Soru ekranı butonları
		//1.buton

		JButton dogaSoru1_dogru = new JButton("Doğru");
		dogaSoru1_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru1.setVisible(false);
				dogaSoru2.setVisible(true);
			}
		});
		dogaSoru1_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru1_dogru.setBounds(85, 231, 200, 50);
		dogaSoru1.add(dogaSoru1_dogru);

		//2.buton

		JButton dogaSoru1_yanlis = new JButton("Yanlış");
		dogaSoru1_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru1.setVisible(false);
				dogaSoru2.setVisible(true);
			}
		});
		dogaSoru1_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru1.add(dogaSoru1_yanlis);
		dogaSoru2.setLayout(null);
		
		//3.buton

		JButton dogaSoru2_dogru = new JButton("Doğru");
		dogaSoru2_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru2.setVisible(false);
				dogaSoru3.setVisible(true);
			}
		});
		dogaSoru2_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru2_dogru.setBounds(85, 292, 200, 50);
		dogaSoru2.add(dogaSoru2_dogru);
		
		//4.buton

		JButton dogaSoru2_yanlis = new JButton("Yanlış");
		dogaSoru2_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru2.setVisible(false);
				dogaSoru3.setVisible(true);
			}
		});
		dogaSoru2_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru2.add(dogaSoru2_yanlis);

		//3. Soru ekranı butonları
		//1.buton

		JButton dogaSoru3_dogru = new JButton("Doğru");
		dogaSoru3_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru3.setVisible(false);
				dogaSoru4.setVisible(true);
			}
		});
		dogaSoru3_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		
		dogaSoru3.add(dogaSoru3_dogru);

		//2.buton

		JButton dogaSoru3_yanlis = new JButton("Yanlış");
		dogaSoru3_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru3.setVisible(false);
				dogaSoru4.setVisible(true);
			}
		});
		dogaSoru3_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		
		dogaSoru3.add(dogaSoru3_yanlis);

		//4. Soru ekranı butonları
		//1.buton

		JButton dogaSoru4_dogru = new JButton("Doğru");
		dogaSoru4_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru4.setVisible(false);
				dogaSoru5.setVisible(true);
			}
		});
		dogaSoru4_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		
		dogaSoru4.add(dogaSoru4_dogru);

		//2.buton

		JButton dogaSoru4_yanlis = new JButton("Yanlış");
		dogaSoru4_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru4.setVisible(false);
				dogaSoru5.setVisible(true);
			}
		});
		dogaSoru4_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru4_yanlis.setBounds(377, 231, 200, 50);
		dogaSoru4.add(dogaSoru4_yanlis);
		dogaSoru5.setLayout(null);

		//3.buton

		JButton dogaSoru5_dogru = new JButton("Doğru");
		dogaSoru5_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dogaSoru5.setVisible(false);
				dogaSoru6.setVisible(true);
			}
		});
		dogaSoru5_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru5_dogru.setBounds(85, 292, 200, 50);
		dogaSoru5.add(dogaSoru5_dogru);

		//4.buton

		JButton dogaSoru5_yanlis = new JButton("Yanlış");
		dogaSoru5_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru5.setVisible(false);
				dogaSoru6.setVisible(true);
			}
		});
		dogaSoru5_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru5_yanlis.setBounds(377, 292, 200, 50);
		dogaSoru5.add(dogaSoru5_yanlis);
		dogaSoru6.setLayout(null);

		//3.buton

		JButton dogaSoru6_dogru = new JButton("Doğru");
		dogaSoru6_dogru.setBounds(85, 292, 200, 50);
		dogaSoru6_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru6.setVisible(false);
				dogaSoru7.setVisible(true);
			}
		});
		dogaSoru6_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru6.add(dogaSoru6_dogru);

		//4.buton

		JButton dogaSoru6_yanlis = new JButton("Yanlış");
		dogaSoru6_yanlis.setBounds(377, 292, 200, 50);
		dogaSoru6_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru6.setVisible(false);
				dogaSoru7.setVisible(true);
			}
		});
		dogaSoru6_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru6.add(dogaSoru6_yanlis);

		//7. Soru ekranı butonları
		//1.buton

		JButton dogaSoru7_dogru = new JButton("Doğru");
		dogaSoru7_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru7.setVisible(false);
				dogaSoru8.setVisible(true);
			}
		});
		dogaSoru7_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru7_dogru.setBounds(85, 231, 200, 50);
		dogaSoru7.add(dogaSoru7_dogru);

		//2.buton

		JButton dogaSoru7_yanlis = new JButton("Yanlış");
		dogaSoru7_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru7.setVisible(false);
				dogaSoru8.setVisible(true);
			}
		});
		dogaSoru7_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru7_yanlis.setBounds(377, 231, 200, 50);
		dogaSoru7.add(dogaSoru7_yanlis);

		//3.buton

		JButton dogaSoru8_dogru = new JButton("Doğru");
		dogaSoru8_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru8.setVisible(false);
				dogaSoru9.setVisible(true);
			}
		});
		dogaSoru8_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru8_dogru.setBounds(85, 292, 200, 50);
		dogaSoru8.add(dogaSoru8_dogru);

		//4.buton

		JButton dogaSoru8_yanlis = new JButton("Yanlış");
		dogaSoru8_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru8.setVisible(false);
				dogaSoru9.setVisible(true);
			}
		});
		dogaSoru8_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru8_yanlis.setBounds(377, 292, 200, 50);
		dogaSoru8.add(dogaSoru8_yanlis);

		//9. soru ekranı butonları
		//1.buton

		JButton dogaSoru9_dogru = new JButton("Doğru");
		dogaSoru9_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru9.setVisible(false);
				dogaSoru10.setVisible(true);
			}
		});
		dogaSoru9.setLayout(null);
		dogaSoru9_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru9_dogru.setBounds(85, 231, 200, 50);
		dogaSoru9.add(dogaSoru9_dogru);

		//2.buton

		JButton dogaSoru9_yanlis = new JButton("Yanlış");
		dogaSoru9_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru9.setVisible(false);
				dogaSoru10.setVisible(true);
			}
		});
		dogaSoru9_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru9_yanlis.setBounds(377, 231, 200, 50);
		dogaSoru9.add(dogaSoru9_yanlis);
		dogaSoru10.setLayout(null);

		//3.buton

		JButton dogaSoru10_dogru = new JButton("Doğru");
		
		dogaSoru10_dogru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan +=1;
				dogaSoru10.setVisible(false);
				sonucEkrani_doga.setVisible(true);
			}
		});
		dogaSoru10_dogru.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru10.add(dogaSoru10_dogru);

		//4.buton

		JButton dogaSoru10_yanlis = new JButton("Yanlış");
		dogaSoru10_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru10_yanlis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaSoru10.setVisible(false);
				sonucEkrani_doga.setVisible(true);
			}
		});
		dogaSoru10_yanlis.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		dogaSoru10.add(dogaSoru10_yanlis);

		setLocationRelativeTo(null);

		JButton dogaOyunBaslat = new JButton("Yolla Gelsin!");
		dogaOyunBaslat.setFont(new Font("Segoe Script", Font.PLAIN, 19));

		dogaOyunBaslat.setBounds(230, 242, 202, 62);
		dogaGirisPaneli.add(dogaOyunBaslat);
		dogaOyunBaslat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dogaGirisPaneli.setVisible(false);
				dogaSoru1.setVisible(true);
			}
		});
		
		//buton setbounds
		
		dogaSoru1_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru2_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru3_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru4_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru5_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru6_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru7_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru8_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru9_yanlis.setBounds(377, 231, 200, 111);
		dogaSoru10_yanlis.setBounds(377, 231, 200, 111);
		
		dogaSoru1_dogru.setBounds(85, 231, 200, 111);
		dogaSoru2_dogru.setBounds(85, 231, 200, 111);
		dogaSoru3_dogru.setBounds(85, 231, 200, 111);
		dogaSoru4_dogru.setBounds(85, 231, 200, 111);
		dogaSoru5_dogru.setBounds(85, 231, 200, 111);
		dogaSoru6_dogru.setBounds(85, 231, 200, 111);
		dogaSoru7_dogru.setBounds(85, 231, 200, 111);
		dogaSoru8_dogru.setBounds(85, 231, 200, 111);
		dogaSoru9_dogru.setBounds(85, 231, 200, 111);
		dogaSoru10_dogru.setBounds(85, 231, 200, 111);
		
		
		
		
		
ImageIcon dogaIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\dogaBackground.jpg",662, 363);
		
		JLabel dogaBackgroundLabel = new JLabel(dogaIcon);
		dogaBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(dogaBackgroundLabel);



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
