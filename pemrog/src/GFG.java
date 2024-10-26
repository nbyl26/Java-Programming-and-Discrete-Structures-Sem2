import java.io.*;
import javax.swing.*;
import java.awt.*;

class GFG {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JButton button = new JButton(" Klik disini coy");

        JLabel label1 = new JLabel("nama: ");

        JLabel label2 = new JLabel("Jurusan: ");

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);

		button.setBounds(150, 200, 220, 50);

		frame.add(button);
        
        frame.add(label1);
        frame.add(label2);

		frame.setSize(400, 300);

		frame.setLayout(null);

		frame.setVisible(true);

        frame.setLocationRelativeTo(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
