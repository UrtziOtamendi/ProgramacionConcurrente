package Oilategia;

class Pantaila {

	int maxA;
	int maxO;
	int maxAZ;
	int oiloak;

	public Pantaila(int oiloK, int mO, int ma) {
		maxO=mO;
		maxAZ=mO;
		maxA=ma;
		oiloak=oiloK;

		System.out.print("Josemi \t |");
		for(int i=0; i<oiloak ; i++) {
			System.out.print("Oilo["+i+"] \t");
		}
		System.out.print("| OiloBarruan \t");
		System.out.print("JartzekoZain \t");
		System.out.println("Arrautza \t");

		for(int i=0; i<(oiloak+4) ; i++) {
			System.out.print("================");
		}
		System.out.println("");

	}

	public void printValues(int o, int az, int a) {

		//OILO KOP
		System.out.print("| [");
		for(int i=0; i<(o) ; i++) {
			System.out.print("*");
		}
		for(int i=0; i<(maxO-o) ; i++) {
			System.out.print(" ");
		}
		System.out.print("] \t [");

		//ARRAUTZA JARTZEKO ZAIN
		for(int i=0; i<(az) ; i++) {
			System.out.print("*");
		}
		for(int i=0; i<(maxAZ-az) ; i++) {
			System.out.print(" ");
		}
		System.out.print("] \t [");

		//ARRAUTZA JARTZEKO ZAIN
		for(int i=0; i<(a) ; i++) {
			System.out.print("*");
		}
		for(int i=0; i<(maxA-a) ; i++) {
			System.out.print(" ");
		}
		System.out.print("]");

	}

	public void tabulate(int n) {
		for(int i=0; i<(n) ; i++) {
			System.out.print("\t\t");
		}
	}

	public void sartuOiloa(int oiloa, int o, int az, int a) {

		System.out.print("\t |");
		tabulate(oiloa);
		System.out.print("Sartu");
		tabulate(oiloak-oiloa);
		printValues(o, az , a);
		System.out.println("");

	}

	public void utzi(int oiloa, int o, int az, int a) {
		

		System.out.print("\t |");
		tabulate(oiloa);
		System.out.print("Utzi");
		tabulate(oiloak-oiloa);
		printValues(o, az , a);
		System.out.println("");
	}

	public void irtenOiloa(int oiloa, int o, int az, int a) {

		System.out.print("\t |");
		tabulate(oiloa);
		System.out.print("Irten");
		tabulate(oiloak-oiloa);
		printValues(o, az , a);
		System.out.println("");
	}
	
	public void begiratuJosemi(int o, int az, int a) {
		System.out.print("Begiratu |");
		tabulate(oiloak);
		printValues(o, az , a);
		System.out.println("");
		
	}
	
	public void joanJosemi(int o, int az, int a) {
		System.out.print("Joan \t |");
		tabulate(oiloak);
		printValues(o, az , a);
		System.out.println("");
		
	}

	public void sartuJosemi(int o, int az, int a) {
		System.out.print("Sartu \t |");
		tabulate(oiloak);
		printValues(o, az , a);
		System.out.println("");
		
	}

	public void hartu(int o, int az, int a) {
		System.out.print("Hartu \t |");
		tabulate(oiloak);
		printValues(o, az , a);
		System.out.println("");
		
	}

	public void irtenJosemi(int o, int az, int a) {
		System.out.print("Irten \t |");
		tabulate(oiloak);
		printValues(o, az , a);
		System.out.println("");
		
	}
	
	


}
