class Q11 {
    static int x = 10;
    static int y;
    static {
        y = x * 2;
    }
    public static void main(String[] args) {
        System.out.println("y = " + y);
       }
   }