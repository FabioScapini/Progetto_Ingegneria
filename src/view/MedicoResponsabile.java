package view;

import java.util.*;

import controller.Paziente;

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
    	return "MEDICO RESPONSABILE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Compila Scheda Intervento\n"
    			+ "2) Compila Scheda Prescrizione\n"
    			+ "3) Compila Lettera Dimissione\n"
    			+ "4) Esamina Cartella Clinica\n";

    }
    
    @Override
	public void eseguiOperazione(int val) {
		switch(val){
			case 1: //compila scheda intervento
					break;
			case 2: //compila scheda prescrizione
					break;
			case 3: //compila lettera dimissione
					break;
			case 4: esaminaCartella(new Paziente(""));
					break;
			default: //errore
		
		
		}
		
	}

}