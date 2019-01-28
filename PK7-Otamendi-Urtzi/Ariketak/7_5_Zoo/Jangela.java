package Zoo;


class Jangela  {



	//JANGELA = JANGELA[0][0][0][True],
	//JANGELA[p:PR][k:LR][jz:LR][a:Bool]

	
	private int p=0;
	private int k=0;
	private int jz=0;
	private boolean a=true;
	private Pantaila pantaila;

	public Jangela(Pantaila p) {
		
		pantaila=p;
		
	}

	//(when (a==False )		l[LzR].sartu	-> if(p==(jz+1)) then JANGELA[p][k+1][jz+1][True] else JANGELA[p][k+1][jz+1][a] 
	synchronized void sartu(int z) throws InterruptedException {
		while (!(a==false)) wait();
		if(p==(jz+1)) {
			a=true;
		}
		k++;
		jz++;
		pantaila.sartuLehoi(z,p,k,jz,a);
		notifyAll();
	}
	
	//|when (p>0)			l[LzR].jan		-> JANGELA[p-1][k][jz-1][a]
	synchronized void jan(int z) throws InterruptedException {
		while (!(p>0)) wait();
		
		p--;
		jz--;
		pantaila.jan(z,p,k,jz,a);
		notifyAll();
	}
	//|						l[LzR].irten	-> JANGELA[p][k-1][jz][a]
	synchronized void irten(int z) throws InterruptedException {
		
		
		k--;
		pantaila.irtenLehoi(z,p,k,jz,a);
		notifyAll();
	}
	//|when (k==0 && p==0)	z.sartu			-> JANGELA[p][k][jz][True]
	synchronized void sartu() throws InterruptedException {
		while (!(p==0 && k==0)) wait();
		
		a=true;
		pantaila.sartu(p,k,jz,a);
		notifyAll();
	}
	//|						z.bete			-> JANGELA[Max][k][jz][a]
	synchronized void bete() throws InterruptedException {
		
		
		p=ZooApp.Max;
		pantaila.bete(p,k,jz,a);
		notifyAll();
	}
	//|						z.irten			-> JANGELA[p][k][jz][False]
	synchronized void irten() throws InterruptedException {
		
		
		a=false;
		pantaila.irten(p,k,jz,a);
		notifyAll();
	}
	
	
	
}