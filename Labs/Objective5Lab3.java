public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      int userNum = input.nextInt();

      if(userNum.equals(0)) {
        System.out.println(userNum + " is neutral.");
      }
      if(userNum < 0) {
        System.out.println(userNum + " is negative.");
      }
      if(userNum > 0) {
        System.out.println(userNum + " is positive.");
      }

      scanner.close();
  }
}