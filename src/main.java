
public class main {
public static void main(String args[]) {
	Gestore G=new Gestore();
	//carico da file
	G.caricadafile();
	//stampo per data
	System.out.println("STAMPA PER DATA");
	G.StampaPerData();
	//stampo per punti
	System.out.println("STAMPA PER PUNTI");
	G.StampaPerPunti();
	//creo nuove sfide
	Sfida sf1=new Pacifica("P","LOL", "11-02-2020", "11:40", "paoluccio","amichevole", null );
	sf1.punteggio();
	Sfida sf2=new Pacifica("N","LOL", "11-02-2020", "11:10", "paolo","amichevole", null);
	sf2.punteggio();
	Sfida sf3=new Pacifica("N","LOL", "11-02-2020", "13:09", "paolo","amichevole", null);
	sf3.punteggio();
	Sfida sf4=new Competizione("N","LOL", "11-02-2020", "10:50", "paolo","campionato",null,10);
	sf4.punteggio();
	Sfida sf5=new Pacifica("N","LOL", "11-02-2020", "12:10", "paolo","campionato",null );
	sf5.punteggio();
	//inserisco le nuove sfide
	G.inserisci2(sf5);	
	G.inserisci2(sf1);
	G.inserisci2(sf3);
	G.inserisci2(sf2);	
	G.inserisci2(sf4);
	//stampo per data
	System.out.println("STAMPA PER DATA");
	G.StampaPerData();
	//stampo per punti
	System.out.println("STAMPA PER PUNTI");
	G.StampaPerPunti();
	//ricerco la sfida
	G.Ricerca("paoluccio");
	//super(codice,descrizione, data, ora, nomi, validità);
}
}
