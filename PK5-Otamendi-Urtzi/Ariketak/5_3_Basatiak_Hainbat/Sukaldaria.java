package Ariketa_3;

import java.util.Random;

class Sukaldaria extends Thread {
	private Lapikoa lapiko;
	private Random r;
	
	public Sukaldaria(Lapikoa k){
		lapiko = k;
		r= new Random();
		
	}
	

//SUKALDARIA = ( begiratu[k:PR] ->
			//if (k<PK) then ( random[r:1..PK-k]-> bota[r] -> askatu ->SUKALDARIA )
			//else 											askatu -> SUKALDARIA).

	public void run() {
		try { while(true) {
			sleep((long)(Math.random()*1000));
			int k= lapiko.begiratu(-1);
			if(k < BasatiakApp.Razioak){
				int zenbat = (r.nextInt((BasatiakApp.Razioak - k) +1 ));

				lapiko.bete(zenbat);
			}
			sleep((long)(Math.random()*1000));
			lapiko.askatu();
		}
		} catch (InterruptedException e){}
	}
}