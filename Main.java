


// 'Main is the name of the class that encapsulates the methods, like 'main'
public class Main {
    public static void main(String[] args) {
//        Employee john = new Employee("John"); // creating a new Employoe using the Person class's constructor
//        System.out.println(john.name); using the Person class's method
//
//        john.sayHello();
//        System.out.println(john.name);

//        Person p = new Person (); // from Person class
//        Employee e = new Employee(); // from employee class
//
//        e.sayHello(); // from Person class
//        e.doWork(); // from Employee class

//        Person person = new Person();
//        Employee employee = new Employee();

//        person.sayHello(); // "Hello World from person class
//        employee.sayHello(); // overiding person "sayHello" method

        // Using Super keyword in SuperHero class
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"


    }
}