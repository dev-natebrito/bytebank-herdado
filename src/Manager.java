public class Manager extends Employee implements Auth{
private final Authenticator authenticator;
public Manager(){
this.authenticator = new Authenticator();
}
  @Override
  public double getBonus() {
    System.out.println("manager bonus");
    return super.getSalary();
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
