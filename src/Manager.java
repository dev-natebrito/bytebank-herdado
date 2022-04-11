public class Manager extends Employee {

    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticated(int password) {
        return this.password == password;
    }

    @Override
    public double getBonus() {
        System.out.println("manager bonus");
        return super.getBonus() + super.getSalary();
    }
}
