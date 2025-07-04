 class X {
    X() {
    }
        this(5);
        System.out.println("X()");
    X(int a) {
        System.out.println("X(int): " + a);
    }
    public static void main(String[] args) {
        new X();
    }
 }
