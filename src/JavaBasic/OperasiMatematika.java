package JavaBasic;

public class OperasiMatematika {
    public static void main(String[] Matematika){
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println();

        //augmentes assignment
        int x = 100;

        System.out.println(x += 10);
        System.out.println(x -= 10);
        System.out.println(x *= 10);
        System.out.println(x /= 10);
        System.out.println(x %= 10);

        System.out.println();
        //Unary Operator
        int y = 100;

        y++;
        System.out.println(y);

        y--;
        System.out.println(y);

        System.out.println(!true);
    }
}
