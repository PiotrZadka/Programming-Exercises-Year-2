public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Josh", 20);
        Person person2 = Person.newInstance(person1);  // copy person1


        System.out.println("First person name is "+person1.getName());
        System.out.println("And he is "+person1.getAge());

        System.out.println("Second person name is "+person2.getName());
        System.out.println("And he is "+person2.getAge());

        person1.setName("Andrew");
        person1.setAge(25);
        person2.setName("Michael");
        person2.setAge(30);

        System.out.println("First person new name is "+person1.getName());
        System.out.println("And he is now "+person1.getAge());
        System.out.println("Second person new name is "+person2.getName());
        System.out.println("And he is now "+person2.getAge());

    }
}
