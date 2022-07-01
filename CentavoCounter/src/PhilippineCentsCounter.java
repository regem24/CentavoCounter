import java.util.Scanner;

public class PhilippineCentsCounter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int onePeso = 0;

		// input number of centavo
		System.out.print("Enter Centavos: ");
		int cents = in.nextInt();

		// display if cents is zero/negative value
		if (cents <= 0) {
			System.out.println("You enter no value.");
		}

		else {
			// get the peso coin
			if (cents >= 100) {
				onePeso = cents / 100;
			}
			// get remaining cents after extracting peso coin
			int rem = cents % 100;
			
			// get the 25-cent
			int twentyFiveCent = rem / 25;
			
			// get remaining cents after extracting 25-cent
			int rem25 = rem % 25;
			
			// get the 10-cent
			int tenCent = rem25 / 10;
			
			// get remaining cents after extracting 10-cent
			int rem10 = rem25 % 10;

			// get the 5-cent
			int fiveCent = rem10 / 5;
			
			// get the 1-cent
			int oneCent = rem10 % 5;

			//display 
			System.out.println("You can have " + onePeso + " peso coin, " + twentyFiveCent + " 25-cent, " + tenCent
					+ " 10-cent, " + fiveCent + " 5-cent and " + oneCent + " 1-cent.");
		}
		in.close();
	}
	
}