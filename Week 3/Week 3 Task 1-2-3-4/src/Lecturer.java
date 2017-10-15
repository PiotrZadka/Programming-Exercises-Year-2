
public class Lecturer extends Employee {

    private String title;

    public Lecturer(String name, String address, String email_address,
                    int phone_number, String department, double salary, String startDate, String title){

        // super need to always call "all" variables from a class constructor that is extending
        // even if we are not going to use some of them
        super(name,address,email_address,phone_number,department,salary,startDate);
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String display(){
        return "\nName "+super.name+"\nDepartment: "+super.department+"\nSalary: "+super.salary+"\nTitle: "+title;
    }

}
