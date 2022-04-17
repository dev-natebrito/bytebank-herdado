public class TestEmployee {

	public static void main(String[] args) {
		Employee nate = new Manager();
		nate.setName("Nate");
		nate.setCpf("432.419.398-19");
		nate.setSalary(2469.20);

		System.out.println(nate.getName());
		System.out.println(nate.getBonus());
		System.out.println(nate.getCpf());
	}
}
