import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class LoginController {

	private static String url = "jdbc:postgresql://localhost:8080/tms";
	private static String user = "postgres";
	private static String pass = "1188";
	private static String createTable = "Create table tmsuser(id int, name varchar(50), pass varchar(50));";
	private static String addCustomer = "Insert into tmsuser values(?,?,?)";
	private static Connection con;
	
	public LoginController() {
		con = getConnection();
	}
	private static Connection getConnection() {
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,user,pass);
			Statement stat = con.createStatement();
			stat.execute(createTable);
			System.out.println("Table created Successfully");
			
		}catch(Exception e) {
			System.out.println("Table failed "+e);
		}
		return con;
	}
	
	public static void createTable() {
		try {
			Statement stat = con.createStatement();
			stat.execute(createTable);
			System.out.println("Table created Successfully");
			
		}catch(Exception e) {
			System.out.println("Table failed "+e);
		}
	}
	
	public static void addCustomer(Customer cus) {
		try {
			PreparedStatement p1 = con.prepareStatement(addCustomer);
			p1.setInt(1, cus.getCustomerId());
			p1.setString(2, cus.getCustomerName());
			p1.setString(3, cus.getCustomerPassword());
			p1.execute();
		} catch (Exception e) {
			
		}
	}

	
	
	
	
	
	
	
}
