public class InternalSystem {

  public void authenticated(Auth auth) {
    int password = 2_222;
    boolean isAuthenticated = auth.authenticated(password);
    if (isAuthenticated) {
      System.out.println("welcome");
    } else {
      System.out.println("YOU SHALL NOT PASS");
    }
  }
}
