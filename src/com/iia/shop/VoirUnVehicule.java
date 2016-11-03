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
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class VoirUnVehicule extends JFrame implements ActionListener{

	private static ArrayList<Vehicule> vehicules;
	private JPanel contentPane;
	private JTextField voirMarque;
	private JTextField voirAnnee;
	private JTextField voirVitesse;
	private JTextField voirModele;
	private JTextField voirCouleur;
	private JTextField voirPrix;
	private JTextField voirNumeroVehicule;
	private JButton voirQuitter;
	private JButton voirValider;
	private JOptionPane quitter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VoirUnVehicule frame = new VoirUnVehicule();
					frame.setVisible(true);
					frame.setTitle("Voir un vehicule");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VoirUnVehicule() {
		vehicules = new ArrayList<Vehicule>();
		voirValider = new JButton("Valider");
		voirQuitter = new JButton("Quitter");
		quitter = new JOptionPane();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
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

		GridBagConstraints gbc_voirValider = new GridBagConstraints();
		gbc_voirValider.insets = new Insets(0, 0, 5, 5);
		gbc_voirValider.gridx = 3;
		gbc_voirValider.gridy = 2;
		contentPane.add(voirValider, gbc_voirValider);
		
		JLabel lblMarque = new JLabel("Marque");
		GridBagConstraints gbc_lblMarque = new GridBagConstraints();
		gbc_lblMarque.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarque.gridx = 0;
		gbc_lblMarque.gridy = 4;
		contentPane.add(lblMarque, gbc_lblMarque);
		
		voirMarque = new JTextField();
		GridBagConstraints gbc_voirMarque = new GridBagConstraints();
		gbc_voirMarque.insets = new Insets(0, 0, 5, 5);
		gbc_voirMarque.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirMarque.gridx = 2;
		gbc_voirMarque.gridy = 4;
		contentPane.add(voirMarque, gbc_voirMarque);
		voirMarque.setColumns(10);
		
		JLabel lblAnnee = new JLabel("Annee");
		GridBagConstraints gbc_lblAnnee = new GridBagConstraints();
		gbc_lblAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnnee.gridx = 0;
		gbc_lblAnnee.gridy = 5;
		contentPane.add(lblAnnee, gbc_lblAnnee);
		
		voirAnnee = new JTextField();
		GridBagConstraints gbc_voirAnnee = new GridBagConstraints();
		gbc_voirAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_voirAnnee.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirAnnee.gridx = 2;
		gbc_voirAnnee.gridy = 5;
		contentPane.add(voirAnnee, gbc_voirAnnee);
		voirAnnee.setColumns(10);
		
		JLabel lblVitesse = new JLabel("Vitesse");
		GridBagConstraints gbc_lblVitesse = new GridBagConstraints();
		gbc_lblVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblVitesse.gridx = 0;
		gbc_lblVitesse.gridy = 6;
		contentPane.add(lblVitesse, gbc_lblVitesse);
		
		voirVitesse = new JTextField();
		GridBagConstraints gbc_voirVitesse = new GridBagConstraints();
		gbc_voirVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_voirVitesse.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirVitesse.gridx = 2;
		gbc_voirVitesse.gridy = 6;
		contentPane.add(voirVitesse, gbc_voirVitesse);
		voirVitesse.setColumns(10);
		
		JLabel lblModele = new JLabel("Modele");
		GridBagConstraints gbc_lblModele = new GridBagConstraints();
		gbc_lblModele.insets = new Insets(0, 0, 5, 5);
		gbc_lblModele.gridx = 0;
		gbc_lblModele.gridy = 7;
		contentPane.add(lblModele, gbc_lblModele);
		
		voirModele = new JTextField();
		GridBagConstraints gbc_voirModele = new GridBagConstraints();
		gbc_voirModele.insets = new Insets(0, 0, 5, 5);
		gbc_voirModele.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirModele.gridx = 2;
		gbc_voirModele.gridy = 7;
		contentPane.add(voirModele, gbc_voirModele);
		voirModele.setColumns(10);
		
		JLabel lblCouleur = new JLabel("Couleur");
		GridBagConstraints gbc_lblCouleur = new GridBagConstraints();
		gbc_lblCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_lblCouleur.gridx = 0;
		gbc_lblCouleur.gridy = 8;
		contentPane.add(lblCouleur, gbc_lblCouleur);
		
		voirCouleur = new JTextField();
		GridBagConstraints gbc_voirCouleur = new GridBagConstraints();
		gbc_voirCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_voirCouleur.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirCouleur.gridx = 2;
		gbc_voirCouleur.gridy = 8;
		contentPane.add(voirCouleur, gbc_voirCouleur);
		voirCouleur.setColumns(10);
		
		JLabel lblPrix = new JLabel("Prix");
		GridBagConstraints gbc_lblPrix = new GridBagConstraints();
		gbc_lblPrix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrix.gridx = 0;
		gbc_lblPrix.gridy = 9;
		contentPane.add(lblPrix, gbc_lblPrix);
		
		voirPrix = new JTextField();
		GridBagConstraints gbc_voirPrix = new GridBagConstraints();
		gbc_voirPrix.insets = new Insets(0, 0, 5, 5);
		gbc_voirPrix.fill = GridBagConstraints.HORIZONTAL;
		gbc_voirPrix.gridx = 2;
		gbc_voirPrix.gridy = 9;
		contentPane.add(voirPrix, gbc_voirPrix);
		voirPrix.setColumns(10);

		GridBagConstraints gbc_voirQuitter = new GridBagConstraints();
		gbc_voirQuitter.insets = new Insets(0, 0, 0, 5);
		gbc_voirQuitter.gridx = 2;
		gbc_voirQuitter.gridy = 11;
		voirQuitter.setBackground(java.awt.Color.red);
		voirQuitter.setForeground(java.awt.Color.white);
		contentPane.add(voirQuitter, gbc_voirQuitter);
		
		this.voirMarque.addActionListener(this);
		this.voirAnnee.addActionListener(this);
		this.voirVitesse.addActionListener(this);
		this.voirModele.addActionListener(this);
		this.voirCouleur.addActionListener(this);
		this.voirPrix.addActionListener(this);
		this.voirValider.addActionListener(this);
		this.voirQuitter.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// l'utilisateur clique sur le bouton "Valider"
		if (e.getSource() == this.voirValider){
			VehiculeDAO vDao = new VehiculeDAO();
			Vehicule vehicule;
			vehicule = new Vehicule();
			// l'utilisateur saisit le numero du vehicule
			int i = Integer.parseInt(voirNumeroVehicule.getText());
			vehicule = vDao.findById(i);
		
			// si le vehicule existe alors les informations s'afficheront dans les TextField
			String marque = vehicule.getMarque();
			int year = vehicule.getYear();
			int speed = vehicule.getSpeed();
			String model = vehicule.getModel();
			String color = vehicule.getColor();
			int price = (int) vehicule.getPrice();
			
			voirMarque.setText("" + marque);
			voirAnnee.setText("" + year);
			voirVitesse.setText("" + speed);
			voirModele.setText("" + model);
			voirCouleur.setText("" + color);
			voirPrix.setText("" + price);
		}
		// l'utilisateur clique sur le bouton "Quitter"
		else if (e.getSource() == this.voirQuitter){
			quitter.showMessageDialog(null,  "Vous allez quitter ce menu", "Quitter", JOptionPane.INFORMATION_MESSAGE);
			// fermer la fenetre
			this.dispose();
		}	
		
	}

}
