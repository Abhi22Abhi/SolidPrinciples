package abhi.solid.ocp.problem;

public class NoficationService {
	
//	Notification Responsible
	public void notification(String media) {
		
		if(media.equals("Phone")) {
			//logic to notification to Phone
		}else if(media.equals("mail")) {
			//logic to notification to Phone
		}
		
		// If we want to add new NoficationService with whatsApp then adding additional code(modifying Exiting
//		class(NoficationService) is not recommended as per OCP
	}
}
