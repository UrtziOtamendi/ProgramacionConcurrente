package Ariketa_11;

import java.util.Random;

class Irakasle extends Thread {

	Bulegoa bulego;
	final static int ENTZUN=0;
	final static int PENTSATU=1;
	final static int ERANTZUN=2;
	int egoera;
	Pantaila pantaila;


	//IRAKASLEA= (entzun-> pentsatu->erantzun->IRAKASLEA).




	public Irakasle(Bulegoa k,Pantaila pant){
		bulego = k;
		egoera=ENTZUN;
		pantaila=pant;

	}

	public void run() {

		try { while(true) {
			sleep((long)(Math.random()*1000));
			switch(egoera) {

			case ENTZUN:
				bulego.gEntzun();
				egoera=PENTSATU;
				break;

			case PENTSATU:
			pantaila.galderaPentsatzen();
			egoera=ERANTZUN;
			break;

			case ERANTZUN:
				bulego.erantzun();
				egoera=ENTZUN;
				break;



			}


		}
		} catch (InterruptedException e){}
	}
}