public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int userNum = input.nextInt();

      if(userNum % 2 == 0) {
        System.out.println("The number is even");
      }
      else if(userNum % 2 != 0) {
        System.out.println("The number is odd");
      }

      scanner.close();
    }

  }