package JavaBasic;

public class Switch {
    public static void main(String[] args) {
        var hasil = "E";

        switch (hasil){
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            default:
                System.out.println("Try Again");

        }
    }
}
