import adapters.MernisService;
import concretes.GamerManager;
import concretes.SaleManager;
import entities.Campaing;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"dsddasda","asdas",12345678901L,1111);
		Game game = new Game(1,"CS GO",1,30);
		Campaing campaing = new Campaing(1,"Ýndirim",50);
		
		
		GamerManager gamerManager = new GamerManager(new MernisService());
		gamerManager.add(gamer);
		
		SaleManager saleManager = new SaleManager(campaing);
		saleManager.sale(game, gamer, campaing);

	}

}
