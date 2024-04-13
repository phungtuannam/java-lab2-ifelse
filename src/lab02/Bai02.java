package lab02;

import java.util.Scanner;

public class Bai02 {

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất: %dx + %d = 0\n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("phương trình có nghiệm x = %.3f ", x);
		}
	}

	public static void main(String[] args) {
//		Cho phương trình: ax^2 + bx + c = 0
//		Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm 
//		của phương trình trên
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();
		System.out.print("Nhập vào biến c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc 2: %dx^2 +%dx + %d = 0\n", a, b, c);

		if (a == 0) {
			// viết logic giải pt bậc nhất
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / 2 * a;
				System.out.printf("Phương trình có nghiệm kép = %.3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm riêng biệt x1 = %.3f , x2 = %.3f", x1, x2);
			}
		}

		scanner.close();
	}

}
