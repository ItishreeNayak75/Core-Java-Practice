class Parent {
    Parent() {
        System.out.println("Parent()");
    }
 }
 class Child extends Parent {
    Child(int x) {
        System.out.println("Child: " + x);
    }
    public static void main(String[] args) {
        new Child(30);
    }
 }
