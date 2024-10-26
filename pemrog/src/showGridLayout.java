import javax.swing.*;
import java.awt.GridLayout;

public class showGridLayout extends JFrame {
    public showGridLayout() {
        // Set the layout to a 3x2 grid with 5-pixel gaps
        setLayout(new GridLayout(3, 2, 5, 5));

        // Add components to the frame
        add(new JLabel("Nama: "));
        add(new JTextField(8));
        add(new JLabel("NIM: "));
        add(new JTextField(1));
        add(new JLabel("Jurusan: "));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        JButton button = new JButton("Compute Payment");
        showGridLayout frame = new showGridLayout();
        frame.setTitle("ShowGridLayout");
        button.setBounds(150, 200, 220, 50);
        
        frame.add(button);
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
