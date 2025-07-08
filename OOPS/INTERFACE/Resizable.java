interface Resizable{
                 void resizeWidth(int width);
                 void resizeHeight(int height);
}
class Rectangle implements Resizable{
                                    int width;
                                    int height;
                Rectangle(int width,int heigtht){
                           this.width=width;
                           this.height=height;
                 }
                 public void resizeWidth(int width){
                              this.width=width;
                    		System.out.println(" width size :"+this.width);
                 }
                 public void resizeHeight(int height){
                              this.height=height;
                    		System.out.println(" Height size :"+this.height);
                 }
                   public void size(){
					System.out.println("current size of width:"+this.width+" , current size of height :"+height);
                 }

        }                  

 