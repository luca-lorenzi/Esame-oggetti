
import prog.io.FileInputManager;

public class Gestore extends Lista{
	
	nodo2 primo2;
	public class nodo2{
		Sfida dato;
		nodo2 pros;
	}

public void inserisci2(Sfida sf) {
	nodo2 t=new nodo2();
	t.dato=sf;
	t.pros=primo2;
	primo2=t;
}

	public void caricadafile() {
		
		FileInputManager file = new FileInputManager ("ElencoSfide.txt");
			file = new FileInputManager ("ElencoSfide.txt");
				while (true ) {
					String line = file.readLine();
					if (line == null) {
						break;
					}
					String [] dati = line.split(";");
					if(dati[0].compareTo("P")==0) {
						Sfida sf=new Pacifica(dati[0],dati[1], dati[2], dati[3], dati[4], dati[5]);
						inserisci(sf);
					}
					if(dati[0].compareTo("N")==0) {
						Sfida sf=new Pacifica(dati[0],dati[1], dati[2], dati[3], dati[4], dati[5]);
						inserisci(sf);
					}
					if(dati[0].compareTo("C")==0) {
						Sfida sf=new Pacifica(dati[0],dati[1], dati[2], dati[3], dati[4], dati[5]);
						inserisci(sf);
					}
					
					
		}
	}
	public void StampaPerPunti() {		
		Lista l=new Lista();
		nodo2 r=new nodo2();
		r=primo2;
		while(r!=null) {
			l.inserisci(r.dato);
			r=r.pros;
		}
		nodo z=l.primo;
		while (z!=null) {
			System.out.println(z.dato.data+ z.dato.ora);
			
			z=z.pros;
		}
	}
	public void Ricerca() {
		
	}
}