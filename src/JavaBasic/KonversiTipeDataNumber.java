package JavaBasic;

public class KonversiTipeDataNumber {
    public static void main (String[] konversiNumber) {

        //Widening Casting(Otamatis)
        //byte->short->int->long->float->double
        byte Byte = 10;
        short Short = Byte;
        int Int = Short;

        //Narrowing Casting(Manual)
        //double->float->long->int->char->short->byte
        byte Byte2 = (byte) Int;

        System.out.println(Byte2);
    }
}
