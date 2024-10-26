package Loan;


public class testLoan{
    public static void main(String[] args){
        Loan loan1 = new Loan();
        System.out.println("Loan created at " + loan1.getLoanDate());
        System.out.println("Loan Amount " + loan1.getLoanAmount());
        System.out.println("Total Payment " + loan1.getTotalPayment());
        System.out.println("Monthly Payment " + loan1.getMonthlyPayment());

        Loan loan2 = new Loan();
        loan2.setAnnualInterestRate(1.5);
        loan2.setLoanAmount(2000);
        loan2.setNumberOfYears(3);
        System.out.println("Loan created at " + loan2.getLoanDate());
        System.out.println("Loan Amount " + loan2.getLoanAmount());
        System.out.println("Total Payment " + loan2.getTotalPayment());
        System.out.println("Monthly Payment " + loan2.getMonthlyPayment());

    }
}
