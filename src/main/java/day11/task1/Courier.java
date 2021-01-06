package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private static final int TASK_SALARY = 100;
    private Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementCountDeliveredOrders();


    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;


    }
}
