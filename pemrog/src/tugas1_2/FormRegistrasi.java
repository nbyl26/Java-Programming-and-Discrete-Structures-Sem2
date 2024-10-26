package tugas1_2;

import javax.swing.*;
import java.awt.*;

public class FormRegistrasi extends JFrame {
    public FormRegistrasi() {
        setTitle("Form Registrasi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(11, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelFormRegistrasi = new JLabel("Form Registrasi", SwingConstants.CENTER);
        labelFormRegistrasi.setFont(labelFormRegistrasi.getFont().deriveFont(Font.BOLD, 16f)); 
        panel.add(labelFormRegistrasi);
        panel.add(new JLabel());

        addFormField(panel, "Nama*:", new JTextField());
        addFormField(panel, "Email*:", new JTextField());
        addFormField(panel, "Password*:", new JPasswordField());
        addFormField(panel, "Konfirmasi Password*:", new JPasswordField());
        addFormField(panel, "Negara:", new JTextField());
        addFormField(panel, "Provinsi:", new JTextField());
        addFormField(panel, "Nomor Telepon:", new JTextField());

        JPanel wajibPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        wajibPanel.add(new JLabel("* Wajib Diisi"));
        panel.add(wajibPanel);
        panel.add(new JLabel());

        JButton btnDaftarButton = new JButton("Daftar");
        JButton btnAmbilDataButton = new JButton("Ambil Data");
        JButton btnHapusButton = new JButton("Hapus");

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10)); 
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 15, 10)); 
        buttonPanel.add(btnDaftarButton);
        buttonPanel.add(btnAmbilDataButton);
        buttonPanel.add(btnHapusButton);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(contentPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addFormField(JPanel panel, String labelText, JComponent textField) {
        panel.add(new JLabel(labelText));
        panel.add(textField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FormRegistrasi::new);
    }
}
