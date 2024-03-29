import java.util.Scanner;
	public class haversine { 
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	final int EarthRad = 6371; //radius of earth
	
	System.out.print("Please enter your origin latitude: ");
	double mylat = scan.nextDouble();  //example: Maynooth = 53.381289599999995
	System.out.println("Your Latitude -> " + mylat);
  
	System.out.println("Please enter your origin longitude: ");
	double mylong = scan.nextDouble(); //example: Maynooth = -6.591849899999943
	System.out.println("Your Longitude -> " + mylong);
	
	System.out.println("Please enter your destination latitude: ");
	double destlat = scan.nextDouble();       // example: Pyongyang = 39.0366364
	System.out.println("Destination Latitude -> " + destlat);
	
	System.out.println("Please enter your destination longitude: ");
	double destlong = scan.nextDouble(); //example: Pyongyang = 125.73091870000007
	System.out.println("Destination Longitude -> " + destlat);
	
	mylat = Math.toRadians(mylat);
	mylong = Math.toRadians(mylong);
	
	destlat = Math.toRadians(destlat);
	destlong = Math.toRadians(destlong);
	
	double latDistance = (destlat-mylat);
	double longdistance = (destlong-mylong);
	
	double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
           Math.cos(mylat) * Math.cos(destlat) * 
            Math.sin(longdistance / 2) * Math.sin(longdistance / 2);
	
	double b = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	double distance = EarthRad * b;
	
	System.out.println("The distance between your origin and destination is : " + distance + " Kilometeres");
	
	
	
}


}
