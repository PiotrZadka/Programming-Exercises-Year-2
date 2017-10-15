public class Administrator extends Employee {

    String officeHours;
    int rank;

    Administrator(String name, String address, String email_address,
                  int phone_number, String department, double salary, String startDate, String officeHours, int rank){

        super(name,address,email_address,phone_number,department,salary,startDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public String getOfficeHours(){
        return officeHours;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return rank;
   }

   public String display(){
        return "\nName: "+super.name+"\nDepartment: "+super.department+"\nOffice Hours: "+officeHours+"\nRank:"+rank;
   }
}
