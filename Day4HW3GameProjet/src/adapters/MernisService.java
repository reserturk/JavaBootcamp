package adapters;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getFirtsName().toUpperCase(),gamer.getLastName().toUpperCase(), gamer.getYearOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
		
	}

}
