package entities;

public class Campaing {
	private int id;
	private String campaingName;
	private double discount;
	


	public Campaing() {
		super();
	}

	public Campaing(int id, String campaingName, double discount) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
