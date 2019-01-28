package LIFO_B_1;

//Urtzi Otamendi Etxabe
//2017/11/16
class LIFOApp{
	final static int max = 10;
	final static int Kideak = 15;
	final static int sartuMax= 12;

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Kideak,max);
		LIFO bote = new LIFO (pant, max, sartuMax);
		Prozesua b[] = new Prozesua[Kideak+1];
		for(int i=1; i<=Kideak;i++){
		        b[i] = new Prozesua(i,bote,pant);
		        b[i].start();
		}
		
		
	}

	
}