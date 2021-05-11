package concretes;

import abstracts.CampaingService;
import entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " Kampanyas� Eklendi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " Kampanyas� G�ncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " Kampanya Silindi");
		
	}

}
