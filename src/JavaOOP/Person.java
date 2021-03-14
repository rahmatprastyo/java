package JavaOOP;

//class -> blueprint / prototife untuk membuat object
class Person {

    //Object berisikan -> Field / Properties /atributes : data yang disisipak di dalam object
    String name;
    String address;
    final String country = "Indonesia";

    //Construktor : method yang akan di panggil saat pertama kali object itu di buat
    //penamaan harus sama dengan kelas
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName){
        this(paramName,null);
    }

    Person(){
        this(null);
    }

    //method
    void sayHello(String paramName){

        System.out.println("Hello, " + paramName + ". My name is " + name);
    }

}
