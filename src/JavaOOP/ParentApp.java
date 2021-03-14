package JavaOOP;

public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Prastyo";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.name = "Rahmat";
        parent.doIt();
        System.out.println(parent.name);
    }
}
