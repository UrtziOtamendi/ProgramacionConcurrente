package Zebrabidea;


class Oinezkoa extends Thread {
	BidezkoZebrabide zebrabide;
	Pantaila pantaila;
	int zenb;

	//OINEZKOA = (iritsi->sartu->irten->OINEZKOA).

	Oinezkoa(BidezkoZebrabide z, Pantaila p, int zenb) {

		this.zenb = zenb;
		zebrabide = z;
		pantaila = p;
	}
	public void run() {

		try {
			while(true) {
				sleep((long)(Math.random()*1000));
				zebrabide.iritsiO(zenb);
				sleep((long)(Math.random()*1000));
				zebrabide.sartuO(zenb);
				sleep((long)(Math.random()*1000));
				zebrabide.irtenO(zenb);

			}
		} catch (InterruptedException e){}
	}
}