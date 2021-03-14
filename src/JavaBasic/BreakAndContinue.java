package JavaBasic;

public class BreakAndContinue {
    public static void main(String[] args) {
        int counter = 1;
        while (true){
            System.out.println("Coding "+counter);
            counter++;

            if (counter > 10 ){
                break;
            }
        }

        System.out.println("break coding");

        //continue
        for (int i=1; i<=100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Coding ganjil "+i);
        }
    }
}
