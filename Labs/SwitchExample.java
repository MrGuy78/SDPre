public class SwitchExample {
	public static void main(String[] args) {
		char grade;
		grade = 'f';

		switch (grade) {
		case 'A':
		  System.out.println("Fantastic job!");
		  break;
		case 'a':
		  System.out.println("Fantastic job!");
		  break;
		case 'B':
		  System.out.println("Good job!");
		  break;
		  case 'b':
		  System.out.println("Good job!");
		  break;
		case 'C':
		  System.out.println("You're doing okay.");
		  break;
		  case 'c':
		  System.out.println("You're doing okay.");
		  break;
		case 'D':
		  System.out.println("Please schedule a conference.");
		  break;
		  case 'd':
		  System.out.println("Please schedule a conference.");
		  break;
		case 'F':
		  System.out.println("Start finishing homework and showing up to class.");
		  break;
		case 'f':
		  System.out.println("Start finishing homework and showing up to class.");
		  break;
		default:
		  System.out.println("Invalid grade.");
		}
	}
}