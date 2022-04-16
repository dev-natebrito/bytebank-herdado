public class Manager extends Employee implements Auth{
private int password;
  @Override
  public double getBonus() {
    System.out.println("manager bonus");
    return super.getSalary();
  }

  @Override
  public void setPassword(int password) {
    this.password = password;
  }

  @Override
  public boolean authenticated(int password) {
    return this.password == password;
  }
}
