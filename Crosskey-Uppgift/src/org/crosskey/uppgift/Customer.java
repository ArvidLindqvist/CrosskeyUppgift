package org.crosskey.uppgift;

public class Customer {

	
    private String name;
    private double loan;
    private double interest;
    private int years;
    
    Customer(String name, double loan, double interest, int years){
        this.name = name;
        this.loan = loan;
        this.interest = interest;
        this.years = years;
    }
    
    public String getName() {
        return name;
    }

    public double getLoan() {
        return loan;
    }

    public double getInterest() {
        return interest;
    }

    public int getYears() {
        return years;
    }
}
	
