package concretes;

import abstracts.CampaingService;
import entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " Kampanyası Eklendi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " Kampanyası Güncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+ " Kampanya Silindi");
		
	}

}
