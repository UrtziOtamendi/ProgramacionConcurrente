package Oilategia;


class Josemi extends Thread {
	Oilotegia oilotegia;
	

	


	Josemi(Oilotegia z) {

		
		oilotegia = z;
	}
	public void run() {

		try {
			while(true) {
				//JOSEMI = (begiratu[a:AR] -> if(a>1) then ( sartu-> hartu->irten->JOSEMI) else (  joan->JOSEMI) ).
				sleep((long)(Math.random()*1000));
				int  a= oilotegia.begiratuJosemi();
				if(a>1) {
					sleep((long)(Math.random()*1000));
					oilotegia.sartuJosemi();
					sleep((long)(Math.random()*1000));
					oilotegia.hartu();
					sleep((long)(Math.random()*1000));
					oilotegia.irtenJosemi();
				}else {
					sleep((long)(Math.random()*1000));
					oilotegia.joanJosemi();
				}
				
				
			}
		} catch (InterruptedException e){}
	}
}