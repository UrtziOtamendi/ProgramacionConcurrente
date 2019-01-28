package Ariketa_11;

//Urtzi Otamendi Etxabe
//2017/11/16
class Tutoretzakapp{
	final static int Kideak = 5;

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Kideak);
		Bulegoa bulego = new Bulegoa (pant);
		Irakasle ir = new Irakasle (bulego,pant);
		ir.start();
		Ikasle b[] = new Ikasle[Kideak+1];
		for(int i=1; i<=Kideak;i++){
		        b[i] = new Ikasle(i,bulego,pant);
		        b[i].start();
		}
		
		
	}

	
}