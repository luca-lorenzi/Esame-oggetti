
public class Competizione extends Sfida{

	private static int punti;

	public Competizione(String codice, String descrizione, String data, String ora, String nomi, String validità, String id) {
		super(codice, descrizione, data, ora, nomi, validità, id, punti);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
