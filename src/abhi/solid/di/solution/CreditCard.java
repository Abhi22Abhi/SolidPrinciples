package abhi.solid.di.solution;

public class CreditCard implements BankCard {

	@Override
	public void doTransaction(int amount) {
		System.out.println(" Payment Transaction Done with CreditCard.....! ");
	}
}
