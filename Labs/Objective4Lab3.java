
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);

    int age = input.nextInt();
    int currentYear = 2024;
    int birthYear = (currentYear - age);
    System.out.println("How old are you?");
    input.nextInt();

    System.out.println("You were born in " + birthYear + ".");
    input.close();
  }
}