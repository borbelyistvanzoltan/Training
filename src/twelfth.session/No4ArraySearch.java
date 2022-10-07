import java.util.Scanner;

class No4ArraySearch {
    public static void main(String[] args) {

        int tomb[] = {4,2,7,1,8,2,9};
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Amelyik szamot keressuk: ");
        int x = Integer.parseInt(sc.nextLine());

        for(int i=0; i < tomb.length; i++) {
            if(x==tomb[i]) {
                System.out.println("Sikeresen megtalaltam az erteket a kovetkezo pozicion: " + i);
                flag = 1;
                break;
            }
        }

        if(flag == 0) {
            System.out.println("Nem talaltam meg az elemet.");
        }

    }
}
