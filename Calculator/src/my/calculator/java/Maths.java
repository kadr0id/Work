package my.calculator.java;

public class Maths {

	 static double add(double a, double b){
		return (a + b);
	}
	
	 static double subtract(double a, double b){
		return (a - b);		
	}
	
	 static double multiply(double a, double b){
		 return (a * b);
		
	}
	
	 static double div(double a, double b){
		 return (a / b);
		
	}
	
	 static double power(double a, double b){
		double result = a;
		
	
	for (int x = 2; x <= b; x++){
		result *=a;
		}
	
	return result;
	}
}
