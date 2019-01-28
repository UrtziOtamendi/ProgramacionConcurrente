package Ariketa_1;


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
    
   
/*    FIL(I=0) = (
			when (I%2==0) 	eseri ->ezker.get->eskubi.get->jan
									 ->ezker.put->eskubi.put->altxatu->FIL
			|when (I%2==1) 	eseri ->eskubi.get->ezker.get->jan
									 ->ezker.put->eskubi.put->altxatu->FIL ).*/
    
    public void run() {
      try {
    	  while (true) {
    			pant.idatzi(zenb, "pentsatzen"); 
    			sleep((long)(Math.random()*1000));
    			pant.idatzi(zenb, "gose");
    			sleep((long)(Math.random()*1000));
    			
    			
    			if ((zenb % 2) == 0) {
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
    			else {
    				ezkerrekoa.get();
    				pant.idatzi(zenb, "ezker.hartu du"); 
        			sleep((long)(Math.random()*1000));
        			eskubikoa.get();
        			pant.idatzi(zenb, "eskub.hartu du");
        			sleep((long)(Math.random()*1000));
        			pant.idatzi(zenb, "jaten");
        			sleep((long)(Math.random()*1000));
        			ezkerrekoa.put();
        			pant.idatzi(zenb, "ezker.utzi du"); 
        			sleep((long)(Math.random()*1000));
        			eskubikoa.put();
        			pant.idatzi(zenb, "eskub.utzi du");
        			sleep((long)(Math.random()*1000));
    			}
    		}
      } catch (InterruptedException e){}
    }
}