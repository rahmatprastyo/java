package JavaBasic;

public class TipeDataBukanPrimitif {
    public static void main(String[] NonPrimitif){
        //Tipe Data Primitif adalah tipe bawaan di dalam bahasa pemrograman
        //Tipe data primitif selalu memiliki default value
        //Tipe data non primitif default value = null
        //Tipe data non primitif - tipe data object

        //Tipe Data Primitif : byte, short, int, long, float, double, char
        //Tipe Data Non Primitif : String, Byte, Short, Integer, Long, Float, Double, Character, Boolean

        Integer iniInteger = 10;
        Long iniLong = 101010101010L;

        int age = 24;
        Integer ageObject = age;

        short Short = ageObject.shortValue();
        long Long = Short;

        System.out.println(Long);
    }
}
