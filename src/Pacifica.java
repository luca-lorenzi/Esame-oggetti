
public class Pacifica extends Sfida{
	int punteggio;
	public Pacifica(String descrizione, String data, String ora, String nomi, String validit�) {
		super(descrizione, data, ora, nomi, validit�);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		if(validit�.compareTo("amichevole")==0) {
			this.punteggio=10;
		}
		if(validit�.compareTo("campionato")==0) {
			this.punteggio=100;
		}
		return 0;
	}

}
