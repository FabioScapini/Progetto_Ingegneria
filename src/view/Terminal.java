package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.TOperatore;
import controller.TSegreteria;

import java.awt.event.MouseListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Terminal extends JFrame {

	private JTextField insert;

	/**
	 * Create the frame.
	 */
	public Terminal(Operatore operatore, TOperatore type) {
		
		setTitle(type+"");
		
		JPanel top = new JPanel();
		add(top, BorderLayout.NORTH);
		
		JButton logout = new JButton("Logout");
		top.add(logout);
		logout.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new SelectFrame();
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
		
		JButton exit = new JButton("Exit");
		top.add(exit);
		exit.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
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
		
		JPanel center = new JPanel();
		add(center, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		center.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setRows(10);
		textArea.setColumns(50);
		textArea.setEditable(false);
		
		textArea.setText("Benvenuto Dott." + operatore.getName() + "\n" + operatore.listaPossibiliOperazioni());
		
		JPanel bottom = new JPanel();
		add(bottom, BorderLayout.SOUTH);
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		
		JPanel insert_panel = new JPanel();
		bottom.add(insert_panel);
		
		insert = new JTextField();
		insert.setFont(new Font("Tahoma", Font.ITALIC, 11));
		insert_panel.add(insert);
		insert.setColumns(35);
		
		JPanel ok_panel = new JPanel();
		bottom.add(ok_panel);
		
		JButton ok = new JButton("OK");
		ok_panel.add(ok);
		ok.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				operatore.eseguiOperazione(Integer.parseInt(insert.getText()));
				insert.setText("");
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
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 432, 311);
		pack();
	}
	
	public Terminal(Segreteria segreteria, TSegreteria type) {
		
		setTitle(type+"");
		
		JPanel top = new JPanel();
		add(top, BorderLayout.NORTH);
		
		JButton logout = new JButton("Logout");
		logout.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new SelectFrame();
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
	
		top.add(logout);
		
		
		JButton exit = new JButton("Exit");
		top.add(exit);
		
		exit.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
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
	
		
		JPanel center = new JPanel();
		add(center, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		center.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setRows(10);
		textArea.setColumns(50);
		textArea.setEditable(false);
		
		textArea.setText("Benvenuto " + segreteria.getName() + "\n" + segreteria.listaPossibiliOperazioni());
		
		JPanel bottom = new JPanel();
		add(bottom, BorderLayout.SOUTH);
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		
		JPanel insert_panel = new JPanel();
		bottom.add(insert_panel);
		
		insert = new JTextField();
		insert.setFont(new Font("Tahoma", Font.ITALIC, 11));
		insert_panel.add(insert);
		insert.setColumns(35);
		
		JPanel ok_panel = new JPanel();
		bottom.add(ok_panel);
		
		JButton ok = new JButton("OK");
		ok_panel.add(ok);
		ok.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				segreteria.eseguiOperazione(Integer.parseInt(insert.getText()));
				insert.setText("");
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
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 432, 311);
		pack();
	}
	
	

}
