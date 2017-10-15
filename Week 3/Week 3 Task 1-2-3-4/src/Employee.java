
public class Employee extends Person{

     String department;
     double salary;
     String startDate;


    public Employee(String name, String address, String email_address,
                    int phone_number, String department, double salary, String startDate){

        super(name,address,email_address, phone_number);
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
    }


    public void setDepartment(String dept){
        this.department = dept;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public String display(){
        return "Name: "+super.getName()+"\n"+"Address: "+super.getAddress()+"\n"+"Email: "+super.getEmail()+"\n"+"Phone: "
                +super.getPhone()+"\n"+"Department: "+getDepartment()+"\n"+"Salary: "+getSalary()+"\n"+"Start Date: "+getStartDate();
    }
}
