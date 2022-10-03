public class HumanResources extends Department{
    private String Records;
    private String Fired;
    private String Policies;

    public void setRecords(String records) {
        Records = records;
    }
    public String getRecords(){
        System.out.println(this.Records);
        return this.Records;
    }
    public void setFired(String fired) {
        Fired = fired;
    }
    public String getFired(){
        System.out.println(this.Fired);
        return this.Fired;
    }
    public void setPolicies(String policies) {
        Policies = policies;
    }
    public String getPolicies(){
        System.out.println(this.Policies);
        return this.Policies;
    }
}
