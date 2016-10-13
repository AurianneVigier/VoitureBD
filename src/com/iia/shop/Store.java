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

		System.out.println("Gestion des v�hicules");
		System.out.println("1 - cr�er un v�hicule");
		System.out.println("2 - mettre � jour un v�hicule");
		System.out.println("3 - voir tous les v�hicules");
		System.out.println("4 - s�lectionner un v�hicule");
		System.out.println("5 - supprimer un v�hicule");

		Store.sc = new Scanner(System.in);

		System.out.println("Votre choix");
		int choice = Store.sc.nextInt();

		Vehicule vehicule = null;
		VehiculeDAO vDao = new VehiculeDAO();

		switch (choice) {
		case 1:
			/*vehicule = new Vehicule();
			create(vehicule);*/
			
			// Cr�ation du v�hicule
			vDao = new VehiculeDAO();
			
			// Cr�er un v�hicule
			Vehicule newVehicule = new Vehicule();
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
			boolean result = vDao.create(newVehicule);
			
			System.out.println("resultat : " + result);
			
			break;
		case 2:
			/*System.out.println("Veuillez saisir l'id du v�hicule");
			vehicule = read(Store.sc.nextInt());
			
			displayVehicule(vehicule);
			setVehicule(vehicule);*/
			
			
			break;
		case 3:
			/*ArrayList<Vehicule> vehicules = readAll();

			for (Vehicule vehicule2 : vehicules) {
				displayVehicule(vehicule2);
			}*/
			
			List<Vehicule> voitures = vDao.findAll();
			for (Vehicule voiture2 : voitures) {
				System.out.println(voiture2.getId());
			}
			
			break;

		case 4:
			/*System.out.println("Veuillez saisir l'id du v�hicule");
			vehicule = read(Store.sc.nextInt());

			displayVehicule(vehicule);*/
			
			Vehicule vehicule1 = (Vehicule) vDao.findById(1);
			System.out.println(vehicule1.getMarque());
			break;

		case 5:
			/*System.out.println("Veuillez saisir l'id du v�hicule");
			delete(Store.sc.nextInt());*/
			result = vDao.delete(vehicule);
			System.out.println("resultat : " + result);
			
			break;
		default:
			break;
		}
	}
	
	/*private static void create(Vehicule vehicule) {
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

		System.out.println("Veuillez saisir le mod�le du v�hicule");
		vehicule.setModel(Store.sc.next());

		System.out.println("Veuillez saisir la couleur du v�hicule");
		vehicule.setColor(Store.sc.next());

		System.out.println("Veuillez saisir le prix du v�hicule");
		vehicule.setPrice(Store.sc.nextDouble());
	}

	private static void assets() {
		//Vehicule v1 = new Vehicule("peugeot", 2016, 50, "3008", "blanc", 20000);
		//Vehicule v2 = new Vehicule("audi", 2016, 90, "A5", "noire", 47000);

		//Store.vehicules.add(v1);
		//Store.vehicules.add(v2);
	}*/
}