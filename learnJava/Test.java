class A{
    public A() {
        System.out.println("No arg constructor of A");
    }
}
class B extends A{
    public B(){
        //super();
        System.out.println("No arg constructor of B");
    }
    public B(int a){
        this();
        System.out.println("Arg constructor of B");
    }
    A a = new A();

}
public class Test {
    public static void main(String[] args) {
        B b = new B(21);
    }
}