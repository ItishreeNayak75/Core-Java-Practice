 class Q6 {
    static int a;
    static int b;
    static {
        a = 2;
        b = a * 10;
    }
    public static void main(String[] args) {
        System.out.println("b = " + b);
      }
  }