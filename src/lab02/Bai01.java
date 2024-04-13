package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
// Cho phương trình ax + b = 0
// Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của 
// phương trình trên
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();
		
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0\n",a,b);
		
		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		}
		else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		}
		else {
			float x = (float)-b/a;
			System.out.printf("phương trình có nghiệm x = %.3f ", x );
		}
		
		scanner.close();
	}
}
