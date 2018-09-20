import java.io.*;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) throws FileNotFoundException {
		Player paul = new Player("Paul", "Hunter");
		Player aaron = new Player("Aaron", "Judge");
		Player gary = new Player("Gary", "Sanchez");
		paul.getInfo();
		gary.getInfo();
		aaron.getInfo();
		
		File file = new File("C:\\Projects\\BaseballSim\\teams\\team1.txt");
		//File team2 = new File("C:\\Projects\\BaseballSim\\teams\\team2.txt");
		
		Team team1 = new Team(file);
		
		team1.teamInfo();
	}
}
