package view;
import java.util.*;

/**
 * @author Edoardo Chigini, Fabio Scapini
 */
public class SegreteriaReparto extends Segreteria {

    /**
     * Default constructor
     */
    public SegreteriaReparto() {
    }


    /**
     * 
     */
    public String listaPossibiliOperazioni() {
    	return "SEGRETERIA REPARTO - LISTA POSSIBILI OPERAZIONI\n"
    			+ "1) Inserimento Dati Letto\n"
    			+ "2) Prenotazione Controllo Post-Ricovero\n";
    }

}