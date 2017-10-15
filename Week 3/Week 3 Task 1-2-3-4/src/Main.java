
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "10 Long St", "john@email.com", 12345,
                "Janitor", 1200, "10/02/1991");
        Student s1 = new Student("James", "Oxford Rd", "student@email.com",
                12345, false, 22222222);
        Lecturer l1 = new Lecturer("Andrew", "Hillgate 12", "andrew@email.com",
                9456, "IT", 4564.0, "23/01/2003", "Doctor");
        Administrator a1 = new Administrator("Tomas", "Chocolate St", "thomas@email.com",
                555555, "Service Desk", 1234.0, "25/05/1996", "9am - 5pm", 3);


        e1.setSalary(55555);
        System.out.println("Employee 1: \n" + e1.display());
        s1.setEnrolled(true);
        System.out.println("\nStudent 1: " + s1.display());
        l1.setTitle("Phd");
        System.out.println("\nLecturer 1 " + l1.display());
        a1.setRank(2);
        System.out.println("\nAdministrator 1" + a1.display());

        System.out.println("-----------------------");
        Student homeStud1 = new Student("Alan", "Random St", "alan@email.com", 112515,
                false, 14056838);
        System.out.println("Name: " + homeStud1.getName() + "\nStudent number: " + homeStud1.getNum());

        OverseasStudent os1 = new OverseasStudent("Pierre", "Another Rd", "pierre@email.com",
                1251515, true, 525512, "Egypt");


            System.out.println("\nName: " + os1.getName() + "\nStudent number: " + os1.getNum());
            System.out.println("Country: " + os1.getCountry());


    }
}
