import prog.io.*;
public abstract class Sfida {
	String codice;
String descrizione;
String data;
String ora;
String nomi;
String validità;
String id;
public int punti;

public Sfida(String codice,String descrizione, String data, String ora, String nomi, String validità, String id ) {
	this.descrizione=descrizione;
	this.data=data;
	this.ora=ora;
	this.nomi=nomi;
	this.validità=validità;
}
public abstract int punteggio();
}
