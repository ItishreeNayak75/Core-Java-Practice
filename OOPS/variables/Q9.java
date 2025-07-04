 class Q9 {
    static int x;
    static {
        x = 1;
        x = x + 1;
        x = x + 1;
    }
    public static void main(String[] args) {
        System.out.println("x = " + x);
 }
}