package quiz1;
import java.util.*;
public class Quiz1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your feet:");
	    int feet = in.nextInt();
	    System.out.print("Enter your inches:");
	    int inch = in.nextInt();	
	    System.out.println("Your height is:" + feet + "'" + inch + "''");
	    int totalinch = (12*feet + inch);
	    System.out.println("Total inches:" + totalinch);
	    System.out.println("Ideal weight of male:" + (50 + (totalinch-60)*6) + "kg" );
	    System.out.println("Ideal weight of female:" + (40 + (totalinch-60)*5) + "kg");
		
		
		   

	}

}
