package p;

public class Transaction {
	private String username, shipping, paymethod;
	private int quantity;
	private double total_price;
	
	public Transaction(String username, String shipping, String paymethod, int quantity, double total_price) {
		super();
		this.username = username;
		this.shipping = shipping;
		this.paymethod = paymethod;
		this.quantity = quantity;
		this.total_price = total_price;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	
	

}
