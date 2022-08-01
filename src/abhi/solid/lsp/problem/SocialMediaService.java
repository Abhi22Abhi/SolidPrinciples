package abhi.solid.lsp.problem;

// Requirements for FaceBook, WhatsApp and Instagram
public abstract class SocialMediaService {
	
	// Supported by FaceBook, WhatsApp and Instagram
	public abstract void chatWithFriends();
	
	// Supported by FaceBook and Instagram
	public abstract void publicPost();
	
	// Supported by FaceBook, WhatsApp and Instagram
	public abstract void sendPicsAndVideos();
	
	// Supported by FaceBook and WhatsApp 
	public abstract void videoCallWithFriends();
	
}

