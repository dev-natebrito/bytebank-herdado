public class TestManager {
  public static void main(String[] args) {
    Manager m1 = new Manager();
    m1.setName("nate");
    m1.setCpf("123.321.123-32");
    m1.setSalary(12333.0);

    System.out.println(m1.getName());
    System.out.println(m1.getCpf());
    System.out.println(m1.getSalary());

    //        m1.setPassword(1233);
    //        boolean success = m1.authenticated(1233);
    //        System.out.println(success);
    //        System.out.println(m1.getBonus());
  }
}
