package Ariketa_12;

import java.util.Random;


class AGENDA {

	private Pantaila pantaila;
	private Random r;
	private int[] zenbakiak;
	public int i;
	public int k;

	//i Zenbaki kopurua
	//k zenbat langile lanean
	//AGENDA= AGENDA[Max],

	public AGENDA( Pantaila pant){
		pantaila=pant;
		k=0;
		i=AGENDAApp.max;
		r= new Random();
		zenbakiak = new int[AGENDAApp.max];

		for(int i=0; i<AGENDAApp.max ; i ++){
			zenbakiak[i]= (r.nextInt((100  )));
		}

		pantaila.margotuZenbakiak(0, zenbakiak);
	}

	//(when(i>1)	i[LR].hartu	->	print[i-1][i-2] -> AGENDA[i-2][k+1]
	synchronized int[] hartu(int prozesu) throws InterruptedException {	
		while (!(i>1)) wait();
		int[] zenb = new int[2];

		zenb[0]=zenbakiak[i-1];
		zenb[1]=zenbakiak[i-2];
		zenbakiak[i-1]=-1;
		zenbakiak[i-2]=-1;
		i=i-2;
		k++;
		pantaila.hartu(prozesu, zenb,zenbakiak);
		notify();
		return zenb;
	
}

//|when(k>0)  i[LR].sartu	->	print[i]	->
//if(k==1 && i==0) then (bukatu -> STOP)
//				else AGENDA[i+1][k-1]
//).

synchronized boolean sartu(int prozesu, int a) throws InterruptedException {

	while (!(k>0)) wait();
	if((k==1) && (i==0) ){
		zenbakiak[i]=a;
		i++;
		k--;
		pantaila.sartu(prozesu, a, zenbakiak);
		pantaila.amaitu(a);
		notify();
		return false;
	}else{

		zenbakiak[i]=a;
		i++;
		k--;
		pantaila.sartu(prozesu, a, zenbakiak);
		notify();
		return true;
	}


}



}