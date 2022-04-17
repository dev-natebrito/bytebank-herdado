public class Admin extends Employee implements Auth {
  private final Authenticator authenticator;
  public Admin(){
    this.authenticator = new Authenticator();
  }
  @Override
  public double getBonus() {
    System.out.println("manager bonus");
    return super.getSalary() * 1.5;
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
