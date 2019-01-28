package Ariketa_13;

import java.util.Random;

class Sukaldaria extends Thread {
	private Lapikoa lapiko;
	private Random r;

	public Sukaldaria(Lapikoa k){
		lapiko = k;
		r= new Random();

	}


	//SUKALDARIA = (hil -> begiratuHozk[h:HR] -> zatitu[z:0..HK-h] -> gorde[z] -> askatuHozk -> begiratuLap[k:PR] ->
	// if (k<PK) then ( begiratuHozkHartu[kh:HR] -> if (kh>0) then if ((PK-k)<kh) then (hartu[r:1..PK-k]-> bota[r] -> askatu ->SUKALDARIA )
	//																		else (hartu[r:1..kh]-> bota[r] -> askatu ->SUKALDARIA )
	//														else								(askatu-> SUKALDARIA))
	//			else 																(askatu -> SUKALDARIA)).

	public void run() {
		try { while(true) {
			sleep((long)(Math.random()*1000));
			lapiko.hil();
			sleep((long)(Math.random()*1000));
			int h= lapiko.begiratuHozk();
			sleep((long)(Math.random()*1000));
			int z = (r.nextInt(BasatiakApp.HK - h +1 ));
			lapiko.gorde(z);
			sleep((long)(Math.random()*1000));
			lapiko.askatuHozk();
			sleep((long)(Math.random()*1000));
			int k=lapiko.begiratuLap();
			sleep((long)(Math.random()*1000));
			int kh=lapiko.begiratuHozk();
			sleep((long)(Math.random()*1000));
			if(k < BasatiakApp.Razioak){
				if(kh>0) {
					int zenbat=0;
					if((BasatiakApp.Razioak-k)<kh) {
						 zenbat= (r.nextInt(BasatiakApp.Razioak - k))+1;
					}else {
						 zenbat= (r.nextInt(kh))+1;
					}
					lapiko.hartuHozk(zenbat);
					sleep((long)(Math.random()*1000));
					lapiko.bota(zenbat);
				}	
			}
			sleep((long)(Math.random()*1000));
			lapiko.askatu();
		}
		} catch (InterruptedException e){}
	}
}