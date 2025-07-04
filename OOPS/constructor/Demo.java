 class Demo {
    Demo() {
        this(10);
        System.out.println("No-arg constructor");
    }
    Demo(int x) {
        System.out.println("Parameterized constructor: " + x);
    }
    public static void main(String[] args) {
        new Demo();
    }
 }
 