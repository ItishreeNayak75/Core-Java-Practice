class Q8 {
    static int x = 100;
    static {
        if (x > 50) {
            x += 25;
        }
    }
    public static void main(String[] args) {
        System.out.println("x = " + x);
      }
  }