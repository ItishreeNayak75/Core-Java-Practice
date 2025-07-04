 class Q13 {
    static int count = 0;
    static {
        for (int i = 1; i <= 5; i++) {
            count += i;
        }
    }
    public static void main(String[] args) {
        System.out.println("count = " + count);
       }
 }