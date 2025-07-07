interface Shape{
             double getArea();
  }
                      
  class Rectangle implements Shape{

                  public double getArea(){
                     double length=5.00;
                     double width=4.00;
                     double Rarea=length*width;
                   return Rarea;
              }
 }
  class Circle implements Shape{
                  
                  public double getArea(){
	         	double radius=2.00;
                        double Carea=2*3.141*radius;
                 return Carea;
                 }
       }
 class Triangle implements Shape{
               
                public double getArea(){
                    double  base=5.00;
                    double hight=2.00;
                    double Tarea=0.5*base*hight;
                 return Tarea;
           }
	}
  