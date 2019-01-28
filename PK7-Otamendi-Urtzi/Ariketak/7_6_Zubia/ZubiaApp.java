package Bide_Bat_Zubia;

import java.util.Scanner;

public class ZubiaApp {

	public static void main (String args[]) {
		int maxg = 15;
		int maxu = 5;
		int zabalera = 9;
		int	zubezk=zabalera/2;
		int	zubesk=(zabalera/2)+1;
		KotxeGorria[] gorria= new KotxeGorria[maxg];
		KotxeUrdina[] urdina= new KotxeUrdina[maxu];
		Pantaila p= new Pantaila(maxg, maxu, zabalera, zubezk, zubesk);
		Zubia z=null;
		System.out.println("=================== ZUBIA ===================");
		System.out.println("");
		System.out.println("Zubi Motak");
		System.out.println("----------");
		System.out.println("1- Zubia");
		System.out.println("2- Zubi Segurua");
		System.out.println("3- Bidezko Zubia");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Aukeratu Zubi Motaren Zenbakia:");
		System.out.println("");



		Scanner scan = new Scanner(System.in);
		
		while(z==null) {
			try {
				String aukera = scan.nextLine();
				
				int a= Integer.parseInt(aukera);
				switch(a) {
				case 1:
					z=new Zubia();
					break;
					
				case 2:
					z=new ZubiSegurua();
					break;
				
				case 3:
					z=new BidezkoZubia();
					break;
				
				default:
					System.out.println("Zenbakia Desegokia!!");
					break;
				}
			}catch (NumberFormatException e) {
				System.out.println("Zenbakia Sartu!!");
			}
			
		}
		

		for (int i = 0; i<maxg; i++) {
			gorria[i] = new KotxeGorria(z,p,i);
			gorria[i].start();
		}
		for (int i = 0; i<maxu; i++) {
			urdina[i] = new KotxeUrdina(z,p,i);
			urdina[i].start();
		}
	}
}
