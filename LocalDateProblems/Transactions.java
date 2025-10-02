package LocalDateProblems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Transactions {

	LocalDate date;
	String name;
	long balance;
	int accountnumber;

	public Transactions(LocalDate date, String name, long balance, int accountnumber) {
		super();
		this.date = date;
		this.name = name;
		this.balance = balance;
		this.accountnumber = accountnumber;
	}

	public Transactions() {
		super();
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "Transactions [date=" + date + ", name=" + name + ", balance=" + balance + ", accountnumber="
				+ accountnumber + "]";
	}

	public static void main(String[] args) {

		List<Transactions> transactionList = new ArrayList<Transactions>();

		transactionList.add(new Transactions(LocalDate.of(2025, 7, 24), "akhi", 1200, 346573897));
		transactionList.add(new Transactions(LocalDate.of(2025, 8, 24), "akhi", 1200, 346573897));
		transactionList.add(new Transactions(LocalDate.of(2025, 8, 22), "akhi", 1200, 346573897));
		transactionList.add(new Transactions(LocalDate.of(2025, 5, 24), "akhi", 1200, 346573897));
		transactionList.add(new Transactions(LocalDate.of(2025, 5, 24), "akhi", 1200, 346573897));
		
		LocalDate d= LocalDate.now();
		 
		 LocalDate previousday= d.minusDays(60);
		 LocalDate currentday= d.minusDays(30);
		 
		List<Transactions> collect = transactionList.stream().filter(f-> !f.getDate().isBefore(currentday)).collect(Collectors.toList());

		System.out.println(collect);
		
		List<Transactions> fi = transactionList.stream().filter(f-> !f.getDate().isBefore(previousday)).collect(Collectors.toList());

		System.out.println(fi);
	}

}
