
public class Normale extends Sfida{
	
	String luogo;
	public Normale(String codice, String descrizione, String data, String ora, String nomi, String validità, String id) {
		super(codice, descrizione, data, ora, nomi, validità, id );
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		String[] stringaOre=ora.split(":");
		int ore=Integer.parseInt(stringaOre[0]);
		if(ore<12) {
			punti=200;
		}
		if(ore>12) {
			punti=300;
		}
		return 0;
	}

}
