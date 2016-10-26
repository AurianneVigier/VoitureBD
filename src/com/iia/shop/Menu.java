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
	private JButton voirLesVehicules;
	private JButton supprimerVehicule;

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
		
		voirVehicule = new JButton("Voir un vehicule");		
		voirVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		modifierVehicule = new JButton("Modifier un vehicule");		
		modifierVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		ajouterVehicule = new JButton("Ajouter un vehicule");		
		ajouterVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		voirLesVehicules = new JButton("Vois tous les vehicules");		
		voirLesVehicules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		supprimerVehicule = new JButton("Supprimer un vehicule");		
		supprimerVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_ajouterVehicule = new GridBagConstraints();
		gbc_ajouterVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterVehicule.gridx = 1;
		gbc_ajouterVehicule.gridy = 2;
		contentPane.add(ajouterVehicule, gbc_ajouterVehicule);
		this.ajouterVehicule.addActionListener(this);
		GridBagConstraints gbc_modifierVehicule = new GridBagConstraints();
		gbc_modifierVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_modifierVehicule.gridx = 3;
		gbc_modifierVehicule.gridy = 2;
		contentPane.add(modifierVehicule, gbc_modifierVehicule);
		this.modifierVehicule.addActionListener(this);
		
		supprimerVehicule = new JButton("Supprimer un vehicule");
		GridBagConstraints gbc_supprimerVehicule = new GridBagConstraints();
		gbc_supprimerVehicule.insets = new Insets(0, 0, 5, 0);
		gbc_supprimerVehicule.gridx = 5;
		gbc_supprimerVehicule.gridy = 2;
		contentPane.add(supprimerVehicule, gbc_supprimerVehicule);
		
		GridBagConstraints gbc_voirVehicule = new GridBagConstraints();
		gbc_voirVehicule.insets = new Insets(0, 0, 0, 5);
		gbc_voirVehicule.gridx = 1;
		gbc_voirVehicule.gridy = 4;
		contentPane.add(voirVehicule, gbc_voirVehicule);
		
		voirLesVehicules = new JButton("Voir tous les vehicules");
		GridBagConstraints gbc_voirLesVehicules = new GridBagConstraints();
		gbc_voirLesVehicules.insets = new Insets(0, 0, 0, 5);
		gbc_voirLesVehicules.gridx = 3;
		gbc_voirLesVehicules.gridy = 4;
		contentPane.add(voirLesVehicules, gbc_voirLesVehicules);
		
		this.voirVehicule.addActionListener(this);
		this.voirLesVehicules.addActionListener(this);
		this.supprimerVehicule.addActionListener(this);
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
		else if (e.getSource() == this.voirLesVehicules){
			VoirLesVehicules voirTous = new VoirLesVehicules();
			voirTous.setVisible(true);
		}
		else if (e.getSource() == this.supprimerVehicule){
		SupprimerVehicule supprimer = new SupprimerVehicule();
			supprimer.setVisible(true);
		}
	}
	
}
