interface Animal{
            void bark();
   }
      class Dog implements Animal{
               public void bark(){
          System.out.println("Dog is Barking");
       }
    }
    class Test{
            public static void main(String args[]){
          Dog dog1=new Dog();
           dog1.bark();
       }
   }