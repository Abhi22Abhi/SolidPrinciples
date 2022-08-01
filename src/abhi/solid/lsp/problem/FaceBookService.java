package abhi.solid.lsp.problem;

public class FaceBookService extends SocialMediaService {

	    // Supported by FaceBook, WhatsApp and Instagram
		public void chatWithFriends() {
			//logic
		}
		
		// Supported by FaceBook and Instagram
		public void publicPost() {
			//logic
		}
		
		// Supported by FaceBook, WhatsApp and Instagram
		public  void sendPicsAndVideos() {
			//logic
		}

		// Supported by FaceBook and WhatsApp 
		public void videoCallWithFriends() {
			//logic		
		}	
}


// Following LSP by FaceBookService and  SocialMediaService ==> Parent class SocialMediaService can be replaced
// with child class FaceBookService.but, problem will come when child class are InstagramService, WhatsAppService


