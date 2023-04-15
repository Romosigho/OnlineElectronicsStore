package p;

public class User {
	private int id;

	private String username, password, shipping, paymethod;

	public User(String username, String password, String shipping, String paymethod) {
		this.username = username;
		this.password = password;
		this.setShipping(shipping);
		this.setPaymethod(paymethod);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}

