public class TestReference {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Bea");
        manager.setSalary(6700.0);
        Employee employee = new Employee();
        employee.setSalary(1000.0);
        BonusController bonusController = new BonusController();
        bonusController.register(manager);
        bonusController.register(employee);
        var result = bonusController.getSum();
        System.out.println(result);

    }
}
