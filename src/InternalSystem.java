public class InternalSystem {
  private int password = 2222;

  public void authenticated(Auth auth) {
    boolean isAuthenticated = auth.authenticated(this.password);
    if (isAuthenticated) {
      System.out.println("welcome");
    } else {
      System.out.println("YOU SHALL NOT PASS");
    }
  }
}
