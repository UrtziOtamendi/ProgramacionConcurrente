package Ariketa_3;

import Ariketa_3.Basatia;

//Urtzi Otamendi Etxabe
//2017/12/'7
class BasatiakApp{
	final static int Razioak = 7;
	final static int Basatiak = 5;

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Basatiak,Razioak);
		Lapikoa k = new Lapikoa (Razioak,pant);
		Sukaldaria s= new Sukaldaria(k);
		s.start();
		Basatia b[] = new Basatia[Basatiak+1];
		for(int i=1; i<=Basatiak;i++){
		        b[i] = new Basatia(k,i,pant);
		        b[i].start();
		}
		
		
	}

	
}