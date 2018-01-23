import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter values of length and width of the classroom Display
		 * the area and perimeter of that classroom Ask if the user wants to continue
		 * (y/n) Assume the rooms are perfect rectangles Assume the user will enter
		 * valid numeric
		 */
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while (loop == true) {
			System.out.println("Enter classroom length: ");
			String length = scan.nextLine();
			System.out.println("Enter classroom width: ");
			String width = scan.nextLine();
			Double doubleLength = Double.valueOf(length);
			Double doubleWidth = Double.valueOf(width);
			System.out.println("Area of the classroom is " + (doubleLength * doubleWidth));
			System.out.println("Perimeter of the classroom is " + ((doubleLength + doubleWidth) * 2));
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