
public class PaymentMethod {
	
	private String type;
	
	public PaymentMethod(String t) {
		this.type = t;
	}
	
	public String getType() {
		return type;
	}
	
	
	
	void getPaymentMethod()
	{
		System.out.println();
		System.out.println("Cash/Card? - " + getType());
	}
}
	
	
	/*public PaymentMethod(String pm) {
		this.PaymentMethod = pm;
	}
	
	public String getPaymentMethod() {
		return pm;
	}
	void getPaymentMethod()
	{
		System.out.println();
		System.out.println("Payment method: " + getpm());
	}
}
*/