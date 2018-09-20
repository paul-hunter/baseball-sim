
public class Game {
	
}

class AtBat {
	/* location
	 * 1 - pitcher
	 * 2 - catcher
	 * 3 - first base
	 * 4 - second base
	 * 5 - third base
	 * 6 - shortstop
	 * 7 - left
	 * 8 - center
	 * 9 - right
	 */
	int location;
	Player pitcher;
	Player batter;
	int balls;
	int strikes;
	int bases; //1, 2, 3 or 4 - single, double, triple or home run
	AtBat(Player pitcher, Player batter) {
		this.pitcher = pitcher;
		this.batter = batter;
	}
	private void pitch() {
		
	}
	
}