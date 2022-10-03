public class Department {
    private String DepartmentName;
    private int DepNumber;
    private String DepAddress;
    private String DepTelephone;

    public String getDepartmentName(){
        System.out.println(this.DepartmentName);
        return this.DepartmentName;
    }
    public void setDepartmentName(String dName){
        this.DepartmentName=dName;
    }
    public int getDepNumber(){
        System.out.println(this.DepNumber);
        return this.DepNumber;
    }
    public void setDepNumber(int dNumber){
        this.DepNumber=dNumber;
    }
    public String getDepAddress(){
        System.out.println(this.DepAddress);
        return this.DepAddress;
    }
    public void setDepAddress(String dAddress){
        this.DepAddress=dAddress;
    }
    public String getDepTelephone(){
        System.out.println(this.DepTelephone);
        return this.DepartmentName;
    }
    public void setDepTelephone(String dTelephone){
        this.DepTelephone=dTelephone;
    }
}
