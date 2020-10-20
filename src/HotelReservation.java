import java.util.*;

class Hotel
{
	private String name;
	private int rewardCustomerRate;
	private int normalCustomerRate;
	
	Hotel(String name, int rewardCustomerRate, int normalCustomerRate){
		this.name = name;
		this.normalCustomerRate = normalCustomerRate;
		this.rewardCustomerRate = rewardCustomerRate;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRewardCustomerRate() {
		return this.rewardCustomerRate;
	}
	
	public int getNormalCustomerRate() {
		return this.normalCustomerRate;
	}
}

public class HotelReservation {
	
	public static List<Hotel> hotels;
	
	public static void main(String args[])
	{
		hotels = new ArrayList<Hotel>();
		System.out.println("Welcome to Hotel Reservation Software");
	}

}
