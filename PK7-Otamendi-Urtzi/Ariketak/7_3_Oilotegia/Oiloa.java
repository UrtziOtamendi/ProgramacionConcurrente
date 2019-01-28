package Oilategia;


class Oiloa extends Thread {
		Oilotegia oilotegia;
		int zenb;
		

		//OILOA = (sartu->utzi->irten->OILOA).

		public Oiloa(Oilotegia z, int zenbakia) {

			zenb= zenbakia;
			oilotegia = z;
		}
		public void run() {

			try {
				while(true) {
					sleep((long)(Math.random()*1000));
					oilotegia.sartuOiloa(zenb);
					sleep((long)(Math.random()*1000));
					oilotegia.utzi(zenb);
					sleep((long)(Math.random()*1000));
					oilotegia.irtenOiloa(zenb);
				}
			} catch (InterruptedException e){}
		}
	}