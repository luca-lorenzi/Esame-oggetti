import prog.io.*;
public abstract class Sfida {
	String codice;
String descrizione;
String data;
String ora;
String nomi;
String validit�;
String id;
public int punti;

public Sfida(String codice,String descrizione, String data, String ora, String nomi, String validit�, String id ) {
	this.descrizione=descrizione;
	this.data=data;
	this.ora=ora;
	this.nomi=nomi;
	this.validit�=validit�;
}
public abstract int punteggio();
}
