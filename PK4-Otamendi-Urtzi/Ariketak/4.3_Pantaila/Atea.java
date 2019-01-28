package Ariketa3;

class Atea extends Thread {
	Kontagailua kont;
	String atea;
	Pantaila pant;
	int izarrak;
	
	public Atea (String zeinAte, Kontagailua k, Pantaila p){
		kont=k; atea=zeinAte; pant=p; izarrak=0;
		
		
	}
	
	public void run() {
		try{
			for (int i=1;i<=LorategiaApp.MAX;i++){
				sleep((long)(Math.random()*1000));
				//ausazko denbora itxaron (0 eta 1 segunduren tartean)
				izarrak ++;
				pant.margotuAtea(atea, i,izarrak);
				kont.gehitu();
			}
		} catch (InterruptedException e) {}
	}
}