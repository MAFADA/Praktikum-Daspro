package JOBSHEET6;

import java.util.Scanner;

public class Percobaan2For {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int angka, b;
		System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
		for (b=0; true;){
			System.out.print("Masukkan bilangan : ");
			angka = input.nextInt();
			b+= angka;
			
			if (b>50) break;
		}
		System.out.printf("Angka berhenti pada jumlah angka : %d \n", b);
	}
	
}
