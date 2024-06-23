package ticketreservation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String pasname;
	int busno;
	Date date;
	Booking() throws ParseException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		pasname=sc.next();
		System.out.println("Enter busno : ");
		busno=sc.nextInt();
		System.out.println("Enter date : ");
		String datin=sc.next();
		SimpleDateFormat dates=new SimpleDateFormat("dd-MM-yyyy");
		date=dates.parse(datin);
		
	}
	public boolean isAvailable()throws Exception {
		busDAO busdao=new busDAO();
		int capacity=busdao.getcapacity(busno);
		bookingDAO bookingdao=new bookingDAO();
		int booked=bookingDAO.getbookedcount(busno,date);
		return booked<capacity?true:false;
	}

}
