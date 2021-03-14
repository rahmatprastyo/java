package JavaOOP;

public class TypeCheckAndCasts {
    //konfersi type data
    public static void main(String[] args) {
        sayHello(new Employee("Code"));
        sayHello(new Manager("Math"));
        sayHello(new VicePresident("Dev"));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hallo VP " + employee.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hallo Manager " + employee.name);
        } else {
            System.out.println("Hallo Employee " + employee.name);
        }
    }
}
