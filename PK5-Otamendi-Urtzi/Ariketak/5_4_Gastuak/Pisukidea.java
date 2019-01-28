package Ariketa_4;

import java.util.Random;

class Pisukidea extends Thread {
	Botea botea;
	Pantaila pantaila;
	int pisukidea;
	int ikusitakoa;
	final int HARTU=1;
	final int BOTA=0;
	Random r;

	public Pisukidea(int id,Botea k, Pantaila p){
		botea = k;
		pisukidea=id;
		pantaila=p;
		ikusitakoa=0;
		r= new Random();
	}
	
	

	
	public void run() {
		int erabakia;
		try { while(true) {
			sleep((long)(Math.random()*1000));
			//PISUKIDEA =  ( erabakiZerEgin[erabakia:Erabakia] 
			erabakia=(int) (r.nextInt(2));
			
			// if (erabakia==Hartu)	then( 
			if(erabakia==HARTU){
				//hartzera-> begiratu[k:BR] ->
				sleep((long)(Math.random()*1000));
				ikusitakoa =botea.begiratu(pisukidea,"Hartzera");
				//if(k>0) then ( random[r:1..k]-> hartu[r] -> askatu ->PISUKIDEA )
				//else (							askatu ->PISUKIDEA))
				if(ikusitakoa > 0){
					int hartzeko = r.nextInt( (ikusitakoa)+1);
					sleep((long)(Math.random()*1000));
					botea.hartu(pisukidea,hartzeko);
				}
				sleep((long)(Math.random()*1000));
				botea.askatu(pisukidea);
			}
			//else(
			else{
				sleep((long)(Math.random()*1000));
				//botatzera->begiratu[k:BR] ->
				ikusitakoa =botea.begiratu(pisukidea,"Betetzera");
				//if(k<BK) then ( random[r:1..(BK-k)]-> bota[r] ->askatu ->PISUKIDEA )
				//else(										askatu ->PISUKIDEA))).
				if(ikusitakoa < botea.MAX){
					int botatzeko = r.nextInt( (botea.MAX - ikusitakoa)+1);
					sleep((long)(Math.random()*1000));
					botea.bota(pisukidea,botatzeko);
				}
				sleep((long)(Math.random()*1000));
				botea.askatu(pisukidea);
			}
			
		}
		} catch (InterruptedException e){}
	}
}