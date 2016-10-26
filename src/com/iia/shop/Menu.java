package com.iia.shop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton voirVehicule;
	private JButton ajouterVehicule;
	private JButton modifierVehicule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		
		JLabel lblQueSouhaitezvousFaire = new JLabel("Que souhaitez-vous faire ?");
		voirVehicule = new JButton("Voir un vehicule");
		ajouterVehicule = new JButton("Ajouter un vehicule");
		modifierVehicule = new JButton("Modifier un vehicule");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		GridBagConstraints gbc_lblQueSouhaitezvousFaire = new GridBagConstraints();
		gbc_lblQueSouhaitezvousFaire.gridwidth = 3;
		gbc_lblQueSouhaitezvousFaire.insets = new Insets(0, 0, 5, 5);
		gbc_lblQueSouhaitezvousFaire.gridx = 2;
		gbc_lblQueSouhaitezvousFaire.gridy = 0;
		contentPane.add(lblQueSouhaitezvousFaire, gbc_lblQueSouhaitezvousFaire);
		
		GridBagConstraints gbc_voirVehicule = new GridBagConstraints();
		gbc_voirVehicule.insets = new Insets(0, 0, 0, 5);
		gbc_voirVehicule.gridx = 1;
		gbc_voirVehicule.gridy = 4;
		contentPane.add(voirVehicule, gbc_voirVehicule);
		
		ajouterVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_ajouterVehicule = new GridBagConstraints();
		gbc_ajouterVehicule.insets = new Insets(0, 0, 0, 5);
		gbc_ajouterVehicule.gridx = 3;
		gbc_ajouterVehicule.gridy = 4;
		contentPane.add(ajouterVehicule, gbc_ajouterVehicule);
		
		modifierVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_modifierVehicule = new GridBagConstraints();
		gbc_modifierVehicule.gridx = 5;
		gbc_modifierVehicule.gridy = 4;
		contentPane.add(modifierVehicule, gbc_modifierVehicule);
		
		this.voirVehicule.addActionListener(this);
		this.ajouterVehicule.addActionListener(this);
		this.modifierVehicule.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.voirVehicule){
			VoirUnVehicule voir = new VoirUnVehicule();
			voir.setVisible(true);
		}
		else if (e.getSource() == this.ajouterVehicule){
			AjouterVehicule ajouter = new AjouterVehicule();
			ajouter.setVisible(true);
		}
		else if (e.getSource() == this.modifierVehicule){
			ModifierVehicule modifier = new ModifierVehicule();
			modifier.setVisible(true);
		}
	}
	
}
