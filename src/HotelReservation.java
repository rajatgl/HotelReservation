import java.util.*;

class Hotel
{
	private String name;
	private int normalCustomerRate;
	
	Hotel(String name, int normalCustomerRate){
		this.name = name;
		this.normalCustomerRate = normalCustomerRate;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNormalCustomerRate() {
		return this.normalCustomerRate;
	}
}

public class HotelReservation {
	public static List<Hotel> hotels;
	private static void addHotel(Hotel hotel) {
		hotels.add(hotel);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		hotels = new ArrayList<Hotel>();
		System.out.println("Welcome to Hotel Reservation Software");
		String name;
		int normalRate, choice;
		while(true) {
			System.out.println("Enter choice: 1 for adding hotel, anything else for exit.");
			choice = sc.nextInt();
			sc.nextLine(); //for garbage
			if(choice == 1) {
				System.out.println("Enter Hotel Name: ");
				name = sc.nextLine();
				System.out.println("Enter Hotel Normal Rate: ");
				normalRate = sc.nextInt();
				
				addHotel(new Hotel(name, normalRate));
			}
			else {
				System.out.println("Exiting... Added " + hotels.size() + " hotels.");
				break;
			}
		}
	}
}
