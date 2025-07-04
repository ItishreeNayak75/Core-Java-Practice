 class Base {
    Base(int x) {
        System.out.println("Base: " + x);
    }
 }
 class Derived extends Base {
    Derived() {
        super(50);
        System.out.println("Derived constructor");
    }
    public static void main(String[] args) {
        new Derived();
    }
 }
