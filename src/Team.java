import java.io.*;
import java.util.*;

public class Team {
	//need team characteristics: name, manager, location etc.
	Player[] teamList;
	
	Team(File names) throws FileNotFoundException {
		teamList = new Player[9]; //9 player team
		Scanner scan = new Scanner(names);
		String first;
		String last;
		int count = 0;
		while (scan.hasNext()) {
			first = scan.next();
			last = scan.next();
			teamList[count] = new Player(first, last);
			count++;
		}
		scan.close();
	}
	
	void teamInfo() {
		for (int i = 0; i < teamList.length; i++) {
			System.out.print("Name: " + teamList[i].firstName + " " + teamList[i].lastName);
			System.out.print(" Position skill: " + teamList[i].positSkill());
			System.out.print(" Pitching skill: " + teamList[i].pitchSkill());
			System.out.println("");
		}
	}
}
