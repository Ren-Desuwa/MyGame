package myWorks;

import java.util.*;

public class Calculator {
	
	//	qwe123+=/*
	static Scanner scan = new Scanner(System.in);
	static String input = null;
	static char inputChar[] = {};
	static int number[] = {};
	static int i = 0,j = 0,n = 0,var = 0,opp = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Calculator");
		
		input();
		
		for (i = 0; i < inputChar.length;i++) {
			boolean flag = Character.isDigit(inputChar[i]);
			if (flag) {
				if (var == 0 && opp == 0) {
					System.out.println("this is "+ inputChar[i] +" the first numb");
					var++;
				}
				else {
					number();
				}
			}
			else {
				if (var == 0) {
					First();
				}
				else {
					Operation();
				}
			}
		}
		
		
	}

	private static void First() {
		switch (inputChar[i]) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '=':
				System.out.println("Please input a valid equation");
				break;
			default:
				System.out.println(" a word?");
		}
	}

	public static void number() {
		n = number.length;
		int[] temp = new int[n + 1];
		temp[0] = 0;
		for (j = 0 ; j < number.length ; j++) {
			temp[j] = number[j];
		}
		temp[n] = Character.getNumericValue(inputChar[i]);
		number = temp;
	}

	public static void Operation() {
		switch (inputChar[i]) {
		case '+' :
			System.out.println(inputChar[i] +" is a plus");
			break;
		case '-' :
			System.out.println(inputChar[i] +" is a minus");
			break;
		case '*' :
			System.out.println(inputChar[i] +" is a multiplication");
			break;
		case '/' :
			System.out.println(inputChar[i] +" is a division");
			break;
		case '=' :
			System.out.println(inputChar[i] +" is a equals");
			break;
		default :
			System.out.println(inputChar[i] +" is a not an opperation");
		}
	}

	public static void input() {
		input = scan.nextLine();
		inputChar= input.toCharArray();
	}
}
