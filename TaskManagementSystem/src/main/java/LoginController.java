import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class LoginController {

	private static String url = "jdbc:postgresql://localhost:5432/tms";
	private static String user = "postgres";
	private static String pass = "1188";
	private static String createTable = "Create table tmsuserdata(id varchar(50), name varchar(50), pass varchar(50));";
	private static String addCustomer = "Insert into tmsuserdata values(?,?,?)";
	private static Connection con;
	

	public static Connection getConnection() {
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,user,pass);
			
		}catch(Exception e) {
			System.out.println("Table failed "+e);
		}
		return con;
	}
	
	public static void createTable() {
		try {
			con = getConnection();
			Statement stat = con.createStatement();
			stat.execute(createTable);
			System.out.println("Table created Successfully");
			
		}catch(Exception e) {
			System.out.println("Table failed "+e);
		}
	}
	
	public static void addCustomer(Customer cus) {
		try {
			con = getConnection();
			PreparedStatement p1 = con.prepareStatement(addCustomer);
			p1.setString(1, cus.getCustomerId());
			p1.setString(2, cus.getCustomerName());
			p1.setString(3, cus.getCustomerPassword());
			p1.execute();
			System.out.println(cus+" is added");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
}
