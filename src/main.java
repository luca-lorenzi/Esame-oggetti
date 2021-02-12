
public class main {
public static void main(String args[]) {
	Gestore G=new Gestore();
	Sfida sf1=new Pacifica("P","LOL", "11-02-2020", "11:30", "paolo", "amichevole");
	Sfida sf2=new Pacifica("N","LOL", "11-02-2020", "11:10", "paolo", "amichevole");
	Sfida sf3=new Pacifica("N","LOL", "11-02-2020", "11:09", "paolo", "amichevole");
	Sfida sf4=new Pacifica("N","LOL", "11-02-2020", "10:30", "paolo", "amichevole");
	Sfida sf5=new Pacifica("N","LOL", "11-02-2020", "12:10", "paolo", "amichevole");
	G.inserisci2(sf1);
	G.inserisci2(sf2);
	G.inserisci2(sf2);
	G.inserisci2(sf3);
	G.inserisci2(sf4);
	G.inserisci2(sf5);
	G.StampaPerPunti();
	
	//super(codice,descrizione, data, ora, nomi, validità);
}
}
