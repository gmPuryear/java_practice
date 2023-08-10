class Person {
//    public String name;

//    public Person(String name) {
//        this.name = name;
//    }

//    public void sayHello() {
//        System.out.println("Hello from " + name + "!");
//    }
//    public void sayHello() {
//        System.out.println("Hello, Youwhoo!");
//    }

    // access modifiers (Often times it is the case that we want a field to be visible only to
    // superclasses and subclasses, but not to classes that use instances of these classes.
    // To provide this functionality, we can also designate a field as protected. This means that the field is not
    // visible outside of the class, but is visible to classes that extend the class that the field is defined in.)
//    protected String name;
//    private int age;

    // Super Keyword
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

