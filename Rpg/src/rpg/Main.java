package rpg;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name traveler: ");
		String name = sc.nextLine();
		
		Player player = new Player(name, 100, 100);
		
		int option = 0;
		
		while(option!=4) {
		System.out.println("\n...Menu...");
		System.out.println("1 - Attack");
		System.out.println("2 - Take damage");
		System.out.println("3 - Status");
		System.out.println("4 - Exit");
		option = Integer.parseInt(sc.nextLine());
		
		switch (option){
			
		case 1:
			int AT = 0;
			
			System.out.println("Chosse a way to attack!");
			System.out.println("1 - Fists or 2 - Magic?");
			System.out.println("3 - Cancel attack");
			AT = Integer.parseInt(sc.nextLine());
			
			switch (AT) {
			case 1:
				System.out.println("Hard punch!");
				break;
			case 2:
				player.Magic(player.getMana());
				break;
				
			case 3:
				System.out.println("Hum..Maybe not..");
				break;
				
			default:
				System.out.println("Choose a valid option!");
				break;			
			}
			
		case 2:
			player.Damage(20);
			break;
			
		case 3:
			player.Status();
			break;
		
		case 4:
			System.out.println("You are out.. For now!");
			
		default:
			System.out.println("Choose a valid option!");
			break;
			
			}
		}

		
		sc.close();

	}

}
