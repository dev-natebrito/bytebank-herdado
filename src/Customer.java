public class Customer implements Auth {

	private final Authenticator authenticator;

	public Customer() {
		this.authenticator = new Authenticator();
	}

	@Override
	public void setPassword(int password) {
		this.authenticator.setPassword(password);
	}

	@Override
	public boolean authenticated(int password) {
		return authenticator.authenticated(password);
	}
}
