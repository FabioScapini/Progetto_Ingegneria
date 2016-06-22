package view;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class MedicoResponsabile extends Medico {

    /**
     * Default constructor
     */
    public MedicoResponsabile() {
    }


    public String listaPossibiliOperazioni(){
    	return "OPERATORE DI SALA - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento dati operatore (Intervento)\n";
    }

}