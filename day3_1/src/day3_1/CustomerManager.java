package day3_1;

public class CustomerManager {

	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void addCustomer() {

		System.out.println("Müşteri eklendi : " + customer.getFirstName());
	}

	public void removeCustomer() {

		System.out.println("müşteri silindi :" + customer.getFirstName());
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("kredi verildi");
	}

}
