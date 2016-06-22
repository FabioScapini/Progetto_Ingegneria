package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SelectFrame extends JFrame {

	private int OP = 0;
	private int SE = 1;
	
	private DefaultComboBoxModel<String> box = new DefaultComboBoxModel<String>();
	
	public SelectFrame (){
		
		this.setTitle("Login");

		this.setLayout(new GridLayout(2,1));
		
		//Panello dell'operatore
		JPanel operatore = new JPanel();
		JButton o_button = new JButton("Operatore");
		
		o_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginFrame(OP);
				dispose();
			}
		});
		
		operatore.add(o_button);
		
		//Panello della segreteria
		JPanel segreteria = new JPanel();
		JButton s_button = new JButton("Segreteria");
		
		s_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginFrame(SE);
				dispose();
			}
		});
		
		segreteria.add(s_button);
		
		//Impostazioni del frame
		this.add(operatore);
		this.add(segreteria);
		this.pack();
		this.setVisible(true);
	}
	
	private void loginFrame(int type){
		
		JFrame login = new JFrame();
		
		login.setTitle("Login " + (type == 0 ? "Operatore" : "Segreteria"));
		
		JPanel credenziali = new JPanel();
		
		credenziali.setLayout(new GridLayout(3,1));
		
		//Username
		JPanel username = new JPanel();
		username.setLayout(new GridLayout(1,2));
		
		JLabel u_label = new JLabel("Username: ");
		JTextField u_field = new JTextField();
		
		username.add(u_label);
		username.add(u_field);
		//Password
		JPanel password = new JPanel();
		password.setLayout(new GridLayout(1,2));
		
		JLabel p_label = new JLabel("Password: ");
		JTextField p_field = new JTextField();
		
		password.add(p_label);
		password.add(p_field);		
		//Tipo
		JPanel tipo = type == OP ? operatore_panel() : segreteria_panel();
		
		login.add(username);
		login.add(password);
		login.add(tipo);
		
		login.setVisible(true);
		login.pack();
	}
	
	private JPanel operatore_panel(){
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(1,2));
		
		JPanel operatore = new JPanel();
		
		JPanel oSala = new JPanel();
		JButton oSala_button = new JButton("Operatore di Sala");
		oSala.add(oSala_button);
		
		JPanel oInfermiere = new JPanel();
		JButton oInfermiere_button = new JButton("Infermiere");
		oInfermiere.add(oInfermiere_button);
		
		operatore.setLayout(new GridLayout(2,1));
		
		operatore.add(oSala);
		operatore.add(oInfermiere);
		
		JPanel medico = new JPanel();
				
		JPanel mAnestesista = new JPanel();
		JButton mAnestesista_button = new JButton("Medico Anestesista");
		mAnestesista.add(mAnestesista_button);
				
		JPanel mResponsabile = new JPanel();
		JButton mResponsabile_button = new JButton("Medico Responsabile");
		mResponsabile.add(mResponsabile_button);
				
		medico.setLayout(new GridLayout(2,1));
				
		medico.add(mAnestesista);
		medico.add(mResponsabile);
		
		panel.add(operatore);
		panel.add(medico);
		return panel;
	}
	
	private JPanel segreteria_panel(){
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(1,2));
		
		JPanel accettazione = new JPanel();
		
		JButton accettazione_button = new JButton("Segreteria Accettazione");
		accettazione.add(accettazione_button);
		
		JPanel reparto = new JPanel();
		JButton reparto_button = new JButton("Segreteria Reparto");
		reparto.add(reparto_button);
		
		panel.add(accettazione);
		panel.add(reparto);		
		return panel;
	}
}
