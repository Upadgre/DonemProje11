package src;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class girisEkrani extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ad_Girisi;
	private static String ad,kategori;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					girisEkrani girisframe = new girisEkrani();
					girisframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public girisEkrani() {
		setTitle("Bilgi Yarışması");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel girisPanelim = new JPanel();
		girisPanelim.setBounds(0, 0, 662, 363);
		contentPane.add(girisPanelim);

		JPanel kategoriPanelim = new JPanel();
		kategoriPanelim.setBounds(0, 0, 662, 363);
		contentPane.add(kategoriPanelim);
		kategoriPanelim.setLayout(null);
		kategoriPanelim.setVisible(false);
		
		//opaklık ayarı
		
		girisPanelim.setOpaque(false);
		kategoriPanelim.setOpaque(false);

		//Uzay Sorularına Giriş

		JButton uzay_kategori_sec_butonu = new JButton("Uzay/Astronomi");
		uzay_kategori_sec_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kategori = "Uzay";
				UzayKategori uzayFrame = new UzayKategori();
				uzayFrame.setVisible(true);
				dispose();
			}
		});
		uzay_kategori_sec_butonu.setFont(new Font("Segoe Script", Font.BOLD, 15));
		uzay_kategori_sec_butonu.setBounds(140, 176, 180, 45);
		kategoriPanelim.add(uzay_kategori_sec_butonu);
		uzay_kategori_sec_butonu.setForeground(new Color(211, 211, 211));
		uzay_kategori_sec_butonu.setBackground(new Color(0, 0, 40));

		//Ünlü Tahminine Giriş

		JButton unluTahmin_kategori_sec_butonu = new JButton("Ünlü Tahmin");
		unluTahmin_kategori_sec_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kategori = "Ünlü Tahmini";
				UnluKategori unluFrame = new UnluKategori();
				unluFrame.setVisible(true);
				dispose();

			}
		});
		unluTahmin_kategori_sec_butonu.setFont(new Font("Segoe Script", Font.BOLD, 15));
		unluTahmin_kategori_sec_butonu.setBounds(380, 176, 180, 45);
		kategoriPanelim.add(unluTahmin_kategori_sec_butonu);
		unluTahmin_kategori_sec_butonu.setForeground(new Color(128, 0, 0));
		unluTahmin_kategori_sec_butonu.setBackground(new Color(255, 0, 255));

		//Yabancı Dile Giriş

		JButton dilTahmini_kategori_sec = new JButton("Yabancı Dil");
		dilTahmini_kategori_sec.setBackground(new Color(124, 95, 27));
		dilTahmini_kategori_sec.setForeground(new Color(0, 0, 0));
		dilTahmini_kategori_sec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kategori = "Yabancı Dil";
				YabancıDilKategori dilFrame = new YabancıDilKategori();
				dilFrame.setVisible(true);
				dispose();
			}
		});
		dilTahmini_kategori_sec.setFont(new Font("Segoe Script", Font.BOLD, 15));
		dilTahmini_kategori_sec.setBounds(140, 255, 180, 45);
		kategoriPanelim.add(dilTahmini_kategori_sec);
		

		JButton doga_kategori_sec_butonu = new JButton("Doğa");
		doga_kategori_sec_butonu.setBackground(new Color(0, 179, 0));
		doga_kategori_sec_butonu.setForeground(new Color(91, 46, 0));
		doga_kategori_sec_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kategori = "Doğa";
		        DoğaKategori doğaFrame = new DoğaKategori();
				doğaFrame.setVisible(true);
				dispose();


			}
		});
		doga_kategori_sec_butonu.setFont(new Font("Segoe Script", Font.BOLD, 17));
		doga_kategori_sec_butonu.setBounds(380, 255, 180, 45);
		kategoriPanelim.add(doga_kategori_sec_butonu);
		girisPanelim.setLayout(null);
		



		ad_Girisi = new JTextField();
		ad_Girisi.setHorizontalAlignment(SwingConstants.CENTER);
		ad_Girisi.setFont(new Font("Segoe Print", Font.BOLD, 22));
		ad_Girisi.setBounds(230, 204, 202, 38);
		girisPanelim.add(ad_Girisi);
		ad_Girisi.setColumns(10);

		JLabel merhabaMesaj = new JLabel("");
		merhabaMesaj.setForeground(new Color(255, 255, 255));
		merhabaMesaj.setHorizontalAlignment(SwingConstants.CENTER);
		merhabaMesaj.setFont(new Font("Snap ITC", Font.BOLD, 18));
		merhabaMesaj.setBounds(169, 21, 323, 44);
		kategoriPanelim.add(merhabaMesaj);

		JLabel kategoriSecMesaj = new JLabel("<html><div style='text-align: center;'>Burada seçebileceğin birden fazla kategori var, <br>"
				+ "kendine en çok güvendiğin kategoriyi seç ve oyuna başlayalım!</html>");
		kategoriSecMesaj.setForeground(new Color(255, 255, 255));
		kategoriSecMesaj.setHorizontalAlignment(SwingConstants.CENTER);
		kategoriSecMesaj.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		kategoriSecMesaj.setBounds(22, 76, 617, 90);
		kategoriPanelim.add(kategoriSecMesaj);
		kategoriSecMesaj.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel girisMesaj = new JLabel("Merhaba, Bilgi Yarışmasına Hoş geldin...");
		girisMesaj.setForeground(new Color(255, 255, 255));
		girisMesaj.setBackground(new Color(255, 255, 255));
		girisMesaj.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		girisMesaj.setBounds(96, 44, 469, 50);
		girisMesaj.setHorizontalAlignment(SwingConstants.CENTER);
		girisPanelim.add(girisMesaj);
		setLocationRelativeTo(null);
		ad = ad_Girisi.getText();


		JButton girisButonu = 
				
				new JButton("Oyuna Başla!");
		girisButonu.setBackground(new Color(192, 192, 192));
		girisButonu.setFont(new Font("Snap ITC", Font.PLAIN, 23));
		girisButonu.setBounds(187, 253, 288, 55);
		girisButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girisPanelim.setVisible(false);	
				kategoriPanelim.setVisible(true);	
				ad = ad_Girisi.getText();
				merhabaMesaj.setText("Merhabalar " + ad +"...");
			}
		});
		girisPanelim.add(girisButonu);

		JLabel isimIsteMesaj = new JLabel("Bize adını lütfeder misin?");
		isimIsteMesaj.setForeground(new Color(255, 255, 255));
		isimIsteMesaj.setHorizontalAlignment(SwingConstants.CENTER);
		isimIsteMesaj.setFont(new Font("Snap ITC", Font.PLAIN, 33));
		isimIsteMesaj.setBounds(64, 143, 533, 50);
		girisPanelim.add(isimIsteMesaj);
		 ImageIcon icon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\cikisButonu.png",60,60);
		JButton cikisButonu = new JButton(icon);
		cikisButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cikisButonu.setFont(new Font("Segoe Script", Font.PLAIN, 25));
		cikisButonu.setBounds(10, 11, 60, 60);
		girisPanelim.add(cikisButonu);
		
ImageIcon girisIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\YabancıDilBackground1.jpg",678, 402);
		
		JLabel girisBackgroundLabel = new JLabel(girisIcon);
		girisBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(girisBackgroundLabel);

		
		 


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


	public static String getKategori() {
		return kategori;
	}
	public static String getAd() {
		return ad;
	}
}
