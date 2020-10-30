package JOBSHEET6;

import java.util.Scanner;

public class Tugas1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int angka,i;
		
		System.out.print("Masukkan angka : ");
		angka = sc.nextInt();
		
		
		for(i=1;i<=angka;i++){
			
			if((i%5)== 0)
			continue;
			System.out.println(i);
		}
		
	}
	
}
