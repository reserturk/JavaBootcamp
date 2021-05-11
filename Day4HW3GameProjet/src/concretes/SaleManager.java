package concretes;

import abstracts.SaleService;
import entities.Campaing;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{
	private Campaing campaing;

	public SaleManager(Campaing campaing) {
		super();
		this.campaing = campaing;
	}

	@Override
	public void sale(Game game, Gamer gamer, Campaing campaing) {
		
		double campaignUnit= game.getUnitPrice()-(game.getUnitPrice()*campaing.getDiscount()/100);
		System.out.println(gamer.getFirtsName()+" Adli oyuncuya "+ game.getGameName()+ "oyunu "+ game.getUnitPrice()+ " TL."+ campaing.getCampaingName()+ " Kampanyasi ile "+ campaignUnit+" TL, Ýndirimli Satýn Aldý.");
		
	}

}
