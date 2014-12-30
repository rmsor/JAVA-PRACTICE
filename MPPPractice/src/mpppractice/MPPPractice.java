package mpppractice;
interface X {
    int x = 1;
}
class T implements X {
    int f = 1;
    public int m1() {
        f = f + this.m2() + x;
        return f;
    }
    public int m2() {
        return 2;
    }
}
class S extends T {
    public int m1() {
        return super.m1();
    }
    public int m2() {
        return 3;
    }
}
class U extends S {
    public int m1() {
        return super.m1();
    }
    public int m2() {
        return super.m2() + x;
    }
}
public class MPPPractice {
    public static void main(String[] args) {
        T t = new T();
        T s = new S();
        T u = new U();
        System.out.println(t.m1());
        System.out.println(s.m1());
        System.out.println(u.m1());
        System.out.println(t.m1());
        System.out.println(s.m1());
        System.out.println(u.m1());
        System.out.println(t.m2());
        System.out.println(s.m2());
        System.out.println(u.m2());
        test tst=new testInt();
       // tst.print();
        tst.test();;
        
    }
}
