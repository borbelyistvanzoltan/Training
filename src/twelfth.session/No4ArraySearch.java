import java.util.Scanner;

class No4ArraySearch {
    public static void main(String[] args) {

        int[] tomb = {4,2,7,1,8,3,9};
        int flag = 0;

        System.out.println("Amelyik számot keressuk: ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        for(int i=0;i<tomb.length;i++){
            if (x==tomb[i]){
                System.out.println("Sikeresen megtalaltam, a kovetkezo pozicion "+ i);
                flag = 1;
                break;
            }
        }

        if(flag==0){
            System.out.println("Nem talaltam meg az elemet.");
        }

    }
}
