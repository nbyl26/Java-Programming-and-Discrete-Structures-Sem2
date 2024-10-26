import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class LoanCalculator extends JFrame implements ActionListener {
    private JTextField txtAnnualInterestRate, txtNumberOfYears, txtLoanAmount, txtMonthlyPayment, txtTotalPayment;
    private JButton btnComputePayment;

    public LoanCalculator() {
        setTitle("Loan Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating labels
        JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate:");
        JLabel lblNumberOfYears = new JLabel("Number Of Years:");
        JLabel lblLoanAmount = new JLabel("Loan Amount:");
        JLabel lblMonthlyPayment = new JLabel("Monthly Payment:");
        JLabel lblTotalPayment = new JLabel("Total Payment:");

        // Creating text fields
        txtAnnualInterestRate = new JTextField(10);
        txtNumberOfYears = new JTextField(10);
        txtLoanAmount = new JTextField(10);
        txtMonthlyPayment = new JTextField(10);
        txtTotalPayment = new JTextField(10);
        txtMonthlyPayment.setEditable(false);
        txtTotalPayment.setEditable(false);

        // Creating button
        btnComputePayment = new JButton("Compute Payment");
        btnComputePayment.addActionListener(this);

        // Creating panel for labels and text fields
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inputPanel.add(lblAnnualInterestRate);
        inputPanel.add(txtAnnualInterestRate);
        inputPanel.add(lblNumberOfYears);
        inputPanel.add(txtNumberOfYears);
        inputPanel.add(lblLoanAmount);
        inputPanel.add(txtLoanAmount);
        inputPanel.add(lblMonthlyPayment);
        inputPanel.add(txtMonthlyPayment);
        inputPanel.add(lblTotalPayment);
        inputPanel.add(txtTotalPayment);

        // Creating panel for button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPanel.add(btnComputePayment);

        // Creating panel for the main content
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel lblEnterText = new JLabel("Enter loan amount, interest rate, and years", SwingConstants.CENTER);
        lblEnterText.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        contentPanel.add(inputPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);
        contentPanel.add(lblEnterText, BorderLayout.NORTH);

        // Adding main content panel to the frame
        add(contentPanel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComputePayment) {
            double loanAmount = Double.parseDouble(txtLoanAmount.getText());
            int numberOfYears = Integer.parseInt(txtNumberOfYears.getText());
            double annualInterestRate = Double.parseDouble(txtAnnualInterestRate.getText());

            double monthlyInterestRate = annualInterestRate / 1200;
            int numberOfPayments = numberOfYears * 12;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayments));
            double totalPayment = monthlyPayment * numberOfPayments;

            txtMonthlyPayment.setText(String.format("%.2f", monthlyPayment));
            txtTotalPayment.setText(String.format("%.2f", totalPayment));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoanCalculator();
            }
        });
    }
}
