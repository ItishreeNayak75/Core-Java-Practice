 class Alpha {
    Alpha() {
        System.out.println("Alpha()");
    }
 }
class Beta extends Alpha {
    Beta() {
        this("Beta");
        System.out.println("Beta()");
    }
    Beta(String name) {
        System.out.println("Beta(String): " + name);
    }
    public static void main(String[] args) {
        new Beta();
    }
 }
