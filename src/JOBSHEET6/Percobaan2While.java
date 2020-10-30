package JOBSHEET6;

import java.util.Scanner;

public class Percobaan2While {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int angka, b;
		System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
		b=0;
		while (true){
			System.out.print("Masukkan bilangan : ");
			angka  = input.nextInt();
			b+= angka;
			if (b>50) break;
		}
		System.out.printf("Angka berhenti pada angka : %d \n", b);
	}
	
}
