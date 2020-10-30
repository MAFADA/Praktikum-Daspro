package JOBSHEET6;
import java.util.Scanner;
public class Tugas2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nilai,jumlah=0,bilGen;
		float rata2;
		
		System.out.print("Masukkan range bilangan = ");
		nilai = sc.nextInt();
		bilGen = nilai/2;
		System.out.printf("Banyaknya Bilangan Genap dari 1 sampai %d adalah %d\n",nilai,bilGen);
		
		int i;
		int j=1 ;
		for(i=1;i<=nilai;i++){
			
			if(i%2==0){
			System.out.printf("Bilangan Genap Ke-%d adalah %d\n",j,i);
			if(j<=bilGen){
				j++;
				}
			}else continue;
			jumlah=jumlah+i;	
						
		}System.out.printf("Jumlah bilangan genap dari 1 sampai %d = %d \n",nilai,jumlah);
		rata2 = (float)(jumlah/bilGen);
		System.out.printf("Rata-rata bilangan genap dari 1 sampai %d = %.1f\n",nilai,rata2);
		
	}
}