public class Contact {

    String name, email;

    Contact(){
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Name: " + name+ "\r\nEmail: " + email +"\r\n";
    }

}
