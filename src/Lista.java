

public class Lista {
nodo primo;
nodo primo1;
public class nodo{
	Sfida dato;
	nodo pros;
}
public void inserisci(Sfida sf ){
	boolean giorno=true;
    boolean mese=true;
    boolean elemento=false;
    boolean elemento2=false;
    boolean elemento3=false;
    boolean flag2=false;
    boolean flag=false;
    boolean oreflag=false;
   //questo ifserve perchè sennò la prima posizione della nostra lista rimane non dichiarata
    if(primo==null) {
    	primo=new nodo();
    	primo.dato=sf;
    	flag=true;
    } 
    //questo if serve solo per il primo inserimento (altrimenti l'elemento viene inserito 2 volte
    if(flag!=true) {
    nodo p=primo, q=null;
    String [] parti2=p.dato.data.split("-");
    String[] ore2A=p.dato.ora.split(":");
	int giorno2=Integer.parseInt(parti2[0]);
	int mese2=Integer.parseInt(parti2[1]);
	int anno2=Integer.parseInt(parti2[2]);
	int minuti2=Integer.parseInt(ore2A[1]);
	int ore2=Integer.parseInt(ore2A[0]);
	String [] parti=sf.data.split("-");
	 String[] ore1A=sf.ora.split(":");
	int giorno1=Integer.parseInt(parti[0]);
	int mese1=Integer.parseInt(parti[1]);
	int anno1=Integer.parseInt(parti[2]);
	int minuti1=Integer.parseInt(ore1A[1]);
	int ore1=Integer.parseInt(ore1A[0]);
	//inizia il ciclo che ordinerà le nostre sfide
	boolean anno=true;
    while(p!=null && anno2<=anno1  && anno==true){          	   
        //scorrimento quando hanno lo stesso anno
        if(anno2==anno1) {
        	anno=false;            	
        	//ciclo per scorrere i mesi nello stesso anno
        	while(p!=null && mese2<=mese1 && giorno==true && anno2==anno1) {                		           		
    			parti2=p.dato.data.split("-");
    			ore2A=p.dato.ora.split(":");
    			 giorno2=Integer.parseInt(parti2[0]);
    		     mese2=Integer.parseInt(parti2[1]);
    			 anno2=Integer.parseInt(parti2[2]);
    			 minuti2=Integer.parseInt(ore2A[1]);
    		     ore2=Integer.parseInt(ore2A[0]);  	
        //scorrimento quando hanno lo stesso mese mese
                if(mese2==mese1) {
                	elemento=true;
                	//ciclo per scorrere i giorni
                	while(p!=null && giorno2<=giorno1 && mese2==mese1 ) {
                		//entro se stesso giorno
                		if(giorno2==giorno1) {
                			elemento2=true;
                			while(p!=null && ore2<=ore1 && giorno2==giorno1) {
                			parti2=p.dato.data.split("-");
                			ore2A=p.dato.ora.split(":");
                			 giorno2=Integer.parseInt(parti2[0]);
                		     mese2=Integer.parseInt(parti2[1]);
                			 anno2=Integer.parseInt(parti2[2]);
                			 minuti2=Integer.parseInt(ore2A[1]);
                		     ore2=Integer.parseInt(ore2A[0]);
                		     if(ore2==ore1) {
                		    	 elemento3=true;	
                		    	 while(p!=null && minuti2<minuti1 && ore2==ore1 ) {
                		    		 oreflag=false;
                		    		 q=p;
                		    		 p=p.pros;
                		    	 if(p!=null) {
                         			parti2=p.dato.data.split("-");
                        			ore2A=p.dato.ora.split(":");
                        			 giorno2=Integer.parseInt(parti2[0]);
                        		     mese2=Integer.parseInt(parti2[1]);
                        			 anno2=Integer.parseInt(parti2[2]);
                        			 minuti2=Integer.parseInt(ore2A[1]);
                        		     ore2=Integer.parseInt(ore2A[0]);
                		    	 }
                		    	 }
                		    	 }
                		     if(elemento3==true) {
                		    	 break;
                		     }
                		     if(oreflag==false && ore2<ore1) {
                		    	 q=p;
                		    	 p=p.pros;
                		     }
                		     }
                		}
                		if(elemento2==true) {
                			break;
                		}
                		if(giorno!=false) {
        		mese=false;
               q=p;
               p=p.pros;
                		}
               //if di controllo altrimenti avro' IndexOutOfBound....
               if(p!=null) {
       			parti2=p.dato.data.split("-");
       			ore2A=p.dato.ora.split(":");
       			 giorno2=Integer.parseInt(parti2[0]);
       		     mese2=Integer.parseInt(parti2[1]);
       			 anno2=Integer.parseInt(parti2[2]);
       			 minuti2=Integer.parseInt(ore2A[1]);
       		     ore2=Integer.parseInt(ore2A[0]);
                   }           	
                }
                 }
                if(elemento==true) {
                	break;
                }
                //sposto avanti solo se i mesi non coincidevano e quindi non ho già spostato i giorni
               if(mese!=false) {	

                q=p;
                p=p.pros;
              //if di controllo altrimenti avro' IndexOutOfBound....
                if(p!=null) {
        			parti2=p.dato.data.split("-");
        			ore2A=p.dato.ora.split(":");
        			 giorno2=Integer.parseInt(parti2[0]);
        		     mese2=Integer.parseInt(parti2[1]);
        			 anno2=Integer.parseInt(parti2[2]);
        			 minuti2=Integer.parseInt(ore2A[1]);
        		     ore2=Integer.parseInt(ore2A[0]);
                    }
                } 
        	}
       
        }
      //sposto avanti solo se gli anni sono diversi e quindi non ho già preso in esame i mesi e i giorni
        if(anno!=false && anno2<anno1) {   
        q=p;
        p=p.pros;           
      //if di controllo altrimenti avro' IndexOutOfBound....
        if(p!=null) {
			parti2=p.dato.data.split("-");
			ore2A=p.dato.ora.split(":");
			 giorno2=Integer.parseInt(parti2[0]);
		     mese2=Integer.parseInt(parti2[1]);
			 anno2=Integer.parseInt(parti2[2]);
			 minuti2=Integer.parseInt(ore2A[1]);
		     ore2=Integer.parseInt(ore2A[0]);
        }
        }
        
    }
    nodo r=new nodo();
    r.dato=sf;
    r.pros=p;
    if(q==null){
        primo=r;
    }
    else
    q.pros=r;
    q=r;   	

    }     
    }
//CREAZIONE LISTA ORDINATA PER PUNTI
public void inserisciPerPunti(Sfida sf) {
	nodo p1=primo1,q1=null;
	while(p1!=null && Integer.compare(p1.dato.punti, sf.punti)<0) {
		q1=p1;
		p1=p1.pros;
	}
	nodo r1=new nodo();
	r1.dato=sf;
	r1.pros=p1;
	if(q1==null) {
		primo1=r1;
	}
	else
		q1.pros=r1;
		q1=r1;	
}
}