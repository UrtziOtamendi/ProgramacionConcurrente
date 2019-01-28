package Ariketa_1;

class Atea extends Thread {
	Kontagailua kont;
	String atea;
	String izarrak;
	String zuriunea;
	
	public Atea (String zeinAte, Kontagailua k){
		kont=k; atea=zeinAte; izarrak = ""; zuriunea="";
		
		
	}
	
	public void run() {
		try{
			for (int i=1;i<=LorategiaApp.MAX;i++){
				sleep((long)(Math.random()*1000));
				//ausazko denbora itxaron (0 eta 1 segunduren tartean)
				izarrak = izarrak + "*";
				zuriunea="";
				for(int n=1; n<=(LorategiaApp.MAX-i); n++){
					zuriunea=zuriunea+" ";
				}
				System.out.println(atea+"["+izarrak+zuriunea+"]");
				
				kont.gehitu();
			}
		} catch (InterruptedException e) {}
	}
}