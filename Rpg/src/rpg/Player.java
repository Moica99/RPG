package rpg;
import java.util.Scanner;

public class Player {
	
	Scanner sc = new Scanner(System.in);

	private String name;
	private int life;
	private int mana;
	
	
	public Player(String name, int life, int mana) {
		this.name = name;
		this.life = life;
		this.mana = mana;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getMana() {
		return mana;
	}
	
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public void Damage(int damage) {
		
		
		life =  life - damage;
		if(life < 0) {
			life = 0;
		}
		
		
		if (life == 0) {
			System.out.println(name +"Died");
			System.out.println("Game over");
			System.exit(0);
		}
	}
	
	public void Magic(int mana) {
		
		
		
		if(mana > 0) {
				
			int option = 0;
			
			System.out.println("Choose a spell: ");
			System.out.println("1 - Fireball");
			System.out.println("2 - Flame Tower");
			System.out.println("3 - Water shoot");
			System.out.println("4 - Earthwall");
			option = Integer.parseInt(sc.nextLine());
			
				switch(option) {
				
				case 1:
					mana = mana -20;
					System.out.println("A giant fireball is fire!");
					setMana(mana);
				
				case 2:
					mana = mana - 50;
					System.out.println("A massive flame tower appear, você usou: "+ mana + " de mana");
					setMana(mana);
					break;
					
				case 3:
					mana = mana - 15;
					System.out.println("Multiple water jets are formed and fired");
					setMana(mana);
					break;
					
				case 4:
					mana = mana - 30;
					System.out.println("A 5 meter earthwall rise in front of you");
					setMana(mana);
					break;
					
				default:
					System.out.println("Mana insufficient");
					break;
				}
		} else {
			System.out.println("Insuficient mana!");
		}
				}
	
	
	public void Status() {
		System.out.println("Player name: "+ name);
		System.out.println("Life: "+ life);
		System.out.println("Mana: "+ mana);
		
	}
}
