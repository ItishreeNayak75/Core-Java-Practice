class Dog{
            String name;
            String colour;
          Dog(String name ,String colour){
                this.name=name;
                this.colour=colour;
                   System.out.println("name :"+name+",colour :"+colour);
          }
         public static void main(String args[]){
            Dog d=new Dog("Kalu" ,"Black");
       }
   }