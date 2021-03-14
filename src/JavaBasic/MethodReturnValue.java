package JavaBasic;

public class MethodReturnValue {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        int c = sum(a, b);
        System.out.println(c);

        var result1 = sum(20, 20);
        System.out.println(result1);

        var result2 =hitung(40, "+", 40);
        System.out.println(result2);

        System.out.println(hitung(120, "-", 20));

    }

    static int sum(int valueA, int valueB){
        int total = valueA + valueB;
        return total;
    }

    static int hitung(int valueA, String operasi, int valueB){
        switch (operasi){
            case "+":
                return valueA + valueB;
            case "-":
                return valueA - valueB;
            default:
                return 0;
        }
    }
}
