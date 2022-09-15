package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.print("What is your start Amount");
int startAmount = in.nextInt();


System.out.print("What is your win Limit ");
int winLimit = in.nextInt();

System.out.println("What is your win Chance?");
double winChance = in.nextDouble();

System.out.print("How many days do you want to play");
int days = in.nextInt();

for (int totalSimulations = 0; totalSimulations<=days; totalSimulations++) {

while ((startAmount > 0) && (startAmount < winLimit))	{
	
	double money = (Math.random());
	if (money<=winChance) {
		startAmount++;
		//System.out.println("you won money, new total is: " + startAmount++);
	}
	else if (money>winChance) {
		startAmount--;
		//System.out.println("you lost money, new total is:" + startAmount--); 
		
		}
	
}
boolean yay= startAmount == winLimit;
System.out.println("number of days: "+ totalSimulations);
System.out.println("number of plays in a day:"+ //number of plays per day );
System.out.println("You had a successful!:" + yay);


	
}

	}

}
