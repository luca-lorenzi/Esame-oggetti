
import java.util.Random;

import prog.io.FileInputManager;

public class Gestore extends Lista{
	
	nodo2 primo2;
	public class nodo2{
		Sfida dato;
		nodo2 pros;
	}

public void inserisci2(Sfida sf)  {
	if(sf.id==null) {
		sf.id="{"+sf.data+sf.nomi+"}";
	}
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
					String [] dati = line.split(",");
					System.out.println(dati[2]);
					if(dati[0].compareTo("P")==0) {
						Sfida sf=new Pacifica(dati[0],dati[1], dati[2], dati[3], dati[4], dati[5], dati[6]);
						sf.punteggio();
						inserisci2(sf);
					}
					if(dati[0].compareTo("N")==0) {
						Sfida sf=new Pacifica(dati[0],dati[1], dati[2], dati[3], dati[4], dati[5], dati[6]);
						sf.punteggio();
						inserisci2(sf);
						
					}
					if(dati[0].compareTo("C")==0) {
						Sfida sf=new Pacifica(dati[0],dati[1], dati[2], dati[3], dati[4],dati[5],dati[6]);
						inserisci2(sf);
					}
					
					
		}
	}
	public void StampaPerData() {		
		Lista l=new Lista();
		nodo2 r=new nodo2();
		r=primo2;
		while(r!=null) {
			l.inserisci(r.dato);
			r=r.pros;
		}
		nodo z=l.primo;
		while (z!=null) {
			System.out.println(z.dato.data+"   "+ z.dato.ora);
			
			z=z.pros;
		}
	}
	public void StampaPerPunti() {
		Lista l2=new Lista();
		nodo2 k2=new nodo2();
		k2=primo2;
		while(k2!=null) {
			l2.inserisci(k2.dato);
			k2=k2.pros;
		}
		nodo z2=l2.primo;
		while(z2!=null) {
			System.out.println(z2.dato.punti);
			z2=z2.pros;		
			}
		
	}
	public void Ricerca(String nome) {
		nodo2 k3=new nodo2();
		k3=primo2;
		while(k3.dato.nomi.compareTo(nome)!=0 && k3!=null) {
			k3=k3.pros;
			if(k3.dato.nomi.compareTo(nome)==0) {
				System.out.println(k3.dato.nomi+ k3.dato.data+ k3.dato.id);
				break;
			}
		}
	}
}