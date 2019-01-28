package Aparkalekua;

public class Aparkalekua {


	//APARKALEKU = APARKALEKU[Max][PMax][0][K]
	//APARKALEKU[p:PR][pa:PasR][kont:SR][t:Mota]

	private int p= AparkalekuaApp.Max;
	private int pa= AparkalekuaApp.PMax;
	private int kont= 0;
	private int t= AparkalekuaApp.K;
	private Pantaila pantaila;

	public Aparkalekua(Pantaila p) {
		pantaila=p;
	}

	//kotxe[KR].iritsi -> APARKALEKU[p][pa][kont][t]
	synchronized void iritsiK(int id) throws InterruptedException {
		pantaila.iritsiK(id, p,pa,kont, t);
		notifyAll();
	}
	//moto[MR].iritsi  -> APARKALEKU[p][pa][kont][t]
	synchronized void iritsiM(int id) throws InterruptedException {
		pantaila.iritsiM(id, p,pa,kont, t);
		notifyAll();
	}

	//| when (pa==PMax && ((t==K && kont<SMax) || (t==M && kont>0)))	kotxe[KR].sartu  -> if(t==K) then APARKALEKU[p][0][kont+1][t] else if (kont==SMax) then APARKALEKU[p][0][0][K] else APARKALEKU[p][0][kont-1][t]
	synchronized void sartuK(int id) throws InterruptedException {
		while(!(pa==AparkalekuaApp.PMax && ((t==AparkalekuaApp.K && kont<AparkalekuaApp.SMax) || (t==AparkalekuaApp.M && kont>0)))) wait();
		if(t==AparkalekuaApp.K) {
			kont++;
		}else {
			if(kont==AparkalekuaApp.SMax) {
				kont=0;
				t=AparkalekuaApp.K;
			}else {
				kont--;
			}
		}
		pa=0;
		
		pantaila.sartuK(id, p,pa,kont, t);
		notifyAll();
	}

	//| when (pa>0 && ((t==M && kont<SMax) || (t==K && kont>0)))			moto[MR].sartu	 ->	if(t==M) then APARKALEKU[p][pa-1][kont+1][t] else if (kont==SMax) then APARKALEKU[p][pa-1][0][M] else APARKALEKU[p][pa-1][kont-1][t]
	synchronized void sartuM(int id) throws InterruptedException {
		while(!(pa>0 && ((t==AparkalekuaApp.M && kont<AparkalekuaApp.SMax) || (t==AparkalekuaApp.K && kont>0)))) wait();
		if(t==AparkalekuaApp.M) {
			kont++;
		}else {
			if(kont==AparkalekuaApp.SMax) {
				kont=0;
				t=AparkalekuaApp.M;
			}else {
				kont--;
			}
		}
		pa--;
		
		pantaila.sartuM(id, p,pa,kont, t);
		notifyAll();
	}

	//| 					kotxe[KR].bilatu -> 	APARKALEKU[p][PMax][kont][t]	
	synchronized void bilatuK(int id) throws InterruptedException {
		pa=AparkalekuaApp.PMax;
		pantaila.bilatuK(id, p,pa,kont, t);
		notifyAll();
	}
	//| 					moto[KR].bilatu -> 	APARKALEKU[p][pa+1][kont][t]
	synchronized void bilatuM(int id) throws InterruptedException {
		pa++;
		pantaila.bilatuM(id, p,pa,kont, t);
		notifyAll();
	}
	
	//| when (p>2)			kotxe[KR].aparkatu -> 	APARKALEKU[p-3][pa][kont][t]	

	synchronized void aparkatuK(int id) throws InterruptedException {
		while(!(p>2)) wait();
		p=p-3;
		
		pantaila.aparkatuK(id, p,pa,kont, t);
		notifyAll();
	}
	//| when (p>0)			moto[KR].aparkatu -> 	APARKALEKU[p-1][pa][kont][t]
	synchronized void aparkatuM(int id) throws InterruptedException {
		while(!(p>0)) wait();
		p=p-1;
		
		pantaila.aparkatuM(id, p,pa,kont, t);
		notifyAll();
	}

	//| 					kotxe[KR].mugitu -> 	APARKALEKU[p+3][pa][kont][t]
	synchronized void mugituK(int id) throws InterruptedException {
		p=p+3;
		pantaila.mugituK(id, p,pa,kont, t);
		notifyAll();
	}
	//| 					moto[KR].mugitu -> 	APARKALEKU[p+1][pa][kont][t]
	synchronized void mugituM(int id) throws InterruptedException {
		p++;
		pantaila.mugituM(id, p,pa,kont, t);
		notifyAll();
	}
	//| when (pa==PMax)		kotxe[KR].atera  -> APARKALEKU[p][0][kont][t]
	synchronized void ateraK(int id) throws InterruptedException {
		while(!(pa==AparkalekuaApp.PMax)) wait();
		pa=0;
		
		pantaila.ateraK(id, p,pa,kont, t);
		notifyAll();
	}
	//| when (pa>0)			moto[MR].atera	 ->	APARKALEKU[p][pa-1][kont][t]

	synchronized void ateraM(int id) throws InterruptedException {
		while(!(pa>0)) wait();
		pa--;
		
		pantaila.ateraM(id, p,pa,kont, t);
		notifyAll();
	}
	//| 					kotxe[KR].joan -> 	APARKALEKU[p][PMax][kont][t]		
	synchronized void joanK(int id) throws InterruptedException {
		pa=AparkalekuaApp.PMax;
		pantaila.joanK(id, p,pa,kont, t);
		notifyAll();
	}
	//|						moto[KR].joan -> 	APARKALEKU[p][pa+1][kont][t]
	synchronized void joanM(int id) throws InterruptedException {
		pa++;
		pantaila.joanM(id, p,pa,kont, t);
		notifyAll();
	}
}
