
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int currentYear = 2024;
    int birthYear = (currentYear - age);

   Scanner input = new Scanner(System.in);

    System.out.println("How old are you?");
    input.nextInt();
    int age = input.nextInt();

    System.out.println("You were born in " + birthYear + ".");
    input.close();
  }
}