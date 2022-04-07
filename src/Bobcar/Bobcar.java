package project1;

import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Available cars: ");
		System.out.println("1 for economy, 2 for compact, 3 standard");
		System.out.print("Please choose a rental: ");
		int car = input.nextInt();
		int rental = 0;
		String typeCar = "0";

		if (car == 1) {
			System.out.println ("You have chosen an economy car.");
			rental = 35;
			typeCar = "economy";
			// economy = "$35";
		}
		else if (car == 2) {
			System.out.println ("You have chosen a compact car.");
			rental = 45;
			typeCar = "compact";
			// compact = "$45";
		}
		else if (car == 3) {
			System.out.println ("You have chosen a standard car.");
			rental = 95;
			typeCar = "standard";
			// standard = "$95";
		}
		else {
			System.out.println ("Not an option.");
		}

		System.out.print ("Please enter the number of rental days: ");
		int day = input.nextInt();

		double base = rental * day;

		System.out.println ("Are you a club member? ");
		System.out.println ("1 for Yes, 2 for No");
		System.out.print(" ");
		int club = input.nextInt();

		int discount = 0;
		double platPrice = 0;
		double total = 0;

		if (club == 1) {
			discount = ((int)(day / 7) *  rental);
			System.out.println ("Would you like the Platinum Executive Package?");
			System.out.println ("1 for Yes, 2 for No");
			System.out.print(" ");
			int plat = input.nextInt();
			if (plat == 1) {
				System.out.println ("You have chosen the Platinum Executive Package.");
				platPrice = 0.15 * base;
				total = base - discount + platPrice;
				System.out.println (" ");

				System.out.print ("Base: " + day + " days for " + typeCar + " @ $" + rental + " per day: "  );
				System.out.println ("$ " + base);

				System.out.print ("Club Member Discount: ");
				System.out.println ("$ " + discount);

				System.out.print ("Platinum Executive Package: ");
				System.out.println ("$ " + platPrice);

				System.out.println (" ");

				System.out.print ("Total Estimate for Rental: ");
				System.out.println ("$ " + total);
			}
			else if (plat == 2){
				System.out.println ("No Platinum Executive Package.");
				total = base - discount;
				System.out.println (" ");

				System.out.print ("Base: " + day + " days for " + typeCar + " @ $" + rental + " per day: "  );
				System.out.println ("$ " + base);

				System.out.print ("Club Member Discount: ");
				System.out.println ("$ " + discount);

				System.out.println (" ");

				System.out.print ("Total Estimate for Rental: ");
				System.out.println ("$ " + total);
			}

		}
		else if (club == 2) {
			System.out.println ("No club discount.");
			total = base;
			System.out.println (" ");

			System.out.print ("Base: " + day + " days for " + typeCar + " @ $" + rental + " per day: "  );
			System.out.println ("$ " + base);

			System.out.println (" ");

			System.out.print ("Total Estimate for Rental: ");
			System.out.println ("$ " + total);
		}

		input.close();
	}

}

