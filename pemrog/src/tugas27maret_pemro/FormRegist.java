package tugas27maret_pemro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormRegist {
    public static void main(String[] args) {
        JFrame main = new JFrame();
        JPanel p1 = new JPanel();
        JLabel title = new JLabel("Form Registrasi");
        title.setForeground(Color.BLUE);
        title.setFont(new Font("Times New Roman", Font.BOLD, 24));
        p1.add(title, JLabel.CENTER);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(8, 2, 0, 10));
        JTextField nama = new JTextField(10);
        JTextField email = new JTextField(10);
        JTextField password = new JTextField(10);
        JTextField konfirmasiPassword = new JTextField(10);
        JTextField negara = new JTextField(10);
        JTextField provinsi = new JTextField(10);
        JTextField telepon = new JTextField(10);
        p2.add(new JLabel("Nama *:"));
        p2.add(nama);
        p2.add(new JLabel("Email *:"));
        p2.add(email);
        p2.add(new JLabel("Password *:"));
        p2.add(password);
        p2.add(new JLabel("Konfirmasi Password *:"));
        p2.add(konfirmasiPassword);
        p2.add(new JLabel("Negara :"));
        p2.add(negara);
        p2.add(new JLabel("Provinsi :"));
        p2.add(provinsi);
        p2.add(new JLabel("Nomor Telepon :"));
        p2.add(telepon);
        p2.add(new JLabel("* Wajib Diisi"));
        p2.add(new JLabel());

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 3, 10, 10));
        JButton daftar = new JButton("Daftar");
        JButton ambilData = new JButton("Ambil Data");
        JButton hapus = new JButton("Hapus");
        p3.add(daftar);
        p3.add(ambilData);
        p3.add(hapus);

        main.add(p1, BorderLayout.NORTH);
        main.add(p2, BorderLayout.CENTER);
        main.add(p3, BorderLayout.SOUTH);

        main.setSize(700, 500);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
}

