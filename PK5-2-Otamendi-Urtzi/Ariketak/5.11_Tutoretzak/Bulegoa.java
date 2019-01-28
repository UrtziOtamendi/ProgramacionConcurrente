package Ariketa_11;




/*BULEGOA= BULEGOA[0][False][False][False],
BULEGOA[ik:KR][ig:Bool][irp:Bool][ire:Bool] =(						   	 	ik[IR].heldu    -> 	BULEGOA[ik][ig][irp][ire]
									| when(ik<KopuruMax)	  				ik[IR].sartu	->	 BULEGOA[ik+1][ig][irp][ire]
									| when(ig != True && ire!=True)			ik[IR].galdetu  ->	 BULEGOA[ik][True][irp][ire]
									| when(ig == True)						ir.entzun    	->	 BULEGOA[ik][ig][True][ire]
									| when(irp==True)						ir.erantzun	 	->     BULEGOA[ik][False][False][True]
									| when(ire==True)						ik[IR].entzun   ->     BULEGOA[ik][ig][irp][False]				
									| 										ik[IR].atera   ->     BULEGOA[ik-1][ig][irp][ire]


						).*/

class Bulegoa {
	private int ik;
	private Boolean ig;
	private Boolean irp;
	private Boolean ire;
	private Pantaila pantaila;

	public Bulegoa( Pantaila pant){
		pantaila=pant;
		ig=false;
		irp=false;
		ire=false;
		ik=0;
	}


	// when(ik<KopuruMax)	  				ik[IR].sartu	->	 BULEGOA[ik+1][ig][irp][ire]
	synchronized void sartu(int prozesu) throws InterruptedException {
		while (!(ik<2)) {

			wait();	 //when(ik<KopuruMax)
		}

		ik++;
		pantaila.sartu(prozesu, ik, ig, irp, ire);
		notifyAll();

	}

	//when(ig != True && ire!=True)			ik[IR].galdetu  ->	 BULEGOA[ik][True][irp][ire]
	synchronized void galdetu(int prozesu) throws InterruptedException {
		while (!(ig!=true && ire!=true)) {
			wait();	//  when(ig != True) -> ig true den bitartean zain
		}


		ig=true;
		pantaila.galdetu(prozesu , ik, ig, irp, ire);
		notifyAll();

	}




	//when(ig == True)						ir.entzun    	->	 BULEGOA[ik][ig][True][ire]
	synchronized void gEntzun( ) throws InterruptedException {
		while (!(ig==true)) {
			wait();	//  when(irp == True) -> irp false den bitartean zain
		}
		irp=true;
		pantaila.galderaEntzun(ik, ig, irp, ire); 
		notifyAll();

	}

	//when(irp==True)						ir.erantzun	 	->     BULEGOA[ik][False][False][True]
	synchronized void erantzun() throws InterruptedException {
		while (!(irp==true)) {

			wait();	//  when(ig == True) -> ig false den bitartean zain
		}

		ig=false;
		irp=false;
		ire=true;

		pantaila.galderaErantzun(ik, ig, irp, ire);
		notifyAll();

	}


	//| when(ire==True)						ik[IR].entzun   ->     BULEGOA[ik][ig][irp][False]	



	synchronized void eEntzun(int prozesua) throws InterruptedException {
		while (!(ire==true)) {
			wait();	//  when(irp == True) -> irp false den bitartean zain
		}
		ire=false;
		pantaila.erantzunaEntzun(prozesua, ik, ig, irp, ire); 
		notifyAll();

	}

	//										ik[IR].atera   ->     BULEGOA[ik-1][ig][irp][ire]
	synchronized void atera(int prozesua) throws InterruptedException {

		ik--;
		pantaila.atera(prozesua, ik, ig, irp, ire);  // Ez dakit nola egin irakasleak erantzutean ikaslea konturatzeko FSP-an prozesu berean egiten dut eta
		notifyAll();

	}


}