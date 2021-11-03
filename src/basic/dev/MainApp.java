package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// 9.1
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				if (a > 0) {
					System.out.println("So Nguyen Duong: " );
				} else {
					if ( a != 0) {
						System.out.println("So Nguyen Am: " );
					} else {
						
					}
				}
			// 9.2
				System.out.println("Nhap vao so nguyen n:");
				int n = sc.nextInt();
				if (n % 3 == 0) {
				System.out.println(" chia het cho 3");
				}  
				if (n % 5 == 0) {
				System.out.println(" chia het cho 5");
				}
				else { 
					System.out.println("Khong chia het cho3 va 5");
				}
				// 9.3
				System.out.println("Nhap thang trong nam t = ");
				int t = sc.nextInt();
				if(t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12)
					System.out.println("Thang co 31 ngay");
				else if ( t== 4 || t == 6 || t == 9 || t == 11 )
				System.out.println("Thang co 30 ngay");
			else if ( t == 2 )
				System.out.println("Thang co 28 ngay");
				// 9.4
				Scanner scpt = new Scanner(System.in);
				System.out.println("nhap he so bac 2 b = " );
				float b = scpt.nextFloat();
				System.out.println("nhap he so bac 1 c = " );
				float c = scpt.nextFloat();
				System.out.println("nhap he so tu do d = ");
				float d = scpt.nextFloat();
				// kiem tra he so 
				if (b == 0) {
					if (c == 0) {
						System.out.println("Phuong trinh vo nghiem. ");
					}else {
						System.out.println("Phuong trinh co 1 nghiem:" + " x = " + (-d / c));
					}
				}
				// tinh delta
				float delta = c*c - 4*b*d;
				float x1;
				float x2;
				if (delta > 0) {
					x1 = (float) ((-c + Math.sqrt(delta)) / (2*b));
					x2 = (float) ((-c - Math.sqrt(delta)) / (2*d));
					System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " va x2 = " + x2);
	}else {
		System.out.println("Phuong tring vo nghiem.");
	}
	//9.5
				System.out.println("Nhap g: ");
				int g = sc.nextInt();
				System.out.println("Nhap h: ");
				int h = sc.nextInt();
				System.out.println("Nhap u: ");
				int u = sc.nextInt();
				System.out.println("Day la mot tam giac");
				System.out.println("g,h,u la ba canh cua mot tam giac");
}
}
	
			
