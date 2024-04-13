package lab02;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
//		- Nếu số điện <= 100 => số tiền = số điện x 1000
//				- Nếu số điện > 100
//				=> số tiền = 100 * 1000 + (số điện - 100) * 1500
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Chương trình tính tiền điện");
		System.out.print("Nhập vào số điện:");
		int a = scanner.nextInt();
		
		if (a <= 100) {
			int money = a * 1000;
			System.out.println("Số tiền điện = " + money);
		}
		else {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Số tiền điện = " + money);
		}
		
		scanner.close();
		
	}

}
