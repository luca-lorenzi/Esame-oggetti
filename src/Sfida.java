import prog.io.*;
public abstract class Sfida {
String descrizione;
String data;
String ora;
String nomi;
String validità;
String id;
int punti;
public Sfida(String codice,String descrizione, String data, String ora, String nomi, String validità, String id, int punti) {
	this.descrizione=descrizione;
	this.data=data;
	this.ora=ora;
	this.nomi=nomi;
	this.validità=validità;
	this.punti=punti;
}
public abstract int punteggio();
}
