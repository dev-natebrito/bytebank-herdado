public class Manager extends Employee {

  @Override
  public double getBonus() {
    System.out.println("manager bonus");
    return super.getSalary();
  }
}
