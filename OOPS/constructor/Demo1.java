 class Demo1 {
    Demo1() {
        this("Demo");
        System.out.println("Inside Demo()");
    }
    Demo1(String s) {
        this(100);
        System.out.println("Demo(String): " + s);
    }
    Demo1(int x) {
        System.out.println("Demo(int): " + x);
    }
    public static void main(String[] args) {
        new Demo1();
    }
 }
