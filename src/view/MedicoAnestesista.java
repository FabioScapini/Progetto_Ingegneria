package view;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class MedicoAnestesista extends Medico {

    /**
     * Default constructor
     */
    public MedicoAnestesista() {
    }

    public String listaPossibiliOperazioni(){
    	return "MEDICO RESPONSABILE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Compila Scheda Intervento\n"
    			+ "2) Compila Scheda Prescrizione\n"
    			+ "3) Compila Lettera Dimissione\n";
    }

}