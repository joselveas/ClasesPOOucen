interface Transformar{
    public int transformar(int m);
    public int destransformar(int n);
}

class A implements Transformar{
    private int x;
    private int y;
    public A(){this.x=0;this.y=0;}
    public A(int x, int y){this.x=x;this.y=y;}
    public int transformar(int m){return this.y + m;};
    public int destransformar(int n){return this.x + n;};
}

class B extends A{
    private int x;
    private int y;
    public B(){super();}
    public B(int x, int y){super();this.x=x;this.y=y;}
    public int transformar(int m){return this.y + m + 1;};
    public int destransformar(int n){return this.x + n;};
}

class C extends B{
    private int x;
    private int y;
    public C(){super();}
    public C(int x, int y){super(x, y);this.x=x;this.y=y;}
    public int transformar(int m){return this.x + (this.x * m);};
    public int destransformar(int n){return this.y + ( this.y * (n+1)) ;};
}

public class Main 
{
    public static void main(String[] args) 
    {
        A a = new A();
        A b = new B();
        A c = new C();
        A a1 = new A(1,2);
        B b1 = new B(2,2);
        C c1 = new C(1,2);
        for(int i=0;i<3;i++){
            System.out.println(a.transformar(i));
            System.out.println(b.transformar(i));
            System.out.println(c.transformar(i));
            System.out.println(a1.transformar(i));
            System.out.println(b1.transformar(i));
            System.out.println(c1.transformar(i));
        }
    }
}