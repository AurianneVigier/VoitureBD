package com.iia.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	private static final String URL = "jdbc:sqlserver://DESKTOP-CR3KG1O;databaseName=Vehicules;";
	private static final String PASSWORD = "sql2014";
	private static final String LOGIN = "sa";
	private static Connection connection;

	public static Connection getConnection() {
		Connexion.connection = null;
		
		try {
			// chargement du driver SQL Server
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			// lance et récupère la connexion
			Connexion.connection = DriverManager.getConnection(Connexion.URL, Connexion.LOGIN, Connexion.PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Impossible de charger le driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erreur lors de la connexion");
			e.printStackTrace();
		}
		
		return Connexion.connection;
	}
	
	public static void close() {
		try {
			Connexion.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}