
public class Normale extends Sfida{
	private static int punti;
	
	String luogo;
	public Normale(String codice, String descrizione, String data, String ora, String nomi, String validità, String id) {
		super(codice, descrizione, data, ora, nomi, validità, id, punti);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int punteggio() {
		String[] stringaOre=ora.split(":");
		int ore=Integer.parseInt(stringaOre[0]);
		if(ore<12) {
			this.punti=200;
		}
		if(ore>12) {
			this.punti=300;
		}
		return 0;
	}

}
