package Ariketa_12;

//Urtzi Otamendi Etxabe
//2017/11/16
class AGENDAApp{
	final static int max = 10;
	final static int Prozeusak = 3;

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Prozeusak);
		AGENDA agenda = new AGENDA (pant);
		Prozesua b[] = new Prozesua[Prozeusak+1];
		for(int i=1; i<=Prozeusak;i++){
		        b[i] = new Prozesua(i,agenda,pant);
		        b[i].start();
		}
		
		
	}

	
}