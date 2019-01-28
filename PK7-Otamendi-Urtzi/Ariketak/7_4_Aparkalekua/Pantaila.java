package Aparkalekua;


class Pantaila {
	int maxZain, maxo, maxk, maxim;
	
	String tabOinezko;

	public Pantaila() {
		
		goiburukoa();
	}

	synchronized public void pantailaratu (int p, int pa, int kont, int t){
		System.out.print(p+" \t");
		System.out.print(pa+"  \t");
		System.out.print(kont+"   \t");
		if(t==AparkalekuaApp.M) {

			System.out.print("Moto\t");
		}else {

			System.out.print("Kotxe\t");
		}
		
	}



	synchronized public void iritsiK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Iritsi");
	}
	synchronized public void iritsiM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Iritsi");
	}

	synchronized public void sartuK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Sartu");
	}

	synchronized public void sartuM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Sartu");
	}
	
	synchronized public void bilatuK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Bilatu");
	}

	synchronized public void bilatuM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Bilatu");
	}


	synchronized public void aparkatuK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Aparkatu");
	}

	synchronized public void aparkatuM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Aparkatu");
	}

	synchronized public void mugituK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Mugitu");
	}

	synchronized public void mugituM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Mugitu");
	}
	
	synchronized public void ateraK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Atera");
	}

	
	synchronized public void ateraM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Atera");
	}
	
	synchronized public void joanK(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id);
		System.out.println("Joan");
	}
	
	synchronized public void joanM(int id, int p, int pa, int kont, int t) throws InterruptedException{
		
		pantailaratu(p,pa,kont,t);
		System.out.print("|");
		hutsuneak(id+AparkalekuaApp.KMax);
		System.out.println("Joan");
	}




	synchronized public void hutsuneak(int id) throws InterruptedException{
		
		for(int i=0 ; i<id;i++) {
			System.out.print("\t");
		}
	}


	synchronized public void goiburukoa() {
		System.out.print("P \t");
		System.out.print("Pa \t");
		System.out.print("Kont \t");
		System.out.print("T \t");
		System.out.print("|");
		for (int i = 0; i<AparkalekuaApp.KMax ; i++) {
			System.out.print("K["+i+"]\t");
		}
		System.out.print("|");
		for (int i = 0; i<AparkalekuaApp.MMax ; i++) {
			System.out.print("M["+i+"]\t");
		}
		System.out.println("");
	}
}

