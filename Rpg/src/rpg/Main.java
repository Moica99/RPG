package rpg;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name traveler: ");
		String name = sc.nextLine();
		
		Player player = new Player(name, 100, 100);
		
		int option = 0;
		
		while(option != 4) {
			
			System.out.println("\n...Menu...");
			System.out.println("1 - Attack");
			System.out.println("2 - Take damage");
			System.out.println("3 - Status");
			System.out.println("4 - Exit");
			
			System.out.println("Choose a path: ");
			option = Integer.parseInt(sc.nextLine());
			
			if( option == 1) {
				int AT = 0;
				while(AT != 3) {
				System.out.println("Chosse a way to attack!");
				System.out.println("1 - Fists or 2 - Magic?");
				System.out.println("3 - Cancel attack");
				AT = Integer.parseInt(sc.nextLine());
				
				if(AT == 1) {
					System.out.println("Hard punch!");
					
				} else if(AT == 2){
					
					player.Magic(player.getMana());
				} else if(AT == 3) {
					System.out.println("Hum..Maybe not..");
				} else {
					System.out.println("Choose a valid option!");
				}
				
				
				}
				
			} else if(option == 2) {
				player.Damage(20);
			} else if(option == 3) {
				player.Status();
			} else if(option == 4) {
				System.out.println("You are out.. For now!");
			} else {
				System.out.println("Choose a valid option!");
			}
			
		}
		
		sc.close();

	}

}
