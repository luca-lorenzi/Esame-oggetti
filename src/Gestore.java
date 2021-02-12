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
					String [] data = line.split(";");
					
					
		}
	}
}
