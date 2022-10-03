public class PC {
    private String GPU;
    private String CPU;
    private String Motherboard;
    private String RAM;
    private String Case;
    private String Power_Supply;
    private String Fan;
    private String SSD;
    private int RamCapacity;

    public String getGPU(){
        System.out.println(this.GPU);
        return this.GPU;
    }
    public void setGPU(String gpu){
        this.GPU=gpu;
    }
    public String getCPU(){
        System.out.println(this.CPU);
        return this.CPU;
    }
    public void setCPU(String cpu){
        this.CPU=cpu;
    }
    public String getMotherboard(){
        System.out.println(this.Motherboard);
        return this.Motherboard;
    }
    public void setMotherboard(String motherboard){
        this.Motherboard=motherboard;
    }
    public String getRAM(){
        System.out.println(this.RAM);
        return this.RAM;
    }
    public void setRAM(String ram){
        this.RAM=ram;
    }
    public String getCase(){
        System.out.println(this.Case);
        return this.Case;
    }
    public void setCase(String box){
        this.Case=box;
    }
    public String getPower_Supply(){
        System.out.println(this.Power_Supply);
        return this.Power_Supply;
    }
    public void setPower_Supply(String supply){
        this.Power_Supply=supply;
    }
    public String getFan(){
        System.out.println(this.Fan);
        return this.Fan;
    }
    public void setFan(String fan){
        this.Fan=fan;
    }
    public int getRamCapacity(){
        System.out.println(this.RamCapacity);
        return this.RamCapacity;
    }
    public void setRamCapacity(int capacity){
        this.RamCapacity=capacity;
    }
    public String getSSD(){
        System.out.println(this.SSD);
        return this.SSD;
    }
    public void setSSD(String ssd){
        this.SSD=ssd;
    }

}
