import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Choose a whole number.");
    int num1 = keyboard.nextInt();
    System.out.println("Choose another whole number.");
    int num2 = keyboard.nextInt();
    System.out.println("Choose one last whole number.");
    int num3 = keyboard.nextInt();
    int wholeAnswer = (num1 + num2 + num3);
    System.out.println("Choose a decimal number.");
    double dub1 = keyboard.nextDouble();
    System.out.println("Choose another decimal number.");
    double dub2 = keyboard.nextDouble();
    System.out.println("Choose a final decimal number.");
    double dub3 = keyboard.nextDouble();
    double decimalAnswer = (dub1 + dub2 + dub3);

    System.out.println(+ num1 + num2 + num3 = wholeAnswer);
    System.out.println(+ dub1 + dub2 + dub3 = decimalAnswer);

    keyboard.close();

  }
}
