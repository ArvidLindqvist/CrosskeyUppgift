package org.crosskey.uppgift;

public class MyMath {
	
	public static double power(double base, int exponent) {
	    double ans = 1;
	        int absExponent = exponent > 0 ? exponent : (-1) * exponent; // Making sure the exponent is positive
	        for (int i = 0; i <= absExponent; i++) {
	            ans *= base;
	        }
	    return ans;
	}

}
