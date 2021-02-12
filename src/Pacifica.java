
public class Pacifica extends Sfida{
	private static int punti;
	int punt;
	public Pacifica(String codice,String descrizione, String data, String ora, String nomi, String validità, String id) {
		super(codice,descrizione, data, ora, nomi, validità, id, punti);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		if(validità.compareTo("amichevole")==0) {
			this.punti=10;
		}
		if(validità.compareTo("campionato")==0) {
			this.punti=100;
		}
		return 0;
	}

}
