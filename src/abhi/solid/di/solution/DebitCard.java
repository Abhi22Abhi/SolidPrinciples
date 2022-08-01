package abhi.solid.di.solution;

public class DebitCard implements BankCard {

	@Override
	public void doTransaction(int amount) {
		System.out.println(" Payment Transaction Done with DebitCard.....! ");
	}
}
