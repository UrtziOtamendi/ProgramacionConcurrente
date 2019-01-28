package Aparkalekua;

public class Kotxea extends Thread {


	private Aparkalekua aparkalekua;
	private int id;

	public Kotxea(int z, Aparkalekua ap) {

		
		id=z;
		aparkalekua=ap;
	}
	public void run() {

		try {
			while(true) {
				//KOTXE = (iritsi -> sartu -> bilatu -> aparkatu -> mugitu -> atera-> joan -> KOTXE).
				sleep((long)(Math.random()*100));
				aparkalekua.iritsiK(id);

				sleep((long)(Math.random()*100));
				aparkalekua.sartuK(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.bilatuK(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.aparkatuK(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.mugituK(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.ateraK(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.joanK(id);
				
			}
		} catch (InterruptedException e){}
	}
}
