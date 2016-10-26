import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
	
	private String bankName = "";
	
	private ArrayList<AccountHolderInterface> holders = new ArrayList<AccountHolderInterface>;
	public void attach(AccountHolderInterface holder){
		holders.add(holder);
		
	}
	
	public void dettach(AccountHolder holder){
		holders.remove(holder);
		
	}
	
	public void holderNotify(Account account){
		String egn = account.getHolder().getEgn(
				Iterator<AccountHolderInterface> hi = holders.iterator)
				while(hi.hasNext()){
					AccountHolderInterface next = hi.next();
					String nextEgn = ((AccountHolder)next);
					
				}
	}
	

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	

}
