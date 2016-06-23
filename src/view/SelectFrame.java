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
import java.awt.event.MouseListener;
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

import controller.TOperatore;
import controller.TSegreteria;

public class SelectFrame extends JFrame {

	private int OP = 0;
	private int SE = 1;
	
	JFrame frame;
	
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
		frame = this;
	}
	
	private void loginFrame(int type){
		
		JFrame login = new JFrame();
		
		login.setTitle("Login " + (type == 0 ? "Operatore" : "Segreteria"));
		
		JPanel credenziali = new JPanel();
		
		credenziali.setLayout(new GridLayout(2,1));
		login.setLayout(new GridLayout(2,1));
		
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
		
		credenziali.add(username);
		credenziali.add(password);
				
		login.add(credenziali);
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
		oSala_button.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				create(TOperatore.SALA);
				frame.dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		JPanel oInfermiere = new JPanel();
		JButton oInfermiere_button = new JButton("Infermiere");
		oInfermiere.add(oInfermiere_button);
		oInfermiere_button.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				create(TOperatore.INFERMIERE);
				frame.dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		operatore.setLayout(new GridLayout(2,1));
		
		operatore.add(oSala);
		operatore.add(oInfermiere);
		
		JPanel medico = new JPanel();
				
		JPanel mAnestesista = new JPanel();
		JButton mAnestesista_button = new JButton("Medico Anestesista");
		mAnestesista.add(mAnestesista_button);
		mAnestesista_button.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				create(TOperatore.ANESTESISTA);
				frame.dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		JPanel mResponsabile = new JPanel();
		JButton mResponsabile_button = new JButton("Medico Responsabile");
		mResponsabile.add(mResponsabile_button);
		mResponsabile_button.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				create(TOperatore.RESPONSABILE);
				frame.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
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
		accettazione_button.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				create(TSegreteria.ACCETTAZIONE);
				frame.dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		JPanel reparto = new JPanel();
		JButton reparto_button = new JButton("Segreteria Reparto");
		reparto.add(reparto_button);
		reparto_button.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				create(TSegreteria.REPARTO);
				frame.dispose();

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		panel.add(accettazione);
		panel.add(reparto);		
		return panel;
	}
	
	private void create(TOperatore type){
		Operatore operatore = inizialize(type);
		//TODO verify();		
	}
	
	private Operatore inizialize(TOperatore tipo) {
		switch(tipo){
		case SALA:
			return new OperatoreSala();
		case INFERMIERE:
			return new Infermiere();
		case RESPONSABILE:
			return new MedicoResponsabile();
		case ANESTESISTA:
			return new MedicoAnestesista();
		default:
			return null;
		}
	}
	
	private void create(TSegreteria type){
		Segreteria segreteria = inizialize(type);
		//TODO verify();
		
		new Terminal(segreteria, type);		
	}
	
	private Segreteria inizialize(TSegreteria tipo) {
		switch(tipo){
		case ACCETTAZIONE:
			return new SegreteriaAccettazione();
		case REPARTO:
			return new SegreteriaReparto();
		default:
			return null;
		}
	}
}
