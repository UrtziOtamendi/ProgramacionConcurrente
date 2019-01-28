package Zoo;


class Lehoia extends Thread {
		Jangela jangela;
		int zenb;
		

		

		public Lehoia(Jangela z, int zenbakia) {

			zenb= zenbakia;
			jangela = z;
		}
		//LEHOIA = ( sartu-> jan -> irten -> LEHOIA).
		public void run() {

			try {
				
				while(true) {
					sleep((long)(Math.random()*1000));
					jangela.sartu(zenb);
					sleep((long)(Math.random()*1000));
					jangela.jan(zenb);
					sleep((long)(Math.random()*1000));
					jangela.irten(zenb);
				}
			} catch (InterruptedException e){}
		}
	}