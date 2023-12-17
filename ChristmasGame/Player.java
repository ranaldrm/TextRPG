import java.util.ArrayList;

public class Player {
	protected int sanity;
	protected int health;
	protected String equipped;
	protected ArrayList knapsack;
	
	
	public Player () {
		this.sanity = 10;
		this.health = 10;
		this.equipped = "Nothing";
		
	}


	public int getSanity() {
		return sanity;
	}


	public void setSanity(int sanity) {
		this.sanity = sanity;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getEquipped() {
		return equipped;
	}


	public void setEquipped(String equipped) {
		this.equipped = equipped;
	}


	public ArrayList getKnapsack() {
		return knapsack;
	}


	public void setKnapsack(ArrayList knapsack) {
		this.knapsack = knapsack;
	}

}
