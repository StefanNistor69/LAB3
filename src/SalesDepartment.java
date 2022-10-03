public class SalesDepartment extends Department{

    private int NumberOfSales;
    private String ProductReviews;
    private double MonthlyRevenue;
    private String NewCustomers;

    public void setNumberOfSales(int numberOfSales) {
        NumberOfSales = numberOfSales;
    }
    public int getNumberOfSales(){
        System.out.println(this.NumberOfSales);
        return this.NumberOfSales;
    }
    public void setProductReviews(String productReviews) {
        ProductReviews = productReviews;
    }
    public String getProductReviews(){
        System.out.println(this.ProductReviews);
        return this.ProductReviews;
    }
    public void setMonthlyRevenue(double monthlyRevenue) {
        MonthlyRevenue = monthlyRevenue;
    }
    public double getMonthlyRevenue(){
        System.out.println(this.MonthlyRevenue);
        return this.MonthlyRevenue;
    }
    public void setNewCustomers(String newCustomers) {
        NewCustomers = newCustomers;
    }
    public String getNewCustomers(){
        System.out.println(this.NewCustomers);
        return this.NewCustomers;
    }
}
