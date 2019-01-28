package Adibidea_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

class SemaforoBuffer{

	private int tam;
	private Pantaila pantaila;
	private int kont;
	private int in;
	private int out;
	private char buf[];

	public Semaforo okupatuak; // item kopurua zenbatzen du
	public Semaforo libreak; // toki libre kopurua zenbatzen du

	 SemaforoBuffer(int tam, Pantaila p) {
		this.tam = tam;
		buf = new char[tam];
		for (int i=0; i<tam ; i++) buf[i]= ' ';
		okupatuak = new Semaforo(0);
		libreak = new Semaforo(tam);
		pantaila = p;
	}

	public  void put(char c)
			throws InterruptedException {
		libreak.behera();
		synchronized(this){

			buf[in]=c; ++kont; in=(in+1)%tam;
			pantaila.erakutsi(buf);
		}
		okupatuak.gora();
	}
	public  char get()
			throws InterruptedException {
		okupatuak.behera();
		char c;
		synchronized (this){
			 c=buf[out];
			buf[out]=' '; --kont; out=(out+1)%tam;
			pantaila.erakutsi(buf);
			
		}
		
		libreak.gora();
		return (c);
	}

}