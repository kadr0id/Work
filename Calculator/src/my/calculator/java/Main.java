package my.calculator.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // ������� ������ ���
		Maths maths = new Maths();				//��������� ��������� �����
		double result = 0;						//��������� ����� ���������� �� ��������
		double inputA, inputB;					//��������� ���� �� �������
		char operator;							//���������� �������� � ���
		boolean done = false;					//������� �� ���������
		
		while (!done){
			System.out.println("������ ���� ����� ����� �� �� � ���������� ������: ����� �� �����");
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
