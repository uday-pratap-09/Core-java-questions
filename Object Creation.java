// How to create object

class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

Person person = new Person("John");
person.sayHello();