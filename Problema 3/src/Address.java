
public class Address {

	private int number; 
	private String street;
	private String city;
	
	
	public Address(int nr, String str, String city) {
		this.number = nr; 
		this.street = str;
		this.city = city;
	}
	
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public int getNumber() {
		return number;
	}
	
	void getFullAddress()
	{
		System.out.println();
		System.out.println("Strada: " + getStreet() + ", Orasul: " + getCity() + ", Numarul: " + getNumber());
	}

}
