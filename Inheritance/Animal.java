class Animal{
            void makeSound(){
                  System.out.println("Animal sound");
              }
                 
 static class  Cat extends Animal{
              void makeSound(){
                System.out.println("Bark");
              }
        }
            
               public static void main(String args[]){
                 Animal myCat= new Cat();
                 myCat.makeSound();
             }
       }       
