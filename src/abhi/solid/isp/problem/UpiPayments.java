package abhi.solid.isp.problem;

public interface UpiPayments {
		
		//GpayService, PaytmService and PhonepayService
		void payMoney();
		
		//GpayService, PaytmService and PhonepayService
		void getScarchCard();
		
		//PaytmService 
		void getScarchCardAsCreditBalance();
		
		//GpayService
		void referalBonus();
	}

//Whenever we extend this class we should implement all methods irrespective of client need.

