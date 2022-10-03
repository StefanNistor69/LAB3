public class ManufacturingDepartment extends Department{
    private String Purchases;
    private String Distributions;
    private String Malfunctions;

    public void setPurchases(String purchases) {
        Purchases = purchases;
    }
    public String getPurchases(){
        System.out.println(this.Purchases);
        return this.Purchases;
    }
    public void setDistributions(String distributions) {
        Distributions = distributions;
    }
    public String getDistributions(){
        System.out.println(this.Distributions);
        return this.Distributions;
    }
    public void setMalfunctions(String malfunctions) {
        Malfunctions = malfunctions;
    }
    public String getMalfunctions(){
        System.out.println(this.Malfunctions);
        return this.Malfunctions;
    }
}
