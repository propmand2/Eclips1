package DB;

import java.sql.*;
import java.util.*;

public class Madliste {

	private static Connection connection;

	public static void main(String[] args) {
		if (!loadJdbcDriver())
			System.exit(1);

		if (!openConnection("MadlisteDB2"))
			System.exit(2);
		
		Mad mad = new Mad(7, "kage");
		if (addStudent(mad))
	      System.out.println(mad);
	}

	private static boolean updateMad(Mad mad) {
		try {
			String sql = "UPDATE Mkal " + "SET navn='" + mad.getNavn();
			System.out.println(sql);

			Statement statement = connection.createStatement();
			int nRows = statement.executeUpdate(sql);

			return (nRows == 1);
		} catch (SQLException e) {
			System.out.println("Could not update Mad: " + mad);
			return false;
		}
	}

	private static boolean addStudent(Mad mad) {
		try {
			String sql = "INSERT INTO Mkal " + "VALUES ('" + mad.getNavn();
			System.out.println(sql);

			Statement statement = connection.createStatement();
			int nRows = statement.executeUpdate(sql);

			if (nRows != 1)
				return false;

			// get auto-generated key
			ResultSet resultSet = statement.executeQuery("SELECT SCOPE_IDENTITY()");

			if (resultSet.next()) {
				int id = resultSet.getInt(1);
				mad.setId(id);
			}

			return true;
		} catch (SQLException e) {
			System.out.println("Could not add mad: " + mad);
			return false;
		}
	}

	private static boolean loadJdbcDriver() {
		try {
			System.out.println("Loading JDBC driver...");

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			System.out.println("JDBC driver loaded");

			return true;
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load JDBC driver!");
			return false;
		}
	}

	private static boolean openConnection(String databaseName) {
		String connectionString = "jdbc:sqlserver://localhost:1433;" + "instanceName=SQLEXPRESS;" + "databaseName="
				+ databaseName + ";" + "integratedSecurity=true;";

		connection = null;

		try {
			System.out.println("Connecting to database...");

			connection = DriverManager.getConnection(connectionString);

			System.out.println("Connected to database");

			return true;
		} catch (SQLException e) {
			System.out.println("Could not connect to database!");
			System.out.println(e.getMessage());

			return false;
		}
	}
}
