package core.concretes;

import core.abstracts.GmailService;
import gmail.GmailManager;

public class GmailAdapter implements GmailService{

	@Override
	public void gmailMessage(String message) {
		GmailManager gManager = new GmailManager();
		gManager.dogrula(message);
		
	}

}
