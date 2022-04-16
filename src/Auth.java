public interface Auth {

  void setPassword(int password);

  boolean authenticated(int password);
}
