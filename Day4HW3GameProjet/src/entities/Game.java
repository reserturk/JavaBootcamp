package entities;

public class Game {
	private int id;
	private String gameName;
	private int gameNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGameNumber() {
		return gameNumber;
	}
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	private double unitPrice;
	public Game() {
		super();
	}
	public Game(int id, String gameName, int gameNumber, double unitPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameNumber = gameNumber;
		this.unitPrice = unitPrice;
	}

}
