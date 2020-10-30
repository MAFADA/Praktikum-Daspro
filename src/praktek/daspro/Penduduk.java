package praktek.daspro;
import java.util.Scanner;
public class Penduduk {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int umur,biayaHidup,pendapatanBulan;
		int tanggungan;
		String status;
		
		System.out.print("Masukkan umur: ");
		umur = sc.nextInt();
		
		if (umur >= 18){
			System.out.print("Masukkan Status Bekerja(yes/no): ");
			status = sc.next().toLowerCase();
			if(status.equals("yes")){
				System.out.print("Masukkan pendapatan per bulan: Rp ");
				pendapatanBulan = sc.nextInt();
				System.out.print("Masukkan jumlah tanggungan: ");
				tanggungan = sc.nextInt();
				biayaHidup = pendapatanBulan/tanggungan;
				if(biayaHidup < 300000){
					System.out.println("Penduduk miskin");
				}else{
					System.out.println("Bukan penduduk miskin");
				}
			}else{
				System.out.println("Penduduk miskin");
			}
		}else {
			System.out.print("Masukkan status sekolah(yes/no): ");
			status = sc.next().toLowerCase();
			if(status.equals("yes")){
				System.out.println("Bukan penduduk miskin");
			}else{
				System.out.println("Penduduk miskin");
			}
		}
		
	}
	
}
