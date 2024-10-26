import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormGUIHandler extends JFrame{
    JTextField nama = new JTextField();
    JTextField email = new JTextField();
    JTextField password = new JTextField();
    JTextField passwordConfirm = new JTextField();
    JTextField negara = new JTextField();
    JTextField provinsi = new JTextField();
    JTextField nomorTelepon = new JTextField();

    JButton daftar = new JButton("Daftar");
    JButton hapus = new JButton("Hapus");
    JButton ambilData = new JButton("Ambil Data");

    public FormGUIHandler(){
        JPanel p1 = new JPanel();
        JLabel title = new JLabel("Form Registrasi");
        title.setForeground(Color.BLUE);
        p1.add(title, BorderLayout.CENTER);

        JPanel p2 = new JPanel(new GridLayout(8, 2, 0, 10));
        p2.add( new JLabel("Nama *:"));
        p2.add(this.nama);
        p2.add( new JLabel("Email *:"));
        p2.add(this.email);
        p2.add( new JLabel("Password *:"));
        p2.add(this.password);
        p2.add( new JLabel("Konfirmasi Password *:"));
        p2.add(this.passwordConfirm);
        p2.add( new JLabel("Negara :"));
        p2.add(this.negara);
        p2.add( new JLabel("Provinsi :"));
        p2.add(this.provinsi);
        p2.add( new JLabel("Nomor Telepon :"));
        p2.add(this.nomorTelepon);
        p2.add(new JLabel("* Wajib Diisi"));

        JPanel p3 = new JPanel(new GridLayout(1, 3, 5,0));
        ButtonHandler btnHandler = new ButtonHandler();
        this.daftar.addActionListener(btnHandler);
        this.hapus.addActionListener(btnHandler);
        this.ambilData.addActionListener(btnHandler);
        p3.add(this.daftar);
        p3.add(this.hapus);
        p3.add(this.ambilData);

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        this.add(p3, BorderLayout.SOUTH);
    }


    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if(formFilled()){
                System.out.println("TERISI SEMUA");
                if(e.getSource() == daftar){
                    if(password.getText().equals(passwordConfirm.getText())){
                        JOptionPane.showMessageDialog(null, "Daftar Berhasil");
                    }else{
                        JOptionPane.showMessageDialog(null, "Password dan Konfirmasi Password tidak sama", "Peringatan!!",JOptionPane.ERROR_MESSAGE);
                    }
                }else if( e.getSource() == hapus){
                    JOptionPane.showMessageDialog(null, "Ini Action Hapus Data","Informasi",JOptionPane.INFORMATION_MESSAGE);
                }else if( e.getSource() == ambilData){
                    JOptionPane.showMessageDialog(null, "Ini Action Ambil Data","Informasi",JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Field Kosong\n* Wajib di isi","Peringatan!!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean formFilled(){
        boolean nama = (this.nama.getText().length() > 0);
        boolean email = (this.email.getText().length() > 0);
        boolean password = (this.password.getText().length() > 0);
        boolean passwordConfirm = (this.passwordConfirm.getText().length() > 0);

        return (nama && email && password && passwordConfirm);
    }

    public static void main(String[] args) {
        FormGUIHandler form = new FormGUIHandler();
        form.setSize(500, 500);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }
}

