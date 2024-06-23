package ticketreservation;
import java.text.ParseException;
import java.util.Scanner;
public class Busdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		busDAO busdao = new busDAO();
		busdao.displaybusinfo();
		Scanner sc=new Scanner(System.in);
		int useropt=1;
		while(useropt==1) {
			System.out.println("Enter 1 to Book and Enter 2 to Exit");
			useropt=sc.nextInt();
			if(useropt==1) {
				Booking booking = null;
				try {
					booking = new Booking();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(booking.isAvailable()) {
					bookingDAO bookingdao=new bookingDAO();
					bookingdao.addbooking(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry,unavailable");
				}
			}
			
		}
		sc.close();

	}

}
