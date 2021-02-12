
public class Pacifica extends Sfida{
	int punteggio;
	public Pacifica(String codice,String descrizione, String data, String ora, String nomi, String validità) {
		super(codice,descrizione, data, ora, nomi, validità);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		if(validità.compareTo("amichevole")==0) {
			this.punteggio=10;
		}
		if(validità.compareTo("campionato")==0) {
			this.punteggio=100;
		}
		return 0;
	}

}
