import prog.io.FileInputManager;

public class Gestore {

	public void caricadafile() {
		
		FileInputManager file = new FileInputManager ("ElencoSfide.txt");
			file = new FileInputManager ("ElencoSfide.txt");
				while (true ) {
					String line = file.readLine();
					if (line == null) {
						break;
					}
					String [] dati = line.split(";");
					if(dati[0].compareTo("P")==0) {
						Sfida sf=new Pacifica(dati[1], dati[2], dati[3], dati[4], dati[5]);
					}
					
		}
	}
	public void stampapertempo()
}
