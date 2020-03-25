
public class Customer {

	private String FirstName;
	private String LastName;
	private Address address;
	private PaymentMethod type;
	
	public Customer(String fn, String ln, int a, Address addr, PaymentMethod t) {
		this.FirstName = fn;
		this.LastName = ln;
		this.address = addr;
		this.type = t;
	} 
	
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public Address getAddress() {
		return address;
	}
	public PaymentMethod getPaymentMethod() {
		return type;	
	}
	void getCompleteName() {
		System.out.println(getFirstName() + ", " + getLastName());
	}


		
}
	

