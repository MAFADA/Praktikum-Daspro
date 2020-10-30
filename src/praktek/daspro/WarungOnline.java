package praktek.daspro;
import java.util.Scanner;
public class WarungOnline {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String makanan;
		int harga,biayaKirim,total,jenisKirim;
		
		System.out.print("Masukkan nama makanan: ");
		makanan = sc.nextLine();
		System.out.print("Masukkan harga makanan: Rp  ");
		harga = sc.nextInt();
		System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? ");
		jenisKirim = sc.nextInt();
		
		if(jenisKirim != 1){
			if(harga >= 100000 ){
				biayaKirim = 30000;
				total=harga+biayaKirim;
			}else{
				biayaKirim = 20000;
				total=harga+biayaKirim;
			}
		}else {
			if(harga >= 100000){
				biayaKirim = 55000;
				total=harga+biayaKirim;
			}else{
				biayaKirim = 45000;
				total=harga+biayaKirim;
			}
		}
		System.out.println("STRUK PEMBELIAN");
		System.out.println(makanan+"\t\tRp " + harga);
		System.out.println("Biaya pengiriman\tRp " + biayaKirim);
		System.out.println("TOTAL\t\t\tRp " + total);
	}
}
