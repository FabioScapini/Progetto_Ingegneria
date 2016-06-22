package view;

import java.util.*;

import controller.Paziente;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class OperatoreSala extends Operatore {

    /**
     * Default constructor
     */
    public OperatoreSala() {
    }


    /**
     * @param paziente
     */
    public void stampaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * 
     */
    public String listaPossibiliOperazioni(){
    	return "OPERATORE DI SALA - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento dati operatore (Intervento)\n";
    }

}