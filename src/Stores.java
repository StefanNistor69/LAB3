public class Stores {
    private String StoreName;
    private String Address;
    private String Telephone;
    private String Schedule;

    public String getStoreName(){
        System.out.println(StoreName);
        return this.StoreName;
    }
    public void setStoreName(String store){
        this.StoreName=store;
    }
    public String getAddress(){
        System.out.println(Address);
        return this.Address;
    }
    public void setAddress(String address){
        this.Address=address;
    }
    public String getTelephone(){
        System.out.println(Telephone);
        return this.Telephone;
    }
    public void setTelephone(String telephone){
        this.Telephone=telephone;
    }
    public String getSchedule(){
        System.out.println(Schedule);
        return this.Schedule;
    }
    public void setSchedule(String schedule){
        this.Schedule=schedule;
    }

}
