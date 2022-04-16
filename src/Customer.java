public class Customer implements Auth {
	private int password;
	@Override
	public void setPassword(int password) {
	this.password = password;
	}

	@Override
	public boolean authenticated(int password) {
		return this.password == password;
	}
}
