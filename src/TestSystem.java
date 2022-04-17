public class TestSystem {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setPassword(22222);
		Admin adm = new Admin();
		adm.setPassword(2222);

		Customer customer = new Customer();
		customer.setPassword(2222);

		InternalSystem internalSystem = new InternalSystem();
		internalSystem.authenticated(manager);
		internalSystem.authenticated(adm);
		internalSystem.authenticated(customer);
	}
}
