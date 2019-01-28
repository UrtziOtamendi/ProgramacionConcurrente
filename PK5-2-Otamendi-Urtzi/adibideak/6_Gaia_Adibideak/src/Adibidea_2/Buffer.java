package Adibidea_2;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Buffer{

	private int tam;
	private Pantaila pantaila;
	private int kont;
	private int in;
	private int out;
	private char buf[];

	public Buffer(Pantaila p){
		
		tam = BufferApp.Buffer;
		pantaila = p;
		in = 0;
		kont = 0;
		out = 0;
		buf = new char[tam];
		
	}
	
	public synchronized void put(char c) throws InterruptedException { 
		
		while (!(kont<tam)) wait(); 
		
		buf[in] = c; 
		++kont; 
		in=(in+1)%tam; 
		pantaila.erakutsi(buf); 
		notify(); 
		
	}

	public synchronized char get() throws InterruptedException { 
		
		while (!(kont>0)) wait(); 
		
		char c = buf[out]; 
		buf[out]=' '; 
		--kont; 
		out=(out+1)%tam; 
		pantaila.erakutsi(buf); 
		notify(); 
		return(c);

	}

}