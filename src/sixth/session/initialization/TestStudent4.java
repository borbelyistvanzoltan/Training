package sixth.session.initialization;

class Student2{
    int rollno;
    String name;

    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
}
class TestStudent4{
    public static void main(String args[]){
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.insertRecord(111,"Adam");
        s2.insertRecord(222,"Eva");
        s1.displayInformation();
        s2.displayInformation();
    }
}
