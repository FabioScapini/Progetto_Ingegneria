package view;
import controller.Paziente;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class Infermiere extends Operatore {

    /**
     * Default constructor
     */
    public Infermiere() {
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
    public String listaPossibiliOperazioni(){
    	return "INFERMIERE - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Registrazione Somministrazione Farmaco\n";
    }

}