import java.util.Scanner;

class No1Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ahany szamot be szeretnel olvasni: ");
        int count = Integer.parseInt(sc.nextLine());
        float sum = 0;

        for(int i=0; i<count; i++) {
            System.out.println("Adj meg egy szamot: ");
            int x = Integer.parseInt(sc.nextLine());
            sum = sum + x;
        }

        float avg = sum/count;
        System.out.println("Az atlag: " + avg);
    }
}
