
public class Account implements AccountHolderInterface {

	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public AccountHolder getHolder() {
		return holder;
	}
	public void setHolder(AccountHolder holder) {
		this.holder = holder;
	}
	private String iban = "";
	private float balance = 0;
	private AccountHolder holder = null;
	private String lastTransactionInfo = "";
	@Override
	public void notifyTransfer(Account account) {
		// TODO Auto-generated method stub
		
	}

}
