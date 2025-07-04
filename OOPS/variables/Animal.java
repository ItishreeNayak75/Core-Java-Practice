
class Animal {
    static int count = 0;
    {
        count++;
        System.out.println("Animal created. Count = " + count);
    }
    Animal() {
        System.out.println("Animal Constructor");
    }
    public static void main(String[] args) {
        new Animal();
        new Animal();
    }
 }
