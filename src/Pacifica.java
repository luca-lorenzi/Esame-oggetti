
public class Pacifica extends Sfida{
	public Pacifica(String codice,String descrizione, String data, String ora, String nomi, String validit�, String id) {
		super(codice,descrizione, data, ora, nomi, validit�, id );
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		if(validit�.compareTo("amichevole")==0) {
			punti=10;
		}
		if(validit�.compareTo("campionato")==0) {
			punti=100;
		}
		return punti;
	}

}
