package refactoring_program1;

public class Customer {
	
	private String firstName = "";
	private String lastName = "";
	
	private Address address = null;
	
	private Birthday birthDay = null;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName, String street,
			String city, String state, int postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(street, city, state, postalCode);
	}
	
	public Customer(String firstName, String lastName, Address address,
			Birthday birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDay = birthDay;
	}
	public static void main(String[] args){
		
		Customer sallySmith = new Customer("Sally", "Smith", "123 Main St", "Perry", "Iowa", 50220);
		
		// The positive of accessing fields through accessor methods is that
		// subclasses can override the way fields are accessed and the fields
		// can be protected. The negative is that the code is hard to read
		
		System.out.println("Customer Name: " + sallySmith.getFirstName() + " " + sallySmith.getLastName());
		System.out.println("Address: " + sallySmith.address.getStreet() + " " + sallySmith.address.getCity() +
				" " + sallySmith.address.getState() + " " + sallySmith.address.getPostalCode());
		
		Address markJonesAddress = new Address("123 Main St", "Perry", "Iowa", 50220);
		
		Birthday markJonesBirthday = new Birthday(12,21,1974);
		
		Customer markJones = new Customer("Mark", "Jones", markJonesAddress, markJonesBirthday);
		
		// I can call for the birthday directly because I have toString() in Birthday
		
		System.out.println(markJones.birthDay);
		
		// Versus this, or the call to accessor methods
		
		System.out.println(markJones.birthDay.getBirthDate());
		
		// I can do the same with Address
		
		System.out.println(markJones.address);
		
	}

}