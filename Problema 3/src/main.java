
public class main {
	public static void main(String[] args) {
		Address addr = new Address(25, "Valea Cetatii", "Brasov");
		PaymentMethod t = new PaymentMethod("cash");
		Customer c1 = new Customer("Constantin", "Bellu", 22, addr, t);

		
				
		
		c1.getCompleteName();
		c1.getAddress().getFullAddress();
		c1.getPaymentMethod().getType();
	}

}
