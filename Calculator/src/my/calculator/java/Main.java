package my.calculator.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // скануЇмо введен≥ дан≥
		Maths maths = new Maths();				//створюЇмо екземпл€р класу
		double result = 0;						//оголошуЇмо зм≥нну результату та реал≥зуЇмо
		double inputA, inputB;					//оголошуЇмо зм≥нн≥ €к≥ вводимо
		char operator;							//переводимо оператор в чар
		boolean done = false;					//команда не розп≥знана
		
		while (!done){
			System.out.println("¬вед≥ть будь ласка числа та д≥ю в наступному формат≥: число д≥€ число");
			inputA = input.nextDouble();
			operator = input.next().charAt(0);
			inputB = input.nextDouble();
			
			switch (operator){
			case '+': result = Maths.add(inputA, inputB);
			break;
			case '-': result = Maths.subtract(inputA, inputB);
			break;
			case '*': result = Maths.multiply(inputA, inputB);
			break;
			case '/': result = Maths.div(inputA, inputB);
			break;
			case '^': result = Maths.power(inputA, inputB);
			break;
			}
			
		System.out.println(result);	
		}
		
	input.close();	
	}

}
