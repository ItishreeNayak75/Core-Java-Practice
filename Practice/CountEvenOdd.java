class CountEvenOdd{
                 public static  void main(String args[]){
                   int even =0;
                   int odd=0;
                   int num=1;
                  do{
                        if(num%2==0){
                   even++;
                 }else{
                   odd++;
                 }
                num++;
               }while(num <=100);
                System.out.println("total even is :" +even);
                System.out.println("total odd is :" +odd);
            }
    }

 