package JOBSHEET6;

public class Tugas3 {
	public static void main(String[] args) {
		int un1=0,un2=1,un3;
		
		System.out.print(+un1+" "+un2);
		
		int i=2;		
		while(i<=11){
			un3=un1+un2;
			un1=un2;
			un2=un3;
		i++;
		System.out.print(" "+un3);
		}
	}
}
