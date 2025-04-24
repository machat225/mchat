package aufgabe1;
import java.util.Scanner;

public class Account {
	public String owner;
	private double balance;
	protected int pin;
	String internalNote;
	
	static Scanner scanner = new Scanner(System.in);
	
	public Account(String owner, double balance, int pin, String internalNote) {
		this.owner = owner;
		this.balance = balance;
		this.pin = pin;
		this.internalNote = internalNote;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void changePin(Account account) {
		System.out.println("Gib deine aktuelle Pin ein: ");
		int currentPin = scanner.nextInt();
		
		if (currentPin == account.pin) {
			int newPin = scanner.nextInt();
			account.pin = newPin;
			System.out.println("Du hast eine neue Pin gesetzt");
		} else {
			System.out.println("Falsche Pin! Probiere nochmal");
			changePin(account);
		}
	}
	
	public static void main(String[] args) {
		changePin(myAccount);
	}
}
