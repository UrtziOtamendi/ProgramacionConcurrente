package Ariketa_4;

//Urtzi Otamendi Etxabe
//2017/12/07
class GastuakApp{
	final static int max = 10;
	final static int Kideak = 4;

	public static void main (String args[]) {
		Pantaila pant = new Pantaila(Kideak,max);
		Botea bote = new Botea (pant, max);
		Pisukidea b[] = new Pisukidea[Kideak+1];
		for(int i=1; i<=Kideak;i++){
		        b[i] = new Pisukidea(i,bote,pant);
		        b[i].start();
		}
		
		
	}

	
}