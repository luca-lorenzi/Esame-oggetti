
public class main {
public static void main(String args[]) {
	Gestore G=new Gestore();
	Sfida sf1=new Pacifica("P","LOL", "11-02-2020", "11:40", "paoluccio", "amichevole", null);
	Sfida sf2=new Pacifica("N","LOL", "11-02-2020", "11:10", "paolo", "amichevole", null);
	Sfida sf3=new Pacifica("N","LOL", "11-02-2020", "13:09", "paolo", "amichevole", null);
	Sfida sf4=new Pacifica("N","LOL", "11-02-2020", "10:50", "paolo", "amichevole",null);
	Sfida sf5=new Pacifica("N","LOL", "11-02-2020", "12:10", "paolo", "amichevole",null);
	G.inserisci2(sf5);	
	G.inserisci2(sf1);
	G.inserisci2(sf3);
	G.inserisci2(sf2);
	G.caricadafile();
	G.inserisci2(sf4);
	G.StampaPerData();
	G.StampaPerPunti();
	G.Ricerca("paoluccio");
	//super(codice,descrizione, data, ora, nomi, validità);
}
}
