package Ariketa_11;

import java.util.Random;

class Ikasle extends Thread {
	Bulegoa bulego;
	Pantaila pantaila;
	int ikasle;
	final static int HELDU=0;
	final static int SARTU=1;
	final static int GALDETU=2;
	final static int ENTZUN=3;
	final static int ATERA=4;
	int egoera;


	//IKASLEA = (heldu -> sartu->galdetu->entzun->atera->IKASLEA).



	public Ikasle(int id,Bulegoa k, Pantaila p){
		bulego = k;
		ikasle=id;
		pantaila=p;
		egoera=HELDU;

	}

	public void run() {

		try { while(true) {
			sleep((long)(Math.random()*1000));
			switch(egoera) {

			case HELDU:

				pantaila.heldu(ikasle);
				egoera=SARTU;
				break;

			case SARTU:

				bulego.sartu(ikasle);
				egoera=GALDETU;
				break;

			case GALDETU:

				bulego.galdetu(ikasle);
				egoera=ENTZUN;
				break;

			case ENTZUN:

				bulego.eEntzun(ikasle);
				egoera=ATERA;
				break;

			case ATERA:

				bulego.atera(ikasle);
				egoera=HELDU;
				break;




			}
			if(egoera==HELDU){

				
			}
			else if(egoera==SARTU){

				
			}
			else if(egoera==GALDETU){

				
			}
			else if(egoera==ATERA){

				
			}

		}
		} catch (InterruptedException e){}
	}
}