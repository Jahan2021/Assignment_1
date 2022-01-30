package mru.game.model;

public class Player {
	
	/**
	 * This class represent each player record in the Database
	 * It is basically a model class for each record in the txt file
	 */
	
	private String name;
	private int wins;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
