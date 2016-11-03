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
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class AjouterVehicule extends JFrame implements ActionListener{

	private static ArrayList<Vehicule> vehicules;
	private JPanel contentPane;
	private JTextField ajouterMarque;
	private JTextField ajouterAnnee;
	private JTextField ajouterVitesse;
	private JTextField ajouterModele;
	private JTextField ajouterCouleur;
	private JTextField ajouterPrix;
	private JButton ajouterValider;
	private JButton ajouterAnnuler;
	private JOptionPane ajouter;
	private JOptionPane annuler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterVehicule frame = new AjouterVehicule();
					frame.setVisible(true);
					frame.setTitle("Ajouter un vehicule");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjouterVehicule() {
		vehicules = new ArrayList<Vehicule>();
		JLabel lblMarque = new JLabel("Marque");
		JLabel lblAnnee = new JLabel("Annee");
		JLabel lblVitesse = new JLabel("Vitesse");
		JLabel lblModele = new JLabel("Modele");
		JLabel lblCouleur = new JLabel("Couleur");
		JLabel lblPrix = new JLabel("Prix");
		ajouterValider = new JButton("Valider");
		ajouterAnnuler = new JButton("Annuler");
		ajouter = new JOptionPane();
		annuler = new JOptionPane();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{76, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		GridBagConstraints gbc_lblMarque = new GridBagConstraints();
		gbc_lblMarque.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarque.gridx = 0;
		gbc_lblMarque.gridy = 2;
		contentPane.add(lblMarque, gbc_lblMarque);
		
		ajouterMarque = new JTextField();
		GridBagConstraints gbc_ajouterMarque = new GridBagConstraints();
		gbc_ajouterMarque.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterMarque.fill = GridBagConstraints.HORIZONTAL;
		gbc_ajouterMarque.gridx = 1;
		gbc_ajouterMarque.gridy = 2;
		contentPane.add(ajouterMarque, gbc_ajouterMarque);
		ajouterMarque.setColumns(10);
		
		GridBagConstraints gbc_lblAnnee = new GridBagConstraints();
		gbc_lblAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnnee.gridx = 0;
		gbc_lblAnnee.gridy = 3;
		contentPane.add(lblAnnee, gbc_lblAnnee);
		
		ajouterAnnee = new JTextField();
		GridBagConstraints gbc_ajouterAnnee = new GridBagConstraints();
		gbc_ajouterAnnee.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterAnnee.fill = GridBagConstraints.HORIZONTAL;
		gbc_ajouterAnnee.gridx = 1;
		gbc_ajouterAnnee.gridy = 3;
		contentPane.add(ajouterAnnee, gbc_ajouterAnnee);
		ajouterAnnee.setColumns(10);
		
		GridBagConstraints gbc_lblVitesse = new GridBagConstraints();
		gbc_lblVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblVitesse.gridx = 0;
		gbc_lblVitesse.gridy = 4;
		contentPane.add(lblVitesse, gbc_lblVitesse);
		
		ajouterVitesse = new JTextField();
		GridBagConstraints gbc_ajouterVitesse = new GridBagConstraints();
		gbc_ajouterVitesse.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterVitesse.fill = GridBagConstraints.HORIZONTAL;
		gbc_ajouterVitesse.gridx = 1;
		gbc_ajouterVitesse.gridy = 4;
		contentPane.add(ajouterVitesse, gbc_ajouterVitesse);
		ajouterVitesse.setColumns(10);
		
		GridBagConstraints gbc_lblModele = new GridBagConstraints();
		gbc_lblModele.insets = new Insets(0, 0, 5, 5);
		gbc_lblModele.gridx = 0;
		gbc_lblModele.gridy = 5;
		contentPane.add(lblModele, gbc_lblModele);
		
		ajouterModele = new JTextField();
		GridBagConstraints gbc_ajouterModele = new GridBagConstraints();
		gbc_ajouterModele.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterModele.fill = GridBagConstraints.HORIZONTAL;
		gbc_ajouterModele.gridx = 1;
		gbc_ajouterModele.gridy = 5;
		contentPane.add(ajouterModele, gbc_ajouterModele);
		ajouterModele.setColumns(10);
		
		GridBagConstraints gbc_lblCouleur = new GridBagConstraints();
		gbc_lblCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_lblCouleur.gridx = 0;
		gbc_lblCouleur.gridy = 6;
		contentPane.add(lblCouleur, gbc_lblCouleur);
		
		ajouterCouleur = new JTextField();
		GridBagConstraints gbc_ajouterCouleur = new GridBagConstraints();
		gbc_ajouterCouleur.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterCouleur.fill = GridBagConstraints.HORIZONTAL;
		gbc_ajouterCouleur.gridx = 1;
		gbc_ajouterCouleur.gridy = 6;
		contentPane.add(ajouterCouleur, gbc_ajouterCouleur);
		ajouterCouleur.setColumns(10);
		
		GridBagConstraints gbc_lblPrix = new GridBagConstraints();
		gbc_lblPrix.anchor = GridBagConstraints.NORTH;
		gbc_lblPrix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrix.gridx = 0;
		gbc_lblPrix.gridy = 7;
		contentPane.add(lblPrix, gbc_lblPrix);
		
		ajouterPrix = new JTextField();
		GridBagConstraints gbc_ajouterPrix = new GridBagConstraints();
		gbc_ajouterPrix.insets = new Insets(0, 0, 5, 5);
		gbc_ajouterPrix.fill = GridBagConstraints.HORIZONTAL;
		gbc_ajouterPrix.gridx = 1;
		gbc_ajouterPrix.gridy = 7;
		contentPane.add(ajouterPrix, gbc_ajouterPrix);
		ajouterPrix.setColumns(10);		
		
		GridBagConstraints gbc_ajouterValider = new GridBagConstraints();
		gbc_ajouterValider.insets = new Insets(0, 0, 0, 5);
		gbc_ajouterValider.gridx = 1;
		gbc_ajouterValider.gridy = 9;
		ajouterValider.setBackground(java.awt.Color.green);
		contentPane.add(ajouterValider, gbc_ajouterValider);
		
		GridBagConstraints gbc_ajouterAnnuler = new GridBagConstraints();
		gbc_ajouterAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_ajouterAnnuler.gridx = 2;
		gbc_ajouterAnnuler.gridy = 9;
		ajouterAnnuler.setBackground(java.awt.Color.red);
		ajouterAnnuler.setForeground(java.awt.Color.white);
		contentPane.add(ajouterAnnuler, gbc_ajouterAnnuler);
		
		this.ajouterMarque.addActionListener(this);
		this.ajouterAnnee.addActionListener(this);
		this.ajouterVitesse.addActionListener(this);
		this.ajouterModele.addActionListener(this);
		this.ajouterCouleur.addActionListener(this);
		this.ajouterPrix.addActionListener(this);
		this.ajouterValider.addActionListener(this);
		this.ajouterAnnuler.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// l'utilisateur clique sur le bouton "Valider"
		if (e.getSource() == this.ajouterValider){
			VehiculeDAO vDao = new VehiculeDAO();
			Vehicule vehicule;
			vehicule = new Vehicule();
			
			// appel de la fonction "ajouter" qui ajoute une voiture avec les informations renseignees par l'utilisateur
			ajouter(vehicule);			
			vDao.create(vehicule);
			ajouter.showConfirmDialog(null,  "Etes-vous sur de vouloir ajouter ce vehicule ?", "Ajouter un vehicule", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			this.dispose(); // quitte la fenetre de l'ajout
		}
		// l'utilisateur clique sur le bouton "Annuler"
		else if (e.getSource() == this.ajouterAnnuler){
			annuler.showMessageDialog(null,  "Vous allez quitter le menu ajout", "Annulation de l'ajout", JOptionPane.INFORMATION_MESSAGE);
			// fermer la fenetre
			this.dispose();
		}	
	}
	
	public void ajouter(Vehicule vehicule){
		int res = 0;
		vehicule.setMarque(ajouterMarque.getText());
		res = Integer.parseInt(ajouterAnnee.getText());
		vehicule.setYear(res);
		res = Integer.parseInt(ajouterVitesse.getText());
		vehicule.setSpeed(res);
		vehicule.setModel(ajouterModele.getText());
		vehicule.setColor(ajouterCouleur.getText());
		res = Integer.parseInt(ajouterPrix.getText());
		vehicule.setPrice(res);		
		vehicules.add(vehicule);
	}

}
