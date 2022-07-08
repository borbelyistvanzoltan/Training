package sixth.session.object.and.clas;

class Student2 {
    int id = 007;
    String name = "Bela";
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1 {
    public static void main(String args[]){
        Student2 s1=new Student2();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
