package JavaBasic;

public class IfStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 90;

        if (nilai >= 80 && absen >= 80){
            System.out.println("Lulus Coding Nilai A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Lulus Coding Nilai B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Lulus Coding Nilai C");
        } else {
            System.out.println("Try Again");
        }
    }
}
