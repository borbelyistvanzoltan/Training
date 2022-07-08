package fifth.session;

public class Operators {
    public static void main(String args[]) {

        // Postfix, prefix:
        int x=10;
        System.out.println(x++); //10 (11)
        System.out.println(x);
        System.out.println(++x); //12
        System.out.println(x--); //12 (11)
        System.out.println(--x); //10

        int a=10;
        int b=10;
        System.out.println(a++ + ++a); //10+12=22
        System.out.println(b++ + b++); //10+11=21


        boolean c = true;
        boolean d = false;
        System.out.println(!c); //false (opposite of boolean value)
        System.out.println(!d); //true


        // Arithmetic Operator
        int e=10;
        int f=5;
        System.out.println(e+f); //15
        System.out.println(e-f); //5
        System.out.println(e*f); //50
        System.out.println(e / f); //2
        System.out.println(e % f); //0


        System.out.println(10*10/5+3-1*4/2); //21


        // Left shift operator
        System.out.println(10<<2); //10*2^2=10*4=40
        System.out.println(10<<3); //10*2^3=10*8=80
        System.out.println(20<<2); //20*2^2=20*4=80
        System.out.println(15<<4); //15*2^4=15*16=240

        // Right shift operator
        System.out.println(10>>2); //10/2^2=10/4=2
        System.out.println(20>>2); //20/2^2=20/4=5
        System.out.println(20>>3); //20/2^3=20/8=2


        // Logical && and Bitwise &
        int g=10;
        int h=5;
        int i=20;
        System.out.println(g<h && g<i);//false && true = false
        System.out.println(g<h & g<i);//false & true = false


        // Logical || and Bitwise |
        int j=10;
        int k=5;
        int l=20;
        System.out.println(j>k || j<l);//true || true = true
        System.out.println(j>k | j<l);//true | true = true
        // || vs |
        System.out.println(j>k || j++ < l); //true || true = true
        System.out.println(j); //10 because second condition is not checked
        System.out.println(j>k | j++<l); //true | true = true
        System.out.println(j); //11 because second condition is checked


        // Ternary Operator - used as one line replacement for if-then-else statement
        int m=2;
        int n=5;
        int min=(m<n) ? m : n;
        System.out.println(min);

        // Assignment Operator
        int p=10;
        int q=20;
        p += 4; //p=p+4 (p=10+4)
        q -= 4; //q=q-4 (q=20-4)
        System.out.println(p);
        System.out.println(q);

        int r = 10;
        r *= 4;
        System.out.println(r);
        r /= 4;
        System.out.println(r);

    }
}
