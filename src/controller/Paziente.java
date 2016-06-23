package controller;

import java.util.*;
import java.text.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Paziente {

    /**
     * Default constructor
     */
    public Paziente(String codiceSanitario) {
    	this.codiceSanitario=codiceSanitario;
    }

    /**
     * 
     */
    private String codiceSanitario;
    
    public boolean pazienteEsistente(){
    	
    	
    	//TODO
    	
    	return false;
    }
    



    /**
     * @param nome 
     * @param cognome 
     * @param dataNascita 
     * @param luogoNascita 
     * @param provinciaResidenza 
     * @param fuoriRegione
     */
    public void creaPaziente(String nome, String cognome, SimpleDateFormat dataNascita, String luogoNascita, String provinciaResidenza, boolean fuoriRegione) {
        // TODO implement here
    }

    /**
     * @param nomeULSS 
     * @param regione
     */
    private void impostaRegione(String nomeULSS, String regione) {
        // TODO implement here
    }

    /**
     * @return
     */
    public HashSet<Esame> recuperaEsami() {
        // TODO implement here
        return null;
    }

}