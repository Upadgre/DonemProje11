package src;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

public class sonucEkrani extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int sonpuan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sonucEkrani sonucFrame = new sonucEkrani();
					sonucFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public sonucEkrani() {

		//content pane oluştur

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setOpaque(false);
		contentPane.setLayout(null);

		JLabel sonucYazdirTebrik = new JLabel("New label");
		sonucYazdirTebrik.setBounds(31, 25, 600, 100);
		sonucYazdirTebrik.setHorizontalAlignment(SwingConstants.CENTER);
		sonucYazdirTebrik.setForeground(new Color(0,0,0));
		sonucYazdirTebrik.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		contentPane.add(sonucYazdirTebrik);

		JLabel sonucYazdirPuanli = new JLabel("New label");
		sonucYazdirPuanli.setHorizontalAlignment(SwingConstants.CENTER);
		sonucYazdirPuanli.setForeground(new Color(0,0,0));
		sonucYazdirPuanli.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		sonucYazdirPuanli.setBounds(31, 136, 600, 100);
		contentPane.add(sonucYazdirPuanli);

		ImageIcon uzayIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\UzayBackground.png",662, 363);
		JLabel uzayBackgroundLabel = new JLabel(uzayIcon);
		uzayBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(uzayBackgroundLabel);

		ImageIcon unluIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\UnluTahmin.jpg",662, 363);
		JLabel unluBackgroundLabel = new JLabel(unluIcon);
		unluBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(unluBackgroundLabel);

		ImageIcon dilIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\YabancıDilBackgroundd.jpg", 662, 363);
		JLabel dilBackgroundLabel = new JLabel(dilIcon);
		dilBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(dilBackgroundLabel);


		ImageIcon dogaIcon = createResizedImageIcon("C:\\Users\\Asus\\Desktop\\Java Programları\\JavaProjeDosyaları\\dogaBackground.jpg",662, 363);
		JLabel dogaBackgroundLabel = new JLabel(dogaIcon);
		dogaBackgroundLabel.setBounds(0, 0, 662, 363);
		contentPane.add(dogaBackgroundLabel);



		// Jlabelların görünürlüğünü kapat

		uzayBackgroundLabel.setVisible(false);
		unluBackgroundLabel.setVisible(false);
		dilBackgroundLabel.setVisible(false);
		dogaBackgroundLabel.setVisible(false);

		setTitle("Sonuç Ekranı");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 402);
		uzayBackgroundLabel.setVisible(false);
		
		JButton tekrarOynaButonu = new JButton("Tekrar Oyna");
		tekrarOynaButonu.setForeground(new Color(64, 128, 128));
		tekrarOynaButonu.setBackground(new Color(128, 0, 64));
		tekrarOynaButonu.setBounds(183, 216, 296, 90);
		tekrarOynaButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girisEkrani girisframe = new girisEkrani();
				girisframe.setVisible(true);
				dispose();
			}
		});
		tekrarOynaButonu.setFont(new Font("Snap ITC", Font.PLAIN, 27));
		contentPane.add(tekrarOynaButonu);
		
		
		
		
		
		

		int sonpuan=0;
		String kategori= girisEkrani.getKategori();
		if (kategori.equals("Uzay")) {
			sonpuan=UzayKategori.getPuan();
			uzayBackgroundLabel.setVisible(true);
			sonucYazdirTebrik.setForeground(new Color(211, 211, 211));
			sonucYazdirPuanli.setForeground(new Color(211, 211, 211));
			tekrarOynaButonu.setForeground(new Color(211, 211, 211));
			tekrarOynaButonu.setBackground(new Color(0, 0, 40));

		}
		else if (kategori.equals("Ünlü Tahmini")) {
			sonpuan=UnluKategori.getPuan();
			unluBackgroundLabel.setVisible(true);
			tekrarOynaButonu.setForeground(new Color(255, 255, 255));
			tekrarOynaButonu.setBackground(new Color(159, 0, 80));
			
		}
		else if (kategori.equals("Yabancı Dil")) {
			sonpuan=YabancıDilKategori.getPuan();
			dilBackgroundLabel.setVisible(true);
			tekrarOynaButonu.setForeground(new Color(64, 128, 128));
			tekrarOynaButonu.setBackground(new Color(128, 0, 64));
		}
		else if (kategori.equals("Doğa")) {
			sonpuan=DoğaKategori.getPuan();
			dogaBackgroundLabel.setVisible(true);
			tekrarOynaButonu.setForeground(new Color(255, 255, 255));
			tekrarOynaButonu.setBackground(new Color(0, 64, 0));
		}

		String ad =girisEkrani.getAd();



		sonucYazdirTebrik.setText("Tebrikler "+ad+"!");
		sonucYazdirPuanli.setText(kategori+" kategorisinde "+sonpuan+"  puan yaptınız!");



		
		ResultSet myRs= bagla.yap();
		String sql1="INSERT INTO puan1 (sonpuan,ad,kategori) VALUES ("+sonpuan+",'"+ad+"', '"+kategori+"')";
		try {
			bagla.ekle(sql1);
			System.out.println("Kayıt başarılı...");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}






		setLocationRelativeTo(null);





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
}
