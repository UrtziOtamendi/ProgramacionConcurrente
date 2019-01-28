package Aparkalekua;

public class Motoa extends Thread{



	private Aparkalekua aparkalekua;
	private int id;

	public Motoa(int z, Aparkalekua ap) {

		
		id=z;
		aparkalekua=ap;
	}
	public void run() {

		try {
			while(true) {
				//MOTO  =(iritsi -> sartu -> bilatu -> aparkatu -> mugitu -> atera-> joan -> MOTO).
				sleep((long)(Math.random()*1000));
				aparkalekua.iritsiM(id);

				sleep((long)(Math.random()*1000));
				aparkalekua.sartuM(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.bilatuM(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.aparkatuM(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.mugituM(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.ateraM(id);
				sleep((long)(Math.random()*1000));
				aparkalekua.joanM(id);
				
			}
		} catch (InterruptedException e){}
	}
}