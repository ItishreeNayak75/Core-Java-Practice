class Hospital{
            static String hospitalName="Amri";
            static String hospitalAddress="Bhubaneswar";
            String patientName;
            int bedNumber;
          static void showHospitalInfo(){
                 System.out.println(Hospital.hospitalName);
                 System.out.println(Hospital.hospitalAddress);
            }
            void admitPatient(){
                  System.out.println(this.patientName);
                  System.out.println(this.bedNumber);
              }
             public static void main(String args[]){
                Hospital.showHospitalInfo();
              
               Hospital patient1=new Hospital();
               patient1.patientName="Radha";
               patient1.bedNumber=203;
               patient1.admitPatient();
 
               Hospital patient2=new Hospital();
               patient2.patientName="Krishna";
               patient2.bedNumber=206;
               patient2.admitPatient();
 

          }
   }
