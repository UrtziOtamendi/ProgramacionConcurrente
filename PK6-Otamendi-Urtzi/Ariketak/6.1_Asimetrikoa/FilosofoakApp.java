package Ariketa_1;



public class FilosofoakApp {

	final static int max = 4;


	//URTZI OTAMENDI ETXABE
	//2017/11/18


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pantaila pant = new Pantaila(max);
			
		Sardeska sar[]= new Sardeska[max];
		Filosofoa fil[]= new Filosofoa[max];
		
		for (int i=0; i<max; ++i)
			sar[i] = new Sardeska(i,pant);
		for (int i=0; i<max; ++i){
			fil[i] = new Filosofoa( sar[(i-1+max)%max],sar[i], pant, i);
			fil[i].start();
		}

	}
}
