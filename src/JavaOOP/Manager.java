package JavaOOP;

//mempelajari inheritance
//class parent
class Manager extends Employee{

    String company;

    Manager(String name){
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi, "+ name + ", My manager is " + this.name);
        //this.name adalah bukan variable dari parameter name tpi dari variable name
    }

}
