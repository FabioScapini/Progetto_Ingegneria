package view;
import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class SegreteriaAccettazione extends Segreteria {

    /**
     * Default constructor
     */
    public SegreteriaAccettazione() {
    }



    /**
     * 
     */
    public String listaPossibiliOperazioni(){
    	
    	
    	return "SEGRETERIA ACCETTAZIONE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Accettazione Paziente\n"
    			+ "2) Inserisci Dati Ricovero\n"
    			+ "3) Allega Esami\n"
    			+ "4) Stampa Cartella Clinica\n";
    }

}