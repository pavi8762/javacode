package AutomatedTests;

import java.sql.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.net.URLClassLoader;

public class DatabaseConnection{
	private static final String db = "jdbc:mysql://localhost:3306/coolthings";
	private static final String user = "root";
	private static final String pwd = "root";
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	private static PreparedStatement pstmt;
	
	public void Connection()  throws FileNotFoundException {
	
	
		
		
	
		//Prepared statement
		
		String query2 = "Insert into coolthings.Mobiles (Samsung_mobiles) values (?)";
		
		Scanner s2 = new Scanner(System.in	);
		
		char ans = ' ';
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con=DriverManager.getConnection(db, user, pwd);
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(query2);
			FileReader reader = new FileReader ("D:/Automation testing/Phase-1/Result/searchres.txt");
			pstmt.setCharacterStream(1, reader);
			pstmt.execute();
						
			
			int ret = pstmt.executeUpdate();
		
			if (ret == 1) {
				System.out.println("Enter C for Confirm  or A for Abort:");
				ans = s2.nextLine().charAt(0);
				if (ans == 'C') {
					con.commit();
					System.out.println("Successfully added a new record");
				}
				else {
					con.rollback();
					System.out.println("Aborted the transaction");
				}
			}
			else {
				System.out.println("Unable to add a new record");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
			con.close();
			pstmt.close();
			s2.close();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
	    }
	}

	

	

	
	
}

	
	
	
	


	