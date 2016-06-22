package view;

import java.util.*;

import controller.Paziente;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public abstract class Medico extends Operatore {

    /**
     * Default constructor
     */
    public Medico() {
    }




    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();
    
    public abstract void eseguiOperazione(int val);

}