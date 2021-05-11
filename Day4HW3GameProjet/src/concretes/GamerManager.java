package concretes;

import abstracts.GamerService;
import adapters.MernisService;
import entities.Gamer;

public class GamerManager implements GamerService{
	
	MernisService mernisService;

	public GamerManager(MernisService mernisService) {
		super();
		this.mernisService = mernisService;
	}

	@Override
	public void add(Gamer gamer) {
		if(this.mernisService.CheckIfRealPerson(gamer)) {
			System.out.println("M��teri Eklendi : "+ gamer.getFirtsName()+ " " + gamer.getLastName());
			
		}else {
			System.out.println("M��teri Eklenmedi.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirtsName()+" Oyuncu �smi G�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirtsName()+" Oyuncusu silindi.");
		
	}

}
