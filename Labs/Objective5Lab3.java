public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int userNum = input.nextInt();

      if(userNum > 0) {
        System.out.println(userNum + " is positive");
      }
      else if(userNum < 0) {
        System.out.println(userNum + " is negative");
      }
      else {
        System.out.println(userNum + " is positive");
      }

      scanner.close();
  }
}