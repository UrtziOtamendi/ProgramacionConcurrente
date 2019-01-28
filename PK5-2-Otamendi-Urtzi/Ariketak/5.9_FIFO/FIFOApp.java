package Ariketa_9;

//Urtzi Otamendi Etxabe
//2017/11/16
class FIFOApp{
	
	
	final static int max = 10; //const KopuruMax = 10
	final static int Kideak = 12; //const ProzesuMax = 6

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Kideak,max);
		FIFO bote = new FIFO (pant, max);
		Prozesua b[] = new Prozesua[Kideak+1];
		for(int i=1; i<=Kideak;i++){ //range PR = 0..(ProzesuMax)
		        b[i] = new Prozesua(i,bote,pant);
		        b[i].start();
		}
		
		
	}

	
}