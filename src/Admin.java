public class Admin extends Employee {

  @Override
  public double getBonus() {
    System.out.println("manager bonus");
    return super.getSalary() * 1.5;
  }
}
