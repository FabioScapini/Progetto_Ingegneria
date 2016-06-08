package controller;

import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Paziente {

    /**
     * Default constructor
     */
    public Paziente() {
    }

    /**
     * 
     */
    private String codiceSanitario;



    /**
     * @param nome 
     * @param cognome 
     * @param dataNascita 
     * @param luogoNascita 
     * @param provinciaResidenza 
     * @param fuoriRegione
     */
    public void creaPaziente(String nome, String cognome, Date dataNascita, String luogoNascita, String provinciaResidenza, boolean fuoriRegione) {
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