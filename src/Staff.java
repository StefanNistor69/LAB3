public class Staff {
    private String Name;
    private String Surname;
    private int Age;
    private double Salary;
    private String Identification;
    private String Work_program;

    public String getName(){
        System.out.println("Name:"+this.Name);
        return this.Name;
    }
    public void setName(String name){
        this.Name=name;
    }
    public String getSurname(){
        System.out.println("Surname:"+this.Surname);
        return this.Surname;
    }
    public void setSurname(String surname){
        this.Surname=surname;
    }
    public int getAge(){
        //return this.Age;
        System.out.println("Age:"+this.Age);
        return this.Age;
    }
    public void setAge(int age){
        this.Age=age;
    }
    public double getSalary(){
        System.out.println("Salary:"+this.Salary);
        return this.Salary;
    }
    public void setSalary(double salary){
        this.Salary=salary;
    }
    public String getIdentification(){
        System.out.println("Identification:"+this.Identification);
        return this.Identification;
    }
    public void setIdentification(String identification){
        this.Identification=identification;
    }
    public String getWork_program(){
        System.out.println("Work program:"+this.Work_program);
        return this.Work_program;
    }
    public void setWork_program(String program){
        this.Work_program=program;
    }
}
