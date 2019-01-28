package Adibidea_1;


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
    public void run() {
      try {
    	  while (true) {
    			pant.idatzi(zenb, "pentsatzen"); 
    			sleep((long)(Math.random()*1000));
    			pant.idatzi(zenb, "gose");
    			sleep((long)(Math.random()*1000));
    			eskubikoa.get();
    			pant.idatzi(zenb, "eskub.hartu du"); 
    			sleep((long)(Math.random()*1000));
    			ezkerrekoa.get();
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
      } catch (InterruptedException e){}
    }
}