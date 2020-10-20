import java.util.*;
import java.text.SimpleDateFormat;  
class Hotel
{
	private String name;
	private int normalCustomerRate;
	
	Hotel(String name, int normalCustomerRate){
		this.name = name;
		this.normalCustomerRate = normalCustomerRate;
	}
	
	Hotel(){}
	
	public String getName() {
		return this.name;
	}
	
	public int getNormalCustomerRate() {
		return this.normalCustomerRate;
	}
}

public class HotelReservation {
	public static final int INT_MAX=63315;
	public static List<Hotel> hotels;
	private static void addHotel(Hotel hotel) {
		hotels.add(hotel);
	}
	private static Hotel getCheapestHotel(int days) {
		long cost = 100000000;
		Hotel cheapestHotel = new Hotel();
		for(Hotel hotel : hotels) {
			if(cost > hotel.getNormalCustomerRate() * days) {
				cost = hotel.getNormalCustomerRate() * days;
				cheapestHotel = new Hotel(hotel.getName(), hotel.getNormalCustomerRate());
			}
		}
		return cheapestHotel;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		hotels = new ArrayList<Hotel>();
		System.out.println("Welcome to Hotel Reservation Software");
		
		hotels.add(new Hotel("Lakewood", 100));
		hotels.add(new Hotel("Bridgewood", 150));
		hotels.add(new Hotel("Ridgewood", 120));
		
		while(true) {
			System.out.println("Enter Dates: Seperate dates with comma");
			String dates = sc.nextLine();
			String[] dateArray = dates.split(",");
			
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy");  
			
			Date dateStart = new Date();
			try {
				dateStart = formatter.parse(dateArray[0]);
			}
			catch(Exception e) {
				//empty catch
			}
			
			Date dateEnd = new Date();
			try {
				dateEnd = formatter.parse(dateArray[1]);
			}
			catch(Exception e) {
				//empty catch
			} 
			
			long difference = dateEnd.getTime() - dateStart.getTime();
		    float daysBetween = (difference / (1000*60*60*24));
		    
		    System.out.println("Days Between " + daysBetween);
			
			Hotel cheapestHotel = getCheapestHotel((int)Math.ceil(daysBetween));			
			System.out.println("Hotel Name: " + cheapestHotel.getName() + " Total Rate is: " + cheapestHotel.getNormalCustomerRate() * daysBetween);
		}
	}
}
