package Ariketa_2;


class Filosofoa extends Thread {




	Sardeska eskubikoa, ezkerrekoa;
	Maiordomo maiordomo;
	Pantaila pant;
	int zenb;
	Filosofoa(Sardeska ezk, Sardeska esk, Pantaila p, int zenb, Maiordomo m) {
		this.zenb = zenb;
		eskubikoa = esk;
		ezkerrekoa= ezk;
		pant = p;
		maiordomo=m;
	}
	
//	FIL = (eseri->eskubi.get->ezker.get
//			->jan->eskubi.put->ezker.put
//			->altxatu->FIL).
//			
	public void run() {
		try {
			while (true) {
				pant.idatzi(zenb, "pentsatzen",1); 
				sleep((long)(Math.random()*1000));
				pant.idatzi(zenb, "gose",0);
				sleep((long)(Math.random()*1000));

				maiordomo.eseri(zenb);
				sleep((long)(Math.random()*1000));

				eskubikoa.get();
				pant.idatzi(zenb, "eskub.hartu du",1); 
				sleep((long)(Math.random()*1000));
				ezkerrekoa.get();
				pant.idatzi(zenb, "ezker.hartu du",1);
				sleep((long)(Math.random()*1000));
				pant.idatzi(zenb, "jaten",0);
				sleep((long)(Math.random()*1000));
				eskubikoa.put();
				pant.idatzi(zenb, "eskub.utzi du",1); 
				sleep((long)(Math.random()*1000));
				ezkerrekoa.put();
				pant.idatzi(zenb, "ezker.utzi du",1);
				sleep((long)(Math.random()*1000));

				maiordomo.altxatu(zenb);
			}
		} catch (InterruptedException e){}
	}
}