package eleventh.session.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {

        //creating instance of Account class
        Account acc = new Account();

        //setting values through setter methods
        acc.setAcc_no("16438539-13527643-82583566");
        acc.setName("Csóró János");
        acc.setEmail("csorojanos@gmail.com");
        acc.setAmount(10000);

        //getting values through getter methods
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
