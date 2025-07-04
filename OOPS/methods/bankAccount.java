class BankAccount{
            static String bankName="UCO";
            static String bankAddress="Bhubaneswar";
            String holderName;
            int holderPhNo;
            static void getBankName(){
           System.out.println(BankAccount.bankName);
           System.out.println(BankAccount.bankAddress);
          }
           void showaccountDetails(){
              System.out.println(this.holderName);
              System.out.println(this.holderPhNo);
          }
           public static void main(String args[]){
                 BankAccount.getBankName();
   
                 BankAccount holder1=new BankAccount();
                 holder1.holderName="Kalia";
                 holder1.holderPhNo=14332;
                 holder1.showaccountDetails();
 
                 BankAccount holder2=new BankAccount();
                 holder2.holderName="Balia";
                 holder2.holderPhNo=146762;
                 holder2.showaccountDetails();
           }
    }
 