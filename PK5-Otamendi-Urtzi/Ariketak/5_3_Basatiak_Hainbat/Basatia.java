package Ariketa_3;

import java.util.Random;

class Basatia extends Thread {
	private Lapikoa lapikoa;
	private Pantaila pantaila;
	private int basatia;
	private Random r;

	public Basatia(Lapikoa k,int b, Pantaila p){
		lapikoa = k;
		basatia=b;
		pantaila=p;
		r= new Random();
	}

	//BASATIA =  ( begiratu[k:PR] ->
	// if (k>0) then ( random[r:1..k]-> hartu[r] -> askatu -> jan -> lo ->BASATIA )
	//else 											askatu -> BASATIA).

	public void run() {
		try { while(true) {
			sleep((long)(Math.random()*1000));
			int k= lapikoa.begiratu(basatia);
			if(k > 0){
				int zenb = (r.nextInt((k)  ))+1;
				lapikoa.hartu(basatia, zenb);
				sleep((long)(Math.random()*1000));
				lapikoa.askatu();
				sleep((long)(Math.random()*1000));
				pantaila.jan(basatia);
				sleep((long)(Math.random()*1000));
				pantaila.lo(basatia);

			}
			else {
				sleep((long)(Math.random()*1000));
				lapikoa.askatu();
			}

			

		}
		} catch (InterruptedException e){}
	}
}