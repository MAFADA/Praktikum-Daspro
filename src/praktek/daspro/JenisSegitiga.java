package praktek.daspro;
import java.util.Scanner;

public class JenisSegitiga {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int sisi1,sisi2,sisi3;
		
		System.out.print("Sisi 1: ");
		sisi1=sc.nextInt();
		System.out.print("Sisi 2: ");
		sisi2=sc.nextInt();
		System.out.print("Sisi 3: ");
		sisi3=sc.nextInt();
		
		if(sisi1==sisi2&&sisi1==sisi3&&sisi2==sisi3){
			System.out.println("Segitiga sama sisi");
		}else if(sisi1==sisi2||sisi1==sisi3||sisi2==sisi3){
			System.out.println("Segitiga sama kaki");
		}else if(sisi1!=sisi2&&sisi1!=sisi3&&sisi2!=sisi3){
			System.out.println("Segitiga sembarang");
		}
	}
}
