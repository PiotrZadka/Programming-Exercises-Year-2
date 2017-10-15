
public class Student extends Person{
    private Boolean enrolled;
    private int stuNumber;

    public Student(String name, String address, String email_address, int phone_number, Boolean enrolled,int stuNumber){

        super(name, address, email_address,phone_number);
        this.enrolled = enrolled;
        this.stuNumber = stuNumber;
    }

    public Boolean getEnrolled(){
        return enrolled;
    }

    public void setEnrolled(Boolean enrolled){
        this.enrolled = enrolled;
    }

    public String getName(){
        return name;
    }

    public int getNum(){
        return phone_number;
    }

    public String display(){
        return "\n"+"Name: "+super.getName()+"\n"+"Accepted: "  +getEnrolled();
    }
}
