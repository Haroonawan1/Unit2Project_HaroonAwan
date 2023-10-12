import java.util.Scanner;

public class EquationRunner {
    public static void main(String [] args){
        //gather user input for the coordinate points
        Scanner s = new Scanner(System.in);
        System.out.print("Welcome!\nEnter your first coordinate (x,y): ");
        String coordinate1 = s.nextLine();
        System.out.print("Enter your second coordinate (x,y): ");
        String coordinate2 = s.nextLine();

        //creates an object of LinearEquation with user input
        LinearEquation le = new LinearEquation(coordinate1, coordinate2);
        System.out.println(le);

        //asks for third x value and displays the corresponding y value
        System.out.print("\nEnter a third x value: ");
        double x3 = Double.parseDouble(s.nextLine());
        System.out.println(le.getY(x3));

        System.out.println("\nThank you for using me, Goodbye!");
    }
}
