package JavaBasic;

public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80, 60, 90, 75};
        String fullName = "Rahmat Prastyo";

        sayCongrats(fullName, values);
    }

    static void sayCongrats(String name, int[] values){
        int totol = 0;
        for (int value : values){
            totol += value;
        }
        int finalValue = totol / values.length;

        if (finalValue >= 75){
            System.out.println("Congratulations ,"+name);
        } else {
            System.out.println("Try Again ,"+name);
        }
    }
}
