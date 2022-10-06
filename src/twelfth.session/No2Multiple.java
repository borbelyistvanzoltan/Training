import java.util.Scanner;

class No2Multiple {
    public static void main(String[] args) {

        System.out.println("Adj meg egy egesz szamot: ");
        Scanner sc = new Scanner(System.in);
        int number =Integer.parseInt(sc.nextLine());

        if((number%5==0)&&(number%7==0)){
            System.out.println(number+" az 5-el es 7-el is oszthato");
        }
        else{
            System.out.println(number+" nem oszthato 5-el es 7-el");
        }
    }
}
