package ticketreservation;
import java.util.Date;
import java.sql.*;
public class bookingDAO {
	public static int getbookedcount(int busno,Date date) throws Exception {
		Connection con =DbConnection.getConnection();
		String query="select count(pasname) from booking where bus_no=? and trav_date=?";
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1,busno);
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void addbooking(Booking booking) throws Exception {
		String query="insert into booking values(?,?,?)";
		Connection con=DbConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		pst.setString(1,booking.pasname);
		pst.setInt(2,booking.busno);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}

}
