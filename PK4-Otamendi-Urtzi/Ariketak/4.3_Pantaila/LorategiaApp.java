package Ariketa3;

class LorategiaApp{
	public final static int MAX = 6;
	public static void main (String args[]) {
		System.out.println("LORATEGIA: return sakatu hasteko");
		try{int c = System.in.read();}catch(Exception ex){}
		System.out.println("Aurre \tAtze \tGuztira");
		Pantaila p= new Pantaila();
		Kontagailua k = new Kontagailua(p);
		Atea aurrekoa = new Atea("",k,p);
		Atea atzekoa = new Atea("\t",k,p);
		aurrekoa.start();
		atzekoa.start();
	}
}