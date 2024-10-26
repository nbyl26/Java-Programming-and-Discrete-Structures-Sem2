package tugas27maret_pemro;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Loan {
    public static void main(String[] args) {
        JFrame main = new JFrame();

        JPanel p1 = new JPanel();
        p1.setBorder(new TitledBorder("Enter loan amount, interest rate, and years"));
        p1.setLayout(new GridLayout(5,2));

        JTextField interestRate = new JTextField(10);
        JTextField numberOfYears = new JTextField(10);
        JTextField loanAmount = new JTextField(10);
        JTextField monthlyPayment = new JTextField(10);
        JTextField totalPayment = new JTextField(10);
        
        monthlyPayment.setEditable(false);
        totalPayment.setEditable(false);

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
        
        JPanel p2 = new JPanel();

        p2.setLayout(new GridLayout(1,2));
        p2.add(new JLabel());

        JButton btn = new JButton("Compute Payment");
        p2.add(btn);
        
        main.add(p1, BorderLayout.CENTER);
        main.add(p2, BorderLayout.SOUTH); 
       
        main.setSize(500, 300);
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}

