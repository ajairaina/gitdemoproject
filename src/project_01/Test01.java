package project_01;

import java.util.Scanner;

public class Test01 {

	
	public static void main (String[] args) {
		
		int pencil=10;
		int amount;
		Scanner input = new Scanner(System.in);
		amount=input.nextInt();
		
		if (amount>pencil) {
			System.out.println("you can buy the pencil");
		}else {
			System.out.println("you can't buy the pencil");
		}
	}
	
}
