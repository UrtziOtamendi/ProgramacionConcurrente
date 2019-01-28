package Adibidea_1;




public class SemaforoDemo {

	final static int MAX = 4;

	public static void main(String[] args) {
		String tab="";
		Pantaila p= new Pantaila();
		Semaforo sem = new Semaforo(1,p);	
		MutexLoop l[] = new MutexLoop[MAX+1];
		for(int i=1; i<=MAX;i++){
			l[i] = new MutexLoop(i,sem,2,tab,p);
			l[i].start();
			tab = tab +"\t";

		}
	}
}
