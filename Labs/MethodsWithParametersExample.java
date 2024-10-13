import java.util.Scanner;

public class MethodsWithParametersExample{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String item;
		int quantity;
		System.out.print("Please enter your inventory item: ");
		item = kb.nextLine();
		System.out.print("Please enter the quantity: ");
		quantity = kb.nextInt();
		printInventory(item, quantity);
	}

	public static void printInventory(String inventoryItem, int numberOfInventoryItems){
		System.out.println("There are currently " + numberOfInventoryItems + " " +inventoryItem + " left.");
	}

}