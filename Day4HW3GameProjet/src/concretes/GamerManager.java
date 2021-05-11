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
			System.out.println("Müþteri Eklendi : "+ gamer.getFirtsName()+ " " + gamer.getLastName());
			
		}else {
			System.out.println("Müþteri Eklenmedi.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirtsName()+" Oyuncu Ýsmi Güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirtsName()+" Oyuncusu silindi.");
		
	}

}
