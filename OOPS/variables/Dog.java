
class Dog {
    static String breed;
    String name;
    static {
        breed = "Labrador";
        System.out.println("Static Block: Breed initialized");
    }
    {
    }
        name = "Tommy";
        System.out.println("Instance Block: Dog name is " + name);
    Dog() {
        System.out.println("Constructor: Breed is " + breed);
    }
    public static void main(String[] args) {
        Dog d = new Dog();
    }
 }
