package Ariketa_10;

import java.util.Random;

class Prozesua extends Thread {
	LIFO lifo;
	Pantaila pantaila;
	int prozesua;
	int non;



	// P = (sartu[x:KR]->atera[x]->P)\{sartu[KopuruMax],atera[KopuruMax]}.



	public Prozesua(int id,LIFO k, Pantaila p){
		lifo = k;
		prozesua=id;
		pantaila=p;
		non = -1;


	}

	public void run() {

		try { while(true) {
			sleep((long)(Math.random()*1000));
			non = lifo.sartu(prozesua); //non sartu den lortu , inoiz ezingo du KopuruMax izan, ez baidu hori itzuliko
			sleep((long)(Math.random()*1000));
			lifo.atera(prozesua,non);

		}
		} catch (InterruptedException e){}
	}
}