package com.iia.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iia.shop.dao.VehiculeDAO;
import com.iia.shop.entity.Vehicule;

public class Store {

	private static ArrayList<Vehicule> vehicules;
	private static Scanner sc;

	public static void main(String[] args) {
		
		Store.vehicules = new ArrayList<Vehicule>();

		//assets();

		System.out.println("Gestion des véhicules");
		System.out.println("1 - créer un véhicule");
		System.out.println("2 - mettre à jour un véhicule");
		System.out.println("3 - voir tous les véhicules");
		System.out.println("4 - sélectionner un véhicule");
		System.out.println("5 - supprimer un véhicule");

		Store.sc = new Scanner(System.in);

		System.out.println("Votre choix");
		int choice = Store.sc.nextInt();

		Vehicule vehicule;
		VehiculeDAO vDao = new VehiculeDAO();

		switch (choice) {
		case 1:			
			// Création du véhicule
			vehicule = new Vehicule();
			
			// Créer un véhicule
			setVehicule(vehicule);
			create(vehicule);
			vDao.create(vehicule);
			break;
		case 2:			
			System.out.println("Veuillez saisir l'identifiant du véhicule");
			vehicule = read(Store.sc.nextInt());
			displayVehicule(vehicule);
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
			System.out.println("Veuillez saisir l'id du véhicule");
			vehicule = read(Store.sc.nextInt());

			displayVehicule(vehicule);
			
			Vehicule vehicule1 = (Vehicule) vDao.findById(1);
			System.out.println(vehicule1.getMarque());
			break;

		case 5:
			System.out.println("Veuillez saisir l'id du véhicule");
			delete(Store.sc.nextInt());
			vehicule = new Vehicule();
			vDao.delete(vehicule);
			break;
		default:
			break;
		}
	}
	
	private static void create(Vehicule vehicule) {
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
		System.out.println("Modèle : " + vehicule.getModel());
		System.out.println("Couleur : " + vehicule.getColor());
		System.out.println("Année : " + vehicule.getYear());
		System.out.println("Vitesse : " + vehicule.getSpeed());
		System.out.println("Prix : " + vehicule.getPrice());
		System.out.println(" ");
	}

	private static void setVehicule(Vehicule vehicule) {
		System.out.println("Veuillez saisir la marque du véhicule");
		vehicule.setMarque(Store.sc.next());

		System.out.println("Veuillez saisir l'année du véhicule");
		vehicule.setYear(Store.sc.nextInt());

		System.out.println("Veuillez saisir le modèle du véhicule");
		vehicule.setModel(Store.sc.next());

		System.out.println("Veuillez saisir la couleur du véhicule");
		vehicule.setColor(Store.sc.next());

		System.out.println("Veuillez saisir le prix du véhicule");
		vehicule.setPrice(Store.sc.nextDouble());
	}

	/*private static void assets() {
		//Vehicule v1 = new Vehicule("peugeot", 2016, 50, "3008", "blanc", 20000);
		//Vehicule v2 = new Vehicule("audi", 2016, 90, "A5", "noire", 47000);

		//Store.vehicules.add(v1);
		//Store.vehicules.add(v2);
	}*/
}
