package com.iia.shop.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.List;

import com.iia.shop.entity.Vehicule;

public class VehiculeDAO implements IDAO<Vehicule>{
	private static final String MARQUE = "Brand";
	private static final String ANNEE = "Year";
	private static final String VITESSE = "Speed";
	private static final String MODELE = "Model";
	private static final String COULEUR = "Color";
	private static final String PRIX = "Price";
	private static final String NOMTABLE = "Voitures";
	private static final String ID = "Id";

	@Override
	public boolean create(Vehicule object) {
		String req = "INSERT INTO " + VehiculeDAO.NOMTABLE + " (" + VehiculeDAO.MARQUE + ", " + VehiculeDAO.ANNEE
				+ ", " + VehiculeDAO.VITESSE + ", " + VehiculeDAO.MODELE + ", " + VehiculeDAO.COULEUR
				+ ", " + VehiculeDAO.PRIX
				+ ") VALUES ('" + object.getMarque() + "', '" + object.getYear() + "', '" + object.getSpeed() + "', '"
				+ object.getModel() + "', '" + object.getColor() + "', '" + object.getPrice() + "')";

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			if (st.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de l'insertion de la voiture");
		}

		return false;
	}

	@Override
	public boolean update(Vehicule object) {
		String req = String.format("UPDATE %s SET %s=%s, %s=%s, %s=%s, %s=%s, %s=%s, %s=%s WHERE %s=?",
				VehiculeDAO.NOMTABLE,
				VehiculeDAO.MARQUE,
				object.getMarque(),
				VehiculeDAO.ANNEE,
				object.getYear(),
				VehiculeDAO.VITESSE,
				object.getSpeed(),
				VehiculeDAO.MODELE,
				object.getModel(),
				VehiculeDAO.COULEUR,
				object.getColor(),
				VehiculeDAO.PRIX,
				object.getPrice(),
				VehiculeDAO.ID);
		
		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			st.setInt(1, object.getId());
			if (st.executeUpdate() >= 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de la mise � jour de la voiture");
		}
		return false;
	}

	@Override
	public boolean delete(Vehicule object) {
		String req = String.format("DELETE FROM %s WHERE %s=?",
				VehiculeDAO.NOMTABLE,
				VehiculeDAO.ID);

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			st.setInt(1, object.getId());
			if (st.executeUpdate() >= 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de la suppression de la voiture");
		}
		return false;
	}

	@Override
	public Vehicule findById(int id) {
		String req = String.format("SELECT * FROM %s WHERE %s=%d", VehiculeDAO.NOMTABLE, VehiculeDAO.ID, id);

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				return this.cursorToVehicule(rs);
			}
		} catch (SQLException e) {
			System.out.println("Erreur lors de la r�cup�ration de la voiture");
		}
		return null;
	}

	@Override
	public List<Vehicule> findAll() {
		List<Vehicule> vehicules = new ArrayList<Vehicule>();

		String req = String.format("SELECT * FROM %s", VehiculeDAO.NOMTABLE);

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				vehicules.add(this.cursorToVehicule(rs));
			}

			return vehicules;

		} catch (SQLException e) {
			System.out.println("Erreur lors de la r�cup�ration des voitures");
		}

		return null;
	}
	
	private Vehicule cursorToVehicule(ResultSet resultSet) {
		Vehicule vehicule = null;
		try {
			vehicule = new Vehicule();
			vehicule.setId(resultSet.getInt(VehiculeDAO.ID));
			vehicule.setMarque(resultSet.getString(VehiculeDAO.MARQUE));
			vehicule.setYear(resultSet.getInt(VehiculeDAO.ANNEE));
			vehicule.setSpeed(resultSet.getInt(VehiculeDAO.VITESSE));
			vehicule.setModel(resultSet.getString(VehiculeDAO.MODELE));
			vehicule.setColor(resultSet.getString(VehiculeDAO.COULEUR));
			vehicule.setPrice(resultSet.getInt(VehiculeDAO.PRIX));
		} catch (SQLException e) {
			System.out.println("Erreur lors de la r�cup�ration de la voiture");
		}

		return vehicule;
	}
}
