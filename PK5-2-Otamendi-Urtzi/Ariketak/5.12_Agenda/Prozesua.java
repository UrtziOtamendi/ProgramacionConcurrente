package Ariketa_12;

import java.util.Random;

class Prozesua extends Thread {
	private AGENDA agenda;
	private Pantaila pantaila;
	private int prozesua;
	public int[] zenbakiak;
	private int egoera;
	private int handiena;


	public Prozesua(int id,AGENDA k, Pantaila p){
		agenda = k;
		prozesua=id;
		pantaila=p;
		zenbakiak = new int[2];
		handiena=0;

	}

	public void run() {

		//Prozesuen ekintza
		//P = (hartu->komparaketa->sartu->P).

		try { while(true) {
			sleep((long)(Math.random()*1000));
			zenbakiak= agenda.hartu(prozesua);	
			sleep((long)(Math.random()*1000));
			if(zenbakiak[0]>zenbakiak[1]){
				handiena= zenbakiak[0];
			}else{
				handiena = zenbakiak[1];
				
			}
			sleep((long)(Math.random()*1000));
			agenda.sartu(prozesua,handiena);
		}
		
		} catch (InterruptedException e){}
	}
}