 class Q12 {
    static int a = 5;
    static int b = 10;
    static int c;
    static {
        c = a + b;
        System.out.println("Static block executed");
    }
    public static void main(String[] args) {
        System.out.println("c = " + c);
        }
    }