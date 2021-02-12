
public class Competizione extends Sfida{

int Pgioco;

	public Competizione(String codice, String descrizione, String data, String ora, String nomi, String validità, String id, int Pgioco) {
		super(codice, descrizione, data, ora, nomi, validità, id);
		// TODO Auto-generated constructor stub
		this.Pgioco=Pgioco;
	}

	@Override
	public int punteggio() {
		punti=(this.Pgioco*500)+1000;
		return punti;
	}

}
