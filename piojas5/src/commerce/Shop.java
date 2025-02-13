package commerce;

public class Shop {
    private double revenue;
    private double expenses;
    private int employeeCount;
    private static Shop instance;

    private Shop(double revenue, double expenses, int employeeCount) {
        this.revenue = revenue;
        this.expenses = expenses;
        this.employeeCount = employeeCount;
    }
    public static Shop getInstance(double revenue,double expenses,int employeeCount){
        if(instance==null){
            instance=new Shop(revenue, expenses, employeeCount);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "revenue=" + revenue +
                ", expenses=" + expenses +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
