package com.iia.shop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.iia.shop.dao.VehiculeDAO;
import com.iia.shop.entity.Vehicule;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ModifierVehicule extends JFrame implements ActionListener{

	private static ArrayList<Vehicule> vehicules;
	private JPanel contentPane;
	private JTextField voirNumeroVehicule;
	private JTextField modifierMarque;
	private JTextField modifierAnnee;
	private JTextField modifierVitesse;
	private JTextField modifierModele;
	private JTextField modifierCouleur;
	private JTextField modifierPrix;
	private JButton btnValider;
	private JButton modifierAnnuler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierVehicule frame = new ModifierVehicule();
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
	public ModifierVehicule() {
		vehicules = new ArrayList<Vehicule>();
		btnValider = new JButton("Valider");
		modifierAnnuler = new JButton("Annuler");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblModifierUnVehicule = new JLabel("Modifier un vehicule");
		GridBagConstraints gbc_lblModifierUnVehicule = new GridBagConstraints();
		gbc_lblModifierUnVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_lblModifierUnVehicule.gridx = 2;
		gbc_lblModifierUnVehicule.gridy = 0;
		contentPane.add(lblModifierUnVehicule, gbc_lblModifierUnVehicule);
		
		JLabel lblNumeroDuVehicule = new JLabel("Numero du vehicule");
		GridBagConstraints gbc_lblNumeroDuVehicule = new GridBagConstraints();
		gbc_lblNumeroDuVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDuVehicule.gridx = 0;
		gbc_lblNumeroDuVehicule.gridy = 2;
		contentPane.add(lblNumeroDuVehicule, gbc_lblNumeroDuVehicule);
		
		voirNumeroVehicule = new JTextField();
		GridBagConstraints gbc_voirNumeroVehicule = new GridBagConstraints();
		gbc_voirNumeroVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_voirNumeroVehicule.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirNumeroVehicule.gridx = 2;
		gbc_voirNumeroVehicule.gridy = 2;
		contentPane.add(voirNumeroVehicule, gbc_voirNumeroVehicule);
		voirNumeroVehicule.setColumns(10);
		
		JButton modifierValider = new JButton("Valider");
		GridBagConstraints gbc_modifierValider = new GridBagConstraints();
		gbc_modifierValider.insets = new Insets(0, 0, 5, 5);
		gbc_modifierValider.gridx = 3;
		gbc_modifierValider.gridy = 2;
		contentPane.add(modifierValider, gbc_modifierValider);
		
		JLabel lblMarque = new JLabel("Marque");
		GridBagConstraints gbc_lblMarque = new GridBagConstraints();
		gbc_lblMarque.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarque.gridx = 0;
		gbc_lblMarque.gridy = 4;
		contentPane.add(lblMarque, gbc_lblMarque);
		
		modifierMarque = new JTextField();
		GridBagConstraints gbc_modifierMarque = new GridBagConstraints();
		gbc_modifierMarque.insets = new Insets(0, 0, 5, 5);
		gbc_modifierMarque.fill = GridBagConstraints.HORIZONTAL;
		gbc_modifierMarque.gridx = 2;
		gbc_modifierMarque.gridy = 4;
		contentPane.add(modifierMarque, gbc_modifierMarque);
		modifierMarque.setColumns(10);
		
		JLabel lblAnnee = new JLabel("Annee");
		GridBagConstraints gbc_lblAnnee = new GridBagConstraints();
		gbc_lblAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnnee.gridx = 0;
		gbc_lblAnnee.gridy = 5;
		contentPane.add(lblAnnee, gbc_lblAnnee);
		
		modifierAnnee = new JTextField();
		GridBagConstraints gbc_modifierAnnee = new GridBagConstraints();
		gbc_modifierAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_modifierAnnee.fill = GridBagConstraints.HORIZONTAL;
		gbc_modifierAnnee.gridx = 2;
		gbc_modifierAnnee.gridy = 5;
		contentPane.add(modifierAnnee, gbc_modifierAnnee);
		modifierAnnee.setColumns(10);
		
		JLabel lblVitesse = new JLabel("Vitesse");
		GridBagConstraints gbc_lblVitesse = new GridBagConstraints();
		gbc_lblVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblVitesse.gridx = 0;
		gbc_lblVitesse.gridy = 6;
		contentPane.add(lblVitesse, gbc_lblVitesse);
		
		modifierVitesse = new JTextField();
		GridBagConstraints gbc_modifierVitesse = new GridBagConstraints();
		gbc_modifierVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_modifierVitesse.fill = GridBagConstraints.HORIZONTAL;
		gbc_modifierVitesse.gridx = 2;
		gbc_modifierVitesse.gridy = 6;
		contentPane.add(modifierVitesse, gbc_modifierVitesse);
		modifierVitesse.setColumns(10);
		
		JLabel lblModele = new JLabel("Modele");
		GridBagConstraints gbc_lblModele = new GridBagConstraints();
		gbc_lblModele.insets = new Insets(0, 0, 5, 5);
		gbc_lblModele.gridx = 0;
		gbc_lblModele.gridy = 7;
		contentPane.add(lblModele, gbc_lblModele);
		
		modifierModele = new JTextField();
		GridBagConstraints gbc_modifierModele = new GridBagConstraints();
		gbc_modifierModele.insets = new Insets(0, 0, 5, 5);
		gbc_modifierModele.fill = GridBagConstraints.HORIZONTAL;
		gbc_modifierModele.gridx = 2;
		gbc_modifierModele.gridy = 7;
		contentPane.add(modifierModele, gbc_modifierModele);
		modifierModele.setColumns(10);
		
		JLabel lblCouleur = new JLabel("Couleur");
		GridBagConstraints gbc_lblCouleur = new GridBagConstraints();
		gbc_lblCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_lblCouleur.gridx = 0;
		gbc_lblCouleur.gridy = 8;
		contentPane.add(lblCouleur, gbc_lblCouleur);
		
		modifierCouleur = new JTextField();
		GridBagConstraints gbc_modifierCouleur = new GridBagConstraints();
		gbc_modifierCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_modifierCouleur.fill = GridBagConstraints.HORIZONTAL;
		gbc_modifierCouleur.gridx = 2;
		gbc_modifierCouleur.gridy = 8;
		contentPane.add(modifierCouleur, gbc_modifierCouleur);
		modifierCouleur.setColumns(10);
		
		JLabel lblPrix = new JLabel("Prix");
		GridBagConstraints gbc_lblPrix = new GridBagConstraints();
		gbc_lblPrix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrix.gridx = 0;
		gbc_lblPrix.gridy = 9;
		contentPane.add(lblPrix, gbc_lblPrix);
		
		modifierPrix = new JTextField();
		GridBagConstraints gbc_modifierPrix = new GridBagConstraints();
		gbc_modifierPrix.insets = new Insets(0, 0, 5, 5);
		gbc_modifierPrix.fill = GridBagConstraints.HORIZONTAL;
		gbc_modifierPrix.gridx = 2;
		gbc_modifierPrix.gridy = 9;
		contentPane.add(modifierPrix, gbc_modifierPrix);
		modifierPrix.setColumns(10);
		
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 0, 5);
		gbc_btnValider.gridx = 2;
		gbc_btnValider.gridy = 11;
		contentPane.add(btnValider, gbc_btnValider);
		
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnnuler.gridx = 3;
		gbc_btnAnnuler.gridy = 11;
		contentPane.add(modifierAnnuler, gbc_btnAnnuler);
		
		this.modifierMarque.addActionListener(this);
		this.modifierAnnee.addActionListener(this);
		this.modifierVitesse.addActionListener(this);
		this.modifierModele.addActionListener(this);
		this.modifierCouleur.addActionListener(this);
		this.modifierPrix.addActionListener(this);
		this.btnValider.addActionListener(this);
		this.modifierAnnuler.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnValider){
			VehiculeDAO vDao = new VehiculeDAO();
			Vehicule vehicule;
			vehicule = new Vehicule();
			// numero du vehicule
			int i = Integer.parseInt(voirNumeroVehicule.getText());
			vehicule.setId(i);
			modifier(vehicule);
		
			vDao.update(vehicule);
			this.dispose();
		}
		else if (e.getSource() == this.modifierAnnuler){
			ModifierVehicule modifier = new ModifierVehicule();
			modifier.setVisible(false);
		}	
	}
	
	public void modifier(Vehicule vehicule){
		int res = 0;
		vehicule.setMarque(modifierMarque.getText());
		res = Integer.parseInt(modifierAnnee.getText());
		vehicule.setYear(res);
		res = Integer.parseInt(modifierVitesse.getText());
		vehicule.setSpeed(res);
		vehicule.setModel(modifierModele.getText());
		vehicule.setColor(modifierCouleur.getText());
		res = Integer.parseInt(modifierPrix.getText());
		vehicule.setPrice(res);
		vehicules.add(vehicule);
	}

}
