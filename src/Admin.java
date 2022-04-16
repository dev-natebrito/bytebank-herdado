public class Admin extends Employee implements Auth {
private int password;
  @Override
  public double getBonus() {
    System.out.println("manager bonus");
    return super.getSalary() * 1.5;
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
