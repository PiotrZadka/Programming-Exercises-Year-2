public class Person {
    private int age;
    private String name;

    Person(String name, int age){
    this.name = name;
    this.age = age;
    }

    Person(Person p){  // passing values from first constructor
    name = p.name;
    age = p.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static Person newInstance(Person p){  //clone instance of a person
        Person newPerson = new Person(p);
        return newPerson;
    }
}
