package MappingDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acct")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acct_id")
	private int acctId;

	@Column(name = "acct_holder_name")
	private String acctHolderName;

	@Column(name = "balance")
	private float balance;

	public Account() {

	}

	public Account(int acctId, String acctHolderName, float balance) {
		super();
		this.acctId = acctId;
		this.acctHolderName = acctHolderName;
		this.balance = balance;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public String getAcctHolderName() {
		return acctHolderName;
	}

	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acctId=" + acctId + ", acctHolderName=" + acctHolderName + ", balance=" + balance + "]";
	}
	
	

}
