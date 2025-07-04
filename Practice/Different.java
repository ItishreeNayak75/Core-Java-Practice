

class Different {
    public static void main(String[] args) {
        int num = 100;
        int ld = num % 100;
        int sld = (num / 100) % 10;
        int tld = (num / 100) / 10;
        
        if (ld != sld && ld != tld && sld != tld) {
            System.out.println("different");
        } else {
            System.out.println("not different");
        }
    }
}