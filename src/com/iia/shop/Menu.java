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
import java.awt.Font;

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
					frame.setTitle("Menu");
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
		lblQueSouhaitezvousFaire.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblQueSouhaitezvousFaire.setForeground(java.awt.Color.orange);
		
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
		
		// label "Que souhaitez-vous faire ?"
		GridBagConstraints gbc_lblQueSouhaitezvousFaire = new GridBagConstraints();
		gbc_lblQueSouhaitezvousFaire.gridwidth = 5;
		gbc_lblQueSouhaitezvousFaire.insets = new Insets(0, 0, 5, 5);
		gbc_lblQueSouhaitezvousFaire.gridx = 1;
		gbc_lblQueSouhaitezvousFaire.gridy = 0;
		contentPane.add(lblQueSouhaitezvousFaire, gbc_lblQueSouhaitezvousFaire);
		
		// bouton "Voir un vehicule"
		voirVehicule = new JButton("Voir un vehicule");		
		voirVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// bouton "Modifier un vehicule"
		modifierVehicule = new JButton("Modifier un vehicule");		
		modifierVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// bouton "Ajouter un vehicule"
		ajouterVehicule = new JButton("Ajouter un vehicule");		
		ajouterVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// bouton "Voir les vehicules"
		voirLesVehicules = new JButton("Vois tous les vehicules");		
		voirLesVehicules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// bouton "Supprimer un vehicule"
		supprimerVehicule = new JButton("Supprimer un vehicule");		
		supprimerVehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// bouton "Ajouter un vehicule"
		GridBagConstraints gbc_ajouterVehicule = new GridBagConstraints();
		gbc_ajouterVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterVehicule.gridx = 1;
		gbc_ajouterVehicule.gridy = 2;
		ajouterVehicule.setBackground(java.awt.Color.white);
		ajouterVehicule.setForeground(java.awt.Color.blue);
		contentPane.add(ajouterVehicule, gbc_ajouterVehicule);
		this.ajouterVehicule.addActionListener(this);
		
		// bouton "Modifier un vehicule"
		GridBagConstraints gbc_modifierVehicule = new GridBagConstraints();
		gbc_modifierVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_modifierVehicule.gridx = 3;
		gbc_modifierVehicule.gridy = 2;
		modifierVehicule.setBackground(java.awt.Color.white);
		modifierVehicule.setForeground(java.awt.Color.blue);
		contentPane.add(modifierVehicule, gbc_modifierVehicule);
		this.modifierVehicule.addActionListener(this);
		
		// bouton "Supprimer un vehicule"
		supprimerVehicule = new JButton("Supprimer un vehicule");
		GridBagConstraints gbc_supprimerVehicule = new GridBagConstraints();
		gbc_supprimerVehicule.insets = new Insets(0, 0, 5, 0);
		gbc_supprimerVehicule.gridx = 5;
		gbc_supprimerVehicule.gridy = 2;
		supprimerVehicule.setBackground(java.awt.Color.white);
		supprimerVehicule.setForeground(java.awt.Color.blue);
		contentPane.add(supprimerVehicule, gbc_supprimerVehicule);
		
		// bouton "Voir un vehicule"
		GridBagConstraints gbc_voirVehicule = new GridBagConstraints();
		gbc_voirVehicule.insets = new Insets(0, 0, 0, 5);
		gbc_voirVehicule.gridx = 1;
		gbc_voirVehicule.gridy = 4;
		voirVehicule.setBackground(java.awt.Color.white);
		voirVehicule.setForeground(java.awt.Color.blue);
		contentPane.add(voirVehicule, gbc_voirVehicule);
		
		// bouton "Voir les vehicules"
		voirLesVehicules = new JButton("Voir tous les vehicules");
		GridBagConstraints gbc_voirLesVehicules = new GridBagConstraints();
		gbc_voirLesVehicules.insets = new Insets(0, 0, 0, 5);
		gbc_voirLesVehicules.gridx = 3;
		gbc_voirLesVehicules.gridy = 4;
		voirLesVehicules.setBackground(java.awt.Color.white);
		voirLesVehicules.setForeground(java.awt.Color.blue);
		contentPane.add(voirLesVehicules, gbc_voirLesVehicules);
		
		this.voirVehicule.addActionListener(this);
		this.voirLesVehicules.addActionListener(this);
		this.supprimerVehicule.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// en fonction du bouton sur lequel on clique la page voulue s'affiche
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
