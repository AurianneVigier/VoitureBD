package com.iia.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iia.shop.dao.VehiculeDAO;
import com.iia.shop.entity.Vehicule;

import javax.swing.JFrame;

public class Store {
	
	private static ArrayList<Vehicule> vehicules;
	private static Scanner sc;

	public static void main(String[] args) {
		
		Menu choisirAction = new Menu();
		
		choisirAction.setVisible(true); // visibilite de la fenetre
		
		Store.vehicules = new ArrayList<Vehicule>();

		//assets();

		System.out.println("Gestion des v�hicules");
		System.out.println("1 - cr�er un v�hicule");
		System.out.println("2 - mettre � jour un v�hicule");
		System.out.println("3 - voir tous les v�hicules");
		System.out.println("4 - s�lectionner un v�hicule");
		System.out.println("5 - supprimer un v�hicule");

		Store.sc = new Scanner(System.in);

		System.out.println("Votre choix");
		int choice = Store.sc.nextInt();

		Vehicule vehicule;
		VehiculeDAO vDao = new VehiculeDAO();

		switch (choice) {
		case 1:			
			// Cr�ation du v�hicule
			vehicule = new Vehicule();
			
			// Cr�er un v�hicule
			setVehicule(vehicule);
			create(vehicule);
			vDao.create(vehicule);
			break;
		case 2:			
			System.out.println("Veuillez saisir l'identifiant du v�hicule");
			vehicule = new Vehicule();
			vehicule.setId(sc.nextInt());
			setVehicule(vehicule);
			
			vDao.update(vehicule);
			break;
		case 3:			
			vehicules = (ArrayList<Vehicule>) vDao.findAll();
			for (Vehicule voiture2 : vehicules) {
				displayVehicule(voiture2);
			}
			
			break;
		case 4:
			System.out.println("Veuillez saisir l'id du v�hicule");
			vehicule = read(sc.nextInt());

			displayVehicule(vehicule);
			break;

		case 5:
			System.out.println("Veuillez saisir l'id du v�hicule");
			vehicule = new Vehicule();
			vehicule.setId(sc.nextInt());
			vDao.delete(vehicule);
			break;
		default:
			break;
		}
	}
	// private avant
	public static void create(Vehicule vehicule) {
		Store.vehicules.add(vehicule);
	}

	private static void delete(int index) {
		Store.vehicules.remove(index);
	}

	private static ArrayList<Vehicule> readAll() {
		return Store.vehicules;
	}

	private static Vehicule read(int index) {
		return Store.vehicules.get(index);
	}

	private static void displayVehicule(Vehicule vehicule) {
		System.out.println("Marque : " + vehicule.getMarque());
		System.out.println("Mod�le : " + vehicule.getModel());
		System.out.println("Couleur : " + vehicule.getColor());
		System.out.println("Ann�e : " + vehicule.getYear());
		System.out.println("Vitesse : " + vehicule.getSpeed());
		System.out.println("Prix : " + vehicule.getPrice());
		System.out.println(" ");
	}

	private static void setVehicule(Vehicule vehicule) {
		System.out.println("Veuillez saisir la marque du v�hicule");
		vehicule.setMarque(Store.sc.next());

		System.out.println("Veuillez saisir l'ann�e du v�hicule");
		vehicule.setYear(Store.sc.nextInt());
		
		System.out.println("Veuillez saisir la vitesse du v�hicule");
		vehicule.setSpeed(Store.sc.nextInt());

		System.out.println("Veuillez saisir le mod�le du v�hicule");
		vehicule.setModel(Store.sc.next());

		System.out.println("Veuillez saisir la couleur du v�hicule");
		vehicule.setColor(Store.sc.next());

		System.out.println("Veuillez saisir le prix du v�hicule");
		vehicule.setPrice(Store.sc.nextDouble());
	}

	/*private static void assets() {
		//Vehicule v1 = new Vehicule("peugeot", 2016, 50, "3008", "blanc", 20000);
		//Vehicule v2 = new Vehicule("audi", 2016, 90, "A5", "noire", 47000);

		//Store.vehicules.add(v1);
		//Store.vehicules.add(v2);
	}*/
}
