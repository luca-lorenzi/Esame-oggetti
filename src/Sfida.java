import prog.io.*;
public abstract class Sfida {
String descrizione;
String data;
String ora;
String nomi;
String validit�;
int punti;
public Sfida(String codice,String descrizione, String data, String ora, String nomi, String validit�) {
	this.descrizione=descrizione;
	this.data=data;
	this.ora=ora;
	this.nomi=nomi;
	this.validit�=validit�;
}
public abstract int punteggio();
}
