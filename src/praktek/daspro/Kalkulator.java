package praktek.daspro;
import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String operator;
		double bil1,bil2,hasil;
		
		System.out.print("Masukkan bilangan pertama: ");
		bil1=sc.nextDouble();
		System.out.print("Masukkan operator(+, -, *, /): ");
		operator=sc.next();
		System.out.print("Masukkan bilangan kedua: ");
		bil2=sc.nextDouble();
		
		
		switch (operator){
			case "+" :
				hasil=bil1+bil2;
				System.out.println(+bil1+ " + " +bil2+ " = " +hasil);
			break;
			case "-" :
				hasil=bil1-bil2;
				System.out.println(+bil1+ " - " +bil2+ " = " +hasil);
			break;	
			case "*" :	
				hasil=bil1*bil2;
				System.out.println(+bil1+ " * " +bil2+ " = " +hasil);
			break;
			case "/":
				hasil=bil1/bil2;
				System.out.println(+bil1+ " / " +bil2+ " = " +hasil);
			break;
			
			default:
				System.out.println("Operator yang dimasukkan tidak sesuai!");
		}
			
	}
}
