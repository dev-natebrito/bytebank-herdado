public class TestReference {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Bea");
        manager.setSalary(6700.0);
        BonusController bonusController = new BonusController();
        bonusController.register(manager);
        var result = bonusController.getSum();
        System.out.println(result);

    }
}
