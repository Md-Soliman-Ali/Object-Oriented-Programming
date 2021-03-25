package Interface;

public class User {
	
	public static void main (String[]args)
	{
		CheapFlight cheapflight = new Emirates();
		cheapflight.getAllAvailableFlight();
		
		CheapFlight cheapflight2 = new UsBangla();
		cheapflight2.getAllAvailableFlight();
	}
}
