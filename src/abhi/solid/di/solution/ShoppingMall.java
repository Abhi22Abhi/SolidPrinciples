package abhi.solid.di.solution;

public class ShoppingMall {
	
	BankCard bankCard;  // Here ShoppingMall is Tightly Coupled with BankCard (In java, avoiding Tightly Coupled 100% not possible)
	
	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPurchage(int amount) {
		bankCard.doTransaction(amount);
	}

	
	
	
	public static void main(String[] args) {
	
//		BankCard bankCard = new DebitCard();
		BankCard bankCard = new CreditCard();
		
		ShoppingMall  shoppingMall = new  ShoppingMall(bankCard);
		shoppingMall.doPurchage(40000);
	}
}


// If our transaction based on CreditCard then we should change lots of lines, Bcz, there is no abstraction.
// ShoppingMall Class is Tightly Coupled with DebitCard and CreditCard.To provide Loosely Coupling use BankCard Interface.





// Similar to SRP
