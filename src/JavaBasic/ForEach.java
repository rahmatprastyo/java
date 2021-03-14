package JavaBasic;

public class ForEach {
    public static void main(String[] args) {

        String[] array = {
            "Rahmat", "Prastyo", "Code", "Math", "Dev"
        };

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println();

        for (String value : array){
            System.out.println(value);
        }
    }
}
