
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

   Scanner input = new Scanner(System.in);
   
    System.out.println("How old are you?");
    input.nextInt();
    int age = input.nextInt();
    int birthYear = (2024 - age);

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}