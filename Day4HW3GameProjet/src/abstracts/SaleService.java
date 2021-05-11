package abstracts;

import entities.Campaing;
import entities.Game;
import entities.Gamer;

public interface SaleService {
	
	void sale(Game game, Gamer gamer, Campaing campaing);

}
