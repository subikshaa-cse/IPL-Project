package ticketreservation;
import java.sql.*;
import java.sql.DriverManager;

public class busDAO {
	public void displaybusinfo() throws Exception {
		String query="select * from bus;";
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()){
			System.out.println("Busno: "+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.println("AC : no");
			}
			else {
				System.out.println("AC : yes");
			}
			System.out.println("cpacity: "+rs.getInt(3));
		}
		System.out.println("_________________");
		
	}
	public int getcapacity(int id) throws Exception{
		String query="select capacity from bus where busno="+id+";";
		Connection con =DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

}
