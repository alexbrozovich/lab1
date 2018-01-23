import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//keeps the program looping until the user says not to continue
		boolean loop = true;
		while (loop == true) {
			//takes user input for classroom length and width
			System.out.println("Enter classroom length: ");
			String length = scan.nextLine();
			System.out.println("Enter classroom width: ");
			String width = scan.nextLine();
			
			//converts user input to double for easy addition / multiplication
			Double doubleLength = Double.valueOf(length);
			Double doubleWidth = Double.valueOf(width);
			
			//calculate and print requested data
			System.out.println("Area of the classroom is " + (doubleLength * doubleWidth));
			System.out.println("Perimeter of the classroom is " + ((doubleLength + doubleWidth) * 2));
			
			//check to make sure the user input is good. if it isn't y or n, this section will keep repeating until it gets a real answer
			Boolean goodInput = false;
			while (goodInput == false) {
				System.out.println("Would you like to continue? (y/n)");
				String userIn = scan.nextLine();
				System.out.println(userIn);
				char YN = userIn.charAt(0);
				if (YN == 'y') {
					goodInput = true;
					loop = true;
				} else if (YN == 'n') {
					goodInput = true;
					loop = false;
					System.out.println("Bye!");
				} else {
					System.out.println("I didn't understand that, please try again.");
				}
			}
		}
		scan.close();
	}
}