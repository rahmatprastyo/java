package JavaOOP;

public class ManagarApp {
    public static void main(String[] args) {
//        var manager = new Manager("Prastyo");
////        manager.name = "Prastyo";
//        manager.sayHello("Rahmat");
//
//        var vicePresident = new VicePresident("Muri");
////        vicePresident.name = "Muri";
//        vicePresident.sayHello("Pramesti");

        //polymorphism : kemampuan sebuah objek berubah bentuk menjadi bentuk yang lain
        Employee employee = new Employee("Rahmat");
        employee.sayHello("Prastyo");

        employee = new Manager("Rahmat1");
        employee.sayHello("Prastyo1");

        employee = new VicePresident("Rahmat2");
        employee.sayHello("Prastyo2");

    }

}
