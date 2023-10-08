import java.util.Scanner;

public class EquationRunner {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Welcome!\nEnter your first coordinate (x,y): ");
        String coordinate1 = s.nextLine();
        System.out.print("Enter your second coordinate (x,y): ");
        String coordinate2 = s.nextLine();

        LinearEquation le = new LinearEquation(coordinate1, coordinate2);
        System.out.println(le);

        System.out.print("\nEnter a third x value: ");
        int x3 = Integer.parseInt(s.nextLine());
        System.out.println(le.getY(x3));

        System.out.println("\nThank you for using me, Goodbye!");
    }
}
