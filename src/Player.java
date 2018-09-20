import java.util.*;

public class Player {
	//id number
	static int playerCount = 0;
	
	//demographic info
	String firstName;
	String lastName;
	int playerID;
	
	//hiting ability 20-80
	//to add: dedication (ability to improve), hustle, durability 
	int hit;
	int power;
	int field;
	int arm;
	int speed;
	
	//pitching ability 20-80
	//fastball from "arm", add different breaking balls later (cv, sl, sp, chg, slv, knuckle)
	int control;
	int breaking;
	
	//to do: separate hitters/pitchers
	Player(String first, String last) {
		playerID = playerCount;
		playerCount++;
		firstName = first;
		lastName = last;
		
		Random rand = new Random();
		hit = (int)(rand.nextGaussian() * 10 + 50);
		power = (int)(rand.nextGaussian() * 10 + 50);
		field = (int)(rand.nextGaussian() * 10 + 50);
		arm = (int)(rand.nextGaussian() * 10 + 50);
		speed = (int)(rand.nextGaussian() * 10 + 50);
		control = (int)(rand.nextGaussian() * 10 + 50);
		breaking = (int)(rand.nextGaussian() * 10 + 50);
	}
	
	int positSkill() {
		int sum = hit + power + field + arm + speed;
		return sum / 5;
	}
	
	int pitchSkill() {
		int sum = arm + control + breaking;
		return sum / 3;
	}
	
	void getInfo() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("ID: " + playerID);
		System.out.println("Hit: " + hit);
		System.out.println("Power: " + power);
		System.out.println("Field: " + field);
		System.out.println("Arm: " + arm);
		System.out.println("Speed: " + speed);
		System.out.println("Control: " + control);
		System.out.println("Breaking: " + breaking);
		System.out.println("Position Player Skill: " + positSkill());
		System.out.println("Pitching Skill: " + pitchSkill());
		System.out.println("");
	}
}
