package view;

import java.util.*;

import controller.Paziente;
import controller.TOperatore;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Operatore {

    /**
     * Default constructor
     */
    public Operatore(TOperatore tipo) {
    	this.tipo = tipo;
    }

    /**
     * 
     */
    private TOperatore tipo;
    
    public void esaminaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);

	public String getName() {
		// TODO Auto-generated method stub
		return "OPERATORE";
	}
}