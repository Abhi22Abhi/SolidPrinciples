package abhi.solid.isp.solution;

public interface UpiPayments {
		
	//  GpayService, PaytmService and PhonepayService
		void payMoney();
		
		//GpayService, PaytmService and PhonepayService
		void getScarchCard();
	}

//Whenever we extend this class we should implement all methods irrespective of client need.

