public class Person {

    protected String name, address, email_address;
    protected int phone_number;


    Person(String name, String address, String email_address, int phone_number){
    this.name = name;
    this.address = address;
    this.email_address = email_address;
    this.phone_number = phone_number;

    }

    public void setName (String name){
        this.name = name;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public void setPhone (int phone_number){
        this.phone_number = phone_number;
    }

    public void setEmail (String email_address){
        this.phone_number = phone_number;
    }


    public String getName(){
        return name;
    }

    public String getAddress (){
        return address;
    }
    public String getEmail(){
        return email_address;
    }

    public int getPhone(){
        return phone_number;
    }

    public String display(){  //toString gave me an error
        return getName()+"\n"+getAddress()+"\n"+getEmail()+"\n"+getPhone();
    }
}
