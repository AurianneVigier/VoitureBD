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
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class SupprimerVehicule extends JFrame implements ActionListener{

	private static ArrayList<Vehicule> vehicules;
	private JPanel contentPane;
	private JTextField supprimerNumeroVehicule;
	private JTextField supprimerMarque;
	private JTextField supprimerAnnee;
	private JTextField supprimerVitesse;
	private JTextField supprimerModele;
	private JTextField supprimerCouleur;
	private JTextField supprimerPrix;
	private JButton supprimerValider;
	private JButton supprimerSupprimer;
	private JButton supprimerAnnuler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupprimerVehicule frame = new SupprimerVehicule();
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
	public SupprimerVehicule() {
		vehicules = new ArrayList<Vehicule>();
		supprimerValider = new JButton("Valider");
		supprimerSupprimer = new JButton("Supprimer");
		supprimerAnnuler = new JButton("Annuler");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 146, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSupprimerUnVehicule = new JLabel("Supprimer un vehicule");
		GridBagConstraints gbc_lblSupprimerUnVehicule = new GridBagConstraints();
		gbc_lblSupprimerUnVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_lblSupprimerUnVehicule.gridx = 1;
		gbc_lblSupprimerUnVehicule.gridy = 0;
		contentPane.add(lblSupprimerUnVehicule, gbc_lblSupprimerUnVehicule);
		
		JLabel lblNumeroDuVehicule = new JLabel("Numero du vehicule");
		GridBagConstraints gbc_lblNumeroDuVehicule = new GridBagConstraints();
		gbc_lblNumeroDuVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDuVehicule.gridx = 0;
		gbc_lblNumeroDuVehicule.gridy = 2;
		contentPane.add(lblNumeroDuVehicule, gbc_lblNumeroDuVehicule);
		
		supprimerNumeroVehicule = new JTextField();
		GridBagConstraints gbc_supprimerNumeroVehicule = new GridBagConstraints();
		gbc_supprimerNumeroVehicule.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerNumeroVehicule.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerNumeroVehicule.gridx = 1;
		gbc_supprimerNumeroVehicule.gridy = 2;
		contentPane.add(supprimerNumeroVehicule, gbc_supprimerNumeroVehicule);
		supprimerNumeroVehicule.setColumns(10);
		
		GridBagConstraints gbc_supprimerValider = new GridBagConstraints();
		gbc_supprimerValider.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerValider.gridx = 2;
		gbc_supprimerValider.gridy = 2;
		contentPane.add(supprimerValider, gbc_supprimerValider);
		
		JLabel lblMarque = new JLabel("Marque");
		GridBagConstraints gbc_lblMarque = new GridBagConstraints();
		gbc_lblMarque.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarque.gridx = 0;
		gbc_lblMarque.gridy = 4;
		contentPane.add(lblMarque, gbc_lblMarque);
		
		supprimerMarque = new JTextField();
		GridBagConstraints gbc_supprimerMarque = new GridBagConstraints();
		gbc_supprimerMarque.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerMarque.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerMarque.gridx = 1;
		gbc_supprimerMarque.gridy = 4;
		contentPane.add(supprimerMarque, gbc_supprimerMarque);
		supprimerMarque.setColumns(10);
		
		JLabel lblAnnee = new JLabel("Annee");
		GridBagConstraints gbc_lblAnnee = new GridBagConstraints();
		gbc_lblAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnnee.gridx = 0;
		gbc_lblAnnee.gridy = 5;
		contentPane.add(lblAnnee, gbc_lblAnnee);
		
		supprimerAnnee = new JTextField();
		GridBagConstraints gbc_supprimerAnnee = new GridBagConstraints();
		gbc_supprimerAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerAnnee.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerAnnee.gridx = 1;
		gbc_supprimerAnnee.gridy = 5;
		contentPane.add(supprimerAnnee, gbc_supprimerAnnee);
		supprimerAnnee.setColumns(10);
		
		JLabel lblVitesse = new JLabel("Vitesse");
		GridBagConstraints gbc_lblVitesse = new GridBagConstraints();
		gbc_lblVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblVitesse.gridx = 0;
		gbc_lblVitesse.gridy = 6;
		contentPane.add(lblVitesse, gbc_lblVitesse);
		
		supprimerVitesse = new JTextField();
		GridBagConstraints gbc_supprimerVitesse = new GridBagConstraints();
		gbc_supprimerVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerVitesse.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerVitesse.gridx = 1;
		gbc_supprimerVitesse.gridy = 6;
		contentPane.add(supprimerVitesse, gbc_supprimerVitesse);
		supprimerVitesse.setColumns(10);
		
		JLabel lblModele = new JLabel("Modele");
		GridBagConstraints gbc_lblModele = new GridBagConstraints();
		gbc_lblModele.insets = new Insets(0, 0, 5, 5);
		gbc_lblModele.gridx = 0;
		gbc_lblModele.gridy = 7;
		contentPane.add(lblModele, gbc_lblModele);
		
		supprimerModele = new JTextField();
		GridBagConstraints gbc_supprimerModele = new GridBagConstraints();
		gbc_supprimerModele.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerModele.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerModele.gridx = 1;
		gbc_supprimerModele.gridy = 7;
		contentPane.add(supprimerModele, gbc_supprimerModele);
		supprimerModele.setColumns(10);
		
		JLabel lblCouleur = new JLabel("Couleur");
		GridBagConstraints gbc_lblCouleur = new GridBagConstraints();
		gbc_lblCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_lblCouleur.gridx = 0;
		gbc_lblCouleur.gridy = 8;
		contentPane.add(lblCouleur, gbc_lblCouleur);
		
		supprimerCouleur = new JTextField();
		GridBagConstraints gbc_supprimerCouleur = new GridBagConstraints();
		gbc_supprimerCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerCouleur.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerCouleur.gridx = 1;
		gbc_supprimerCouleur.gridy = 8;
		contentPane.add(supprimerCouleur, gbc_supprimerCouleur);
		supprimerCouleur.setColumns(10);
		
		JLabel lblPris = new JLabel("Prix");
		GridBagConstraints gbc_lblPris = new GridBagConstraints();
		gbc_lblPris.insets = new Insets(0, 0, 5, 5);
		gbc_lblPris.gridx = 0;
		gbc_lblPris.gridy = 9;
		contentPane.add(lblPris, gbc_lblPris);
		
		supprimerPrix = new JTextField();
		GridBagConstraints gbc_supprimerPrix = new GridBagConstraints();
		gbc_supprimerPrix.insets = new Insets(0, 0, 5, 5);
		gbc_supprimerPrix.fill = GridBagConstraints.HORIZONTAL;
		gbc_supprimerPrix.gridx = 1;
		gbc_supprimerPrix.gridy = 9;
		contentPane.add(supprimerPrix, gbc_supprimerPrix);
		supprimerPrix.setColumns(10);
		
		GridBagConstraints gbc_supprimerSupprimer = new GridBagConstraints();
		gbc_supprimerSupprimer.insets = new Insets(0, 0, 0, 5);
		gbc_supprimerSupprimer.gridx = 1;
		gbc_supprimerSupprimer.gridy = 11;
		contentPane.add(supprimerSupprimer, gbc_supprimerSupprimer);
		
		GridBagConstraints gbc_supprimerAnnuler = new GridBagConstraints();
		gbc_supprimerAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_supprimerAnnuler.gridx = 2;
		gbc_supprimerAnnuler.gridy = 11;
		contentPane.add(supprimerAnnuler, gbc_supprimerAnnuler);
		
		this.supprimerMarque.addActionListener(this);
		this.supprimerAnnee.addActionListener(this);
		this.supprimerVitesse.addActionListener(this);
		this.supprimerModele.addActionListener(this);
		this.supprimerCouleur.addActionListener(this);
		this.supprimerPrix.addActionListener(this);
		this.supprimerValider.addActionListener(this);
		this.supprimerSupprimer.addActionListener(this);
		this.supprimerAnnuler.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.supprimerValider){
			VehiculeDAO vDao = new VehiculeDAO();
			Vehicule vehicule;
			vehicule = new Vehicule();
			// numero du vehicule
			int i = Integer.parseInt(supprimerNumeroVehicule.getText());
			vehicule = vDao.findById(i);
		
			String marque = vehicule.getMarque();
			int year = vehicule.getYear();
			int speed = vehicule.getSpeed();
			String model = vehicule.getModel();
			String color = vehicule.getColor();
			int price = (int) vehicule.getPrice();
			
			supprimerMarque.setText(" " + marque);
			supprimerAnnee.setText(" " + year);
			supprimerVitesse.setText(" " + speed);
			supprimerModele.setText(" " + model);
			supprimerCouleur.setText(" " + color);
			supprimerPrix.setText(" " + price);
		}
		else if (e.getSource() == this.supprimerSupprimer){
			VehiculeDAO vDao = new VehiculeDAO();
			Vehicule vehicule;
			vehicule = new Vehicule();
			// numero du vehicule
			int i = Integer.parseInt(supprimerNumeroVehicule.getText());
			vehicule.setId(i);
			supprimer(vehicule);
		
			vDao.delete(vehicule);
			this.dispose();
		}
		else if (e.getSource() == this.supprimerAnnuler){
			this.dispose();
		}
		
	}
	
	public void supprimer(Vehicule vehicule){
		vehicules.remove(vehicule);
	}

}
