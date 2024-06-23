package ticketreservation;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DbConnection {
	private static final String url="jdbc:mysql://localhost:3306/busresv";
	private static final String username="root";
	private static final String password="Mysqlsubi@04";
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url,username,password);
	}
	

}
