package abhi.solid.di.problem;

public class ShoppingMall {
	
	DebitCard debitCard;
	
	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public void doPurchage(int amount) {
		debitCard.doTransaction(amount);
	}

	
	
	
	public static void main(String[] args) {
	
//		CreditCard creditCard = new CreditCard();
		
		DebitCard debitCard = new DebitCard();
		ShoppingMall  shoppingMall = new  ShoppingMall(debitCard);
		shoppingMall.doPurchage(40000);
	}
}


// If our transaction based on CreditCard then we should change lots of lines, Bcz, there is no abstraction.
// ShoppingMall Class is Tightly Coupled with DebitCard and CreditCard.To provide Loosely Coupling use BankCard Interface.





// Similar to SRP
