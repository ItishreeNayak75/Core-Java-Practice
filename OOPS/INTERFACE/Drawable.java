interface Drawable{
                 void draw();
 }
 class Rectangle implements Drawable {
            				public void draw() {
                                                System.out.println("rectangle");
                                      }
                              }
  class Circle implements Drawable {
                                     public void draw() {
                                                System.out.println("circle");
                                      }
				 }
  class Triangle implements Drawable{
 					public void draw(){
                                                System.out.println("tringle");
                                      }
				 }