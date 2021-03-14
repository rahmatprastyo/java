package JavaOOP;

//class child
class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hi, "+ name + ", My vp is " + this.name);
        //this.name adalah bukan variable dari parameter name tpi dari variable name
    }
}
