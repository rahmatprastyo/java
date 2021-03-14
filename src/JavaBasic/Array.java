package JavaBasic;

public class Array {
    public static void main(String[] Array){

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Rahmat";
        arrayString[1] = "Prastyo";
        arrayString[2] = "24";
        System.out.println(arrayString[0]+" "+arrayString[1]);
        System.out.println("umur : "+arrayString[2]);

        String[] job = {"Backend","QA","Design"};
        System.out.println("job : "+job[1]+" and "+job[0]);

        int[] number = new int[]{2,4,6,8,10};
        System.out.println("number favorite : "+number[number.length-2]);

        String[][] study = new String[][]
                {{"SD","SMP","SMk","Universitas"},
                {"SDN 01 Manna","SMPN 18 Bengkulu","SMkN 02 Bengkulu","STT-PLN Jakarta"},
                {"Study ",null,null,null}};

        String[] study2 = study[2];
        System.out.println(study2[0]);
        System.out.println("---------------");
        System.out.println(study[0][0]+" : "+study[1][0]);
        System.out.println(study[0][1]+" : "+study[1][1]);
        System.out.println(study[0][2]+" : "+study[1][2]);
        System.out.println(study[0][3]+" : "+study[1][3]);
        System.out.println("---------------");
    }
}
