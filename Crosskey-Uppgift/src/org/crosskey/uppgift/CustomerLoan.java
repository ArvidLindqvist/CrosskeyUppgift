package org.crosskey.uppgift;


public class CustomerLoan {
	
	
    public static String monthlyLoan(Customer customer){
        double totalLoan = customer.getLoan();
        double interest = customer.getInterest() * 0.01;
        int nrPayments = customer.getYears() * 12;

        double monthlyPayment = totalLoan * (interest * MyMath.power(1 + interest, nrPayments)/ (MyMath.power(1 + interest, nrPayments) - 1));
        		
        return  String.format("%.2f", monthlyPayment);
    }

    
}
