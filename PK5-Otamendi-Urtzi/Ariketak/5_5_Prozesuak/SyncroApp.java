package Ariketa_5;

//Urtzi Otamendi Etxabe
//2017/12/07

class SyncroApp{
	final static int Kideak = 3;

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Kideak);
		procesSync sync = new procesSync (pant, Kideak);
		Prozesuak b[] = new Prozesuak[Kideak+1];
		for(int i=1; i<=Kideak;i++){
		        b[i] = new Prozesuak(i,sync,pant);
		        b[i].start();
		}
		
		
	}

	
}