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
import javax.swing.JTable;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;

public class VoirLesVehicules extends JFrame implements ActionListener{

	private static ArrayList<Vehicule> vehicules;
	private JPanel contentPane;
	private JButton btnVoirLesVehicules;
	private JLabel lblMarque;
	private JLabel lblAnnee;
	private JLabel lblVitesse;
	private JLabel lblModele;
	private JLabel lblCouleur;
	private JLabel lblPrix;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VoirLesVehicules frame = new VoirLesVehicules();
					frame.setVisible(true);
					frame.setTitle("Voir tous les vehicules");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VoirLesVehicules() {
		vehicules = new ArrayList<Vehicule>();
		btnVoirLesVehicules = new JButton("Voir les vehicules");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{37, 65, 322, 0};
		gbl_contentPane.rowHeights = new int[]{14, 23, 14, 14, 14, 14, 14, 14, 90, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		btnVoirLesVehicules = new JButton("Voir les vehicules");
		GridBagConstraints gbc_btnVoirLesVehicules = new GridBagConstraints();
		gbc_btnVoirLesVehicules.insets = new Insets(0, 0, 5, 0);
		gbc_btnVoirLesVehicules.gridx = 2;
		gbc_btnVoirLesVehicules.gridy = 1;
		contentPane.add(btnVoirLesVehicules, gbc_btnVoirLesVehicules);
		
		this.btnVoirLesVehicules.addActionListener(this);
		
		lblMarque = new JLabel("Marque");
		GridBagConstraints gbc_lblMarque = new GridBagConstraints();
		gbc_lblMarque.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarque.gridx = 0;
		gbc_lblMarque.gridy = 2;
		contentPane.add(lblMarque, gbc_lblMarque);
		
		lblAnnee = new JLabel("Annee");
		GridBagConstraints gbc_lblAnnee = new GridBagConstraints();
		gbc_lblAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnnee.gridx = 0;
		gbc_lblAnnee.gridy = 3;
		contentPane.add(lblAnnee, gbc_lblAnnee);
		
		lblVitesse = new JLabel("Vitesse");
		GridBagConstraints gbc_lblVitesse = new GridBagConstraints();
		gbc_lblVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblVitesse.gridx = 0;
		gbc_lblVitesse.gridy = 4;
		contentPane.add(lblVitesse, gbc_lblVitesse);
		
		lblModele = new JLabel("Modele");
		GridBagConstraints gbc_lblModele = new GridBagConstraints();
		gbc_lblModele.insets = new Insets(0, 0, 5, 5);
		gbc_lblModele.gridx = 0;
		gbc_lblModele.gridy = 5;
		contentPane.add(lblModele, gbc_lblModele);
		
		lblCouleur = new JLabel("Couleur");
		GridBagConstraints gbc_lblCouleur = new GridBagConstraints();
		gbc_lblCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_lblCouleur.gridx = 0;
		gbc_lblCouleur.gridy = 6;
		contentPane.add(lblCouleur, gbc_lblCouleur);
		
		lblPrix = new JLabel("Prix");
		GridBagConstraints gbc_lblPrix = new GridBagConstraints();
		gbc_lblPrix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrix.gridx = 0;
		gbc_lblPrix.gridy = 7;
		contentPane.add(lblPrix, gbc_lblPrix);
		
		list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 2;
		gbc_list.gridy = 8;
		contentPane.add(list, gbc_list);
	}

	// ne fonctionne pas
	
	// seul le dernier vehicule de la liste sera afficher
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// l'utilisateur clique sur le bouton "Voir les vehicules"
		if (e.getSource() == this.btnVoirLesVehicules){
			VehiculeDAO vDao = new VehiculeDAO();
			vehicules = (ArrayList<Vehicule>) vDao.findAll();
			for (Vehicule voiture : vehicules) {
				String marque = voiture.getMarque();
				int year = voiture.getYear();
				int speed = voiture.getSpeed();
				String model = voiture.getModel();
				String color = voiture.getColor();
				int price = (int) voiture.getPrice();
				
				list.setToolTipText(marque + ", " + year + ", " + speed + ", " + model + ", " + color + ", " + price);
				
				lblMarque.setText("Marque : " + marque);
				lblAnnee.setText("Modèle : " + year);
				lblVitesse.setText("Couleur : " + speed);
				lblModele.setText("Année : " + model);
				lblCouleur.setText("Vitesse : " + color);
				lblPrix.setText("Prix : " + price);
			}	
		}
	}
	
//	private static void voirLesVehicules(Vehicule vehicule) {
//		System.out.println("Marque : " + vehicule.getMarque());
//		System.out.println("Modèle : " + vehicule.getModel());
//		System.out.println("Couleur : " + vehicule.getColor());
//		System.out.println("Année : " + vehicule.getYear());
//		System.out.println("Vitesse : " + vehicule.getSpeed());
//		System.out.println("Prix : " + vehicule.getPrice());
//		System.out.println(" ");
//	}

}
