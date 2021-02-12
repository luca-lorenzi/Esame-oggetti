
public class Pacifica extends Sfida{
	public Pacifica(String codice,String descrizione, String data, String ora, String nomi, String validità, String id) {
		super(codice,descrizione, data, ora, nomi, validità, id );
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		if(validità.compareTo("amichevole")==0) {
			punti=10;
		}
		if(validità.compareTo("campionato")==0) {
			punti=100;
		}
		return punti;
	}

}
