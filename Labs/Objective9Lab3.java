public class ObjectiveLab3 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int selection;

    while(true){
      printMenu();

      selection = scanner.nextint;

      if(selection == 1) {
        System.out.println("Hello Human");
      }

      if(selection == 2) {
        System.out.println("Almost anything with chipotle");
      }

      if(selection == 3) {
        System.out.println("Goodbye");
        break;
      }
     
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}