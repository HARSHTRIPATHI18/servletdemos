package jdbcbasics;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "welcome!2345");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from account");

			while (rs.next()) {
				int accno = rs.getInt(1);
				String firstName = rs.getString(2);
				String LastName = rs.getString(3);
				int balance = rs.getInt(4);
				System.out.println(accno + "|" + firstName + "|" + LastName + "|" + balance + "");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
