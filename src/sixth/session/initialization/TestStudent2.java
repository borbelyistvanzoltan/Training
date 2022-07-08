package sixth.session.initialization;

class Student{
    int id;
    String name;
    String text;
}
class TestStudent2{
    public static void main(String args[]){
        Student s1=new Student();
        s1.id=101;
        s1.name="Bela";
        s1.text = "asfasfa";
        System.out.println(s1.id+" "+s1.name);//printing members with a white space
    }
}
