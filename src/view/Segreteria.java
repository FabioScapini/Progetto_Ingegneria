package view;
import java.util.*;

import controller.Paziente;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Segreteria {

    /**
     * Default constructor
     */
    public Segreteria() {
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Segreteria tipo;



    /**
     * @param paziente
     */
    public void esaminaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * @return 
     * 
     */
    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);

}