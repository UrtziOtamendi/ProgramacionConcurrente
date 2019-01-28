package Ariketa_3;


class Filosofoa extends Thread {




	Sardeska eskubikoa, ezkerrekoa;
	Pantaila pant;
	int zenb;
	
	Filosofoa(Sardeska ezk, Sardeska esk, Pantaila p, int zenb) {
		this.zenb = zenb;
		eskubikoa = esk;
		ezkerrekoa= ezk;
		pant = p;
	}
	
//	FIL = (eseri->eskubi.get->ezker.get
//			->jan->eskubi.put->ezker.put
//			->altxatu->FIL).
	
	
	public void run() {
		try {
			while (true) {
				pant.idatzi(zenb, "pentsatzen"); 
				sleep((long)(Math.random()*1000));
				pant.idatzi(zenb, "gose");
				sleep((long)(Math.random()*1000));
				
				if(eskubikoa.get()) {
					pant.idatzi(zenb, "eskub.hartu du"); 
					sleep((long)(Math.random()*1000));
					if( ezkerrekoa.get()) {
						pant.idatzi(zenb, "ezker.hartu du");
						sleep((long)(Math.random()*1000));
						pant.idatzi(zenb, "jaten");
						sleep((long)(Math.random()*1000));
						eskubikoa.put();
						pant.idatzi(zenb, "eskub.utzi du"); 
						sleep((long)(Math.random()*1000));
						ezkerrekoa.put();
						pant.idatzi(zenb, "ezker.utzi du");
						sleep((long)(Math.random()*1000));
					}
					else {

						pant.idatzi(zenb, "ezker.ez du hartu"); 
						sleep((long)(Math.random()*1000));
						pant.idatzi(zenb, "eskub.utzi du"); 
						sleep((long)(Math.random()*1000));
						ezkerrekoa.put();
					}
					
				}else {
					pant.idatzi(zenb, "eskubi.ez du hartu"); 
					sleep((long)(Math.random()*1000));
					pant.idatzi(zenb, "ezker.ez du hartu"); 
					sleep((long)(Math.random()*1000));
				}
				
			}
		} catch (InterruptedException e){}
	}
}