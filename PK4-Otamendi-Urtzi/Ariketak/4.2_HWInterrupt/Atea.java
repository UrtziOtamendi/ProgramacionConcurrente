package Ariketa_2;

class Atea extends Thread {
	Kontagailua kont;
	String atea;
	String zuriunea;
	
	int izarrak;
	public Atea (String zeinAte, Kontagailua k){
		kont=k; 
		atea=zeinAte; 
		izarrak = 0;
		
		
	}
	
	public void run() {
		try{
			for (int i=1;i<=LorategiaApp.MAX;i++){
				sleep((long)(Math.random()*1000));
				//ausazko denbora itxaron (0 eta 1 segunduren tartean)
				izarrak = izarrak +1;
				zuriunea="";
				for(int n=1; n<=(LorategiaApp.MAX-i); n++){
					zuriunea=zuriunea+" ";
				}
				System.out.print(atea+"[");
				for(int z=0 ; z<izarrak ; z++) {

					Simulatu.HWinterrupt();
					System.out.print("*");
					
				}
				System.out.println(zuriunea+"]");
				kont.gehitu();
			}
		} catch (InterruptedException e) {}
	}
}