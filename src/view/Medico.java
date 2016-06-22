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
     * @param paziente
     */
    public void stampaCartella(Paziente paziente) {
        // TODO implement here
    }

    /**
     * 
     */
    public abstract String listaPossibiliOperazioni();

}