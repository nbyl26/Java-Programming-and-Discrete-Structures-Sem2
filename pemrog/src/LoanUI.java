import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class LoanUI {
    public static void main(String[] args) {
        // MAIN FRAME
        JFrame main = new JFrame();

        // Panel 1
        JPanel p1 = new JPanel();
        p1.setBorder(new TitledBorder("Enter loan amount, interest rate, and years"));
        p1.setLayout(new GridLayout(5,2));

        // Membuat Field
        JTextField interestRate = new JTextField(10);
        JTextField numberOfYears = new JTextField(10);
        JTextField loanAmount = new JTextField(10);
        JTextField monthlyPayment = new JTextField(10);
        JTextField totalPayment = new JTextField(10);
        
        // Agar value dari textfield tidak bisa diubah langsung oleh user
        monthlyPayment.setEditable(false);
        totalPayment.setEditable(false);

        // Menambahkan JLabel dan Field ke Panel1
        p1.add(new JLabel("Annal Interest Rate"));
        p1.add(interestRate);
        p1.add(new JLabel("Number of Years"));
        p1.add(numberOfYears);
        p1.add(new JLabel("Loan Amount"));
        p1.add(loanAmount);
        p1.add(new JLabel("Monthly Payment"));
        p1.add(monthlyPayment);
        p1.add(new JLabel("Total Payment"));
        p1.add(totalPayment);
        
        // Panel ke 2 untuk Button
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        p2.add(new JLabel());
        // Membuat Button
        JButton btn = new JButton("Compute Payment");
        // Menambhakna btn ke Panel 2
        p2.add(btn);
        
        // Menambahkan panel P1 dan P2
        main.add(p1, BorderLayout.CENTER);
        main.add(p2, BorderLayout.SOUTH); 
       
        // Config Frame
        main.setSize(500, 300);
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}
