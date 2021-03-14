package JavaBasic;

public class Variable {
    public static void main(String[] Variable){
        //variable di java harus sesuai dengan tipe data
        //String != int
        //int != String

        String name;
        name = "Rahmat Prastyo";

        int age = 30;
        String address = "Cemara";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        //version java 10++
        var belajar = "coding";
        var day = 100;
        System.out.print(belajar+" "+day);
    }
}
