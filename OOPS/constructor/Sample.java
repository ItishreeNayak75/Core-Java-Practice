 class Sample {
    Sample() {
        System.out.println("Sample()");
    }
    Sample(String msg) {
        this();
        System.out.println("Message: " + msg);
    }
    public static void main(String[] args) {
        new Sample("Hello");
    }
 }
