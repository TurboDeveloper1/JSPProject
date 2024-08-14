
public class Customer {

	private String customerId;
	private String customerName;
	private String customerPassword;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public Customer(String customerId, String customerName, String customerPassword) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
	}

	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + "]";
	}
	
}
