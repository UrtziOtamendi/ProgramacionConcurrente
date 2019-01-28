package Ariketa_5;

import java.util.Random;


class Prozesuak extends Thread {
	private procesSync sync;
	private Pantaila pantaila;
	private int id;
	private int ekintza;

	public Prozesuak(int i,procesSync k, Pantaila p){
		id= i;
		sync= k;
		pantaila=p;
		ekintza=-1;

	}

	//PROZESU = ( iritsi -> egin -> irten -> PROZESU ).
	public void run() {

		try { while(true) {
			sleep((long)(Math.random()*1000));
			sync.iritsi(id);
			sleep((long)(Math.random()*1000));
			sync.egin(id);
			sleep((long)(Math.random()*1000));
			sync.irten(id);

		}
		} catch (InterruptedException e){}
	}
}