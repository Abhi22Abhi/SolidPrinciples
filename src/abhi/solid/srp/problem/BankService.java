package abhi.solid.srp.problem;

public class BankService {

//	Payment Responsible
	public void doDeposit(int amount) {
		//logic to deposit
	}
	public void doWithDraw(int amount) {
		//logic to deposit
	}
	
	
//	Book Printing Responsible
	public void printBook(String barcode) {
		//logic to printBook
	}
	
	
//	Loan Responsible	
	public void loan(String media) {
		if(media.equals("Home")) {
			//logic to Home Loan
		}else if(media.equals("Car")) {
			//logic to Car Loan
		}
	}
	
//	Notification Responsible
	public void notification(String media) {
		if(media.equals("Phone")) {
			//logic to notification to Phone
		}else if(media.equals("mail")) {
			//logic to notification to Phone
		}
	}
}
