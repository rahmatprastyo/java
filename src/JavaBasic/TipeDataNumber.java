package JavaBasic;

public class TipeDataNumber {
    public static void main(String[] TipeData) {
        //Tipe Data Number
        //1.Integer Number              //memakan memori
        byte Byte = 100;                //1 byte
        short Short = 1000;             //2 bytes
        int Int = 10000000;             //4 bytes
        long Long = 1000000000;         //8 bytes
        long Long2 = 100000000000000L;

        //2.Floating Point Number
        float Float = 10.26F;           //4 bytes
        double Double = 12.242424;      //8 bytes

        //3.Literals Number
        int decimalInt = 25;
        int hexInt  = 0xA132B;          //dimulai dari 0x
        int binInt = 0b010101;          //dimulai dari 0b

        //Underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

    }


}
