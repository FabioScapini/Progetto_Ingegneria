package view;

import java.util.*;

import controller.Paziente;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Operatore {

    /**
     * Default constructor
     */
    public Operatore() {
    }

    /**
     * 
     */
    private Operatore tipo;
    
    public void esaminaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);


}