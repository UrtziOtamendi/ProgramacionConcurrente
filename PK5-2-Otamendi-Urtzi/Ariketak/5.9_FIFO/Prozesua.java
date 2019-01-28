package Ariketa_9;

import java.util.Random;

class Prozesua extends Thread {
	FIFO fifo;
	Pantaila pantaila;
	int prozesua;
	int non;

	public Prozesua(int id,FIFO k, Pantaila p){
		fifo = k;
		prozesua=id;
		pantaila=p;
		non = -1;
		
	}
	
	//P = (sartu[x:PKR]->atera[x]->P).

	
	public void run() {
		
		try { while(true) {
			sleep((long)(Math.random()*1000));
			non = fifo.sartu(prozesua); //Zein posiziotan sartu den ikusi
			sleep((long)(Math.random()*1000));
			fifo.atera(prozesua,non);
			
		}
		} catch (InterruptedException e){}
	}
}