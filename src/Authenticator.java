public class Authenticator {
	private int password;

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean authenticated(int password) {
		return this.password == password;
	}
}
