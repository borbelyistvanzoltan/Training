import java.util.Scanner;

class No1Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ahany szamot be szeretnel olvasni: ");
        int count = Integer.parseInt(sc.nextLine());

        float sum = 0;

        for(int i=0; i<count; i++) {
            System.out.println("Adj be egy szamot: ");
            sum += Integer.parseInt(sc.nextLine());
        }

        System.out.println(sum/count);
    }
}
