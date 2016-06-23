package view;
import java.text.SimpleDateFormat;
import java.util.*;

import controller.CartellaClinica;
import controller.Paziente;
import controller.TOperatore;
import controller.TSegreteria;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class SegreteriaAccettazione extends Segreteria {

    /**
     * Default constructor
     */
    public SegreteriaAccettazione() {
    	super(TSegreteria.ACCETTAZIONE);
    }



    /**
     * 
     */

    public String listaPossibiliOperazioni(){
    	
    	
    	return "SEGRETERIA ACCETTAZIONE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Accettazione Paziente\n"
    			+ "2) Inserisci Dati Ricovero\n"
    			+ "3) Allega Esami\n"
    			+ "4) Stampa Cartella Clinica\n"
    			+ "5) Esamina Cartella Clinica\n";
    }



    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: //inserisco paziente
					Paziente paziente=new Paziente("");
					if(paziente.pazienteEsistente())
						break;
					else
						paziente.creaPaziente("", "", new SimpleDateFormat("") , "", "", false);
					break;
			case 2: //inserisco dati ricovero
					CartellaClinica ricovero=new CartellaClinica("");
					break;
			case 3: //allego esami
					break;
			case 4: //stampo cartella clinica
					break;
			case 5: esaminaCartella(new Paziente(""));
					break;
			default: //errore
		
		
		}

		
	}

}