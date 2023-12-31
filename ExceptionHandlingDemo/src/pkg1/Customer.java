package pkg1;

// POJO class
public class Customer {
	private int id;
	private String name;
	private String contactNo;
	
	// Constructors
	public Customer() {}
	
	public Customer(int id, String name, String contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	
	// public Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	// toString()
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	

	
}
