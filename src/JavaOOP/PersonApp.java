package JavaOOP;

public class PersonApp {
    public static void main(String[] args) {
        //object : hasil instansiasi dari sebuah class
        var person1 = new Person("Rahmat", "Bengkulu");

        System.out.println(person1.name + " " + person1.address);

        var person2 = new Person("Prastyo");

        System.out.println(person2.name);

        var person3 = new Person();

        System.out.println(person3.country);

//        person1.name = "Eko";
//        person1.address = "Bengkulu";
//        //person1.country -> final

//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        System.out.println(person1.country);

        person1.sayHello("Budi");

//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();
    }
}


