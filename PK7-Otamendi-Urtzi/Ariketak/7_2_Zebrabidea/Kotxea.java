package Zebrabidea;


class Kotxea extends Thread {
	BidezkoZebrabide zebrabide;
	Pantaila pantaila;
	int zenb;


	//KOTXEA = (iritsi->sartu->irten->KOTXEA).

	Kotxea(BidezkoZebrabide z, Pantaila p, int zenb) {

		this.zenb = zenb;
		zebrabide = z;
		pantaila = p;
	}
	public void run() {

		try {
			while(true) {
				sleep((long)(Math.random()*1000));
				zebrabide.iritsiK(zenb);
				sleep((long)(Math.random()*1000));
				zebrabide.sartuK(zenb);
				sleep((long)(Math.random()*1000));
				zebrabide.irtenK(zenb);

			}
		} catch (InterruptedException e){}
	}
}