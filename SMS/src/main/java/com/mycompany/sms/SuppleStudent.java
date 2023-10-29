
package com.mycompany.sms;

//the SuppleStudent class (subclass) inherits the attributes and methods from the Student class (superclass)
public class SuppleStudent extends Student{
    // The SuppleStudent class has three properties namely suppleSubject,numOfSupSub And suppleFee.   
    private String suppleSubject;
    private int numOfSupSub;
    private double suppleFee;

    public SuppleStudent() {
    }
    
     public SuppleStudent(String studentId, String name, int age, double grade,String suppleSubject,int numOfSupSub,double suppleFee) {
       super(studentId,name,age,grade);
       this.suppleSubject=suppleSubject;
       this.numOfSupSub=numOfSupSub;
       this.suppleFee=suppleFee;
    }

    public String getSuppleSubject() {
        return suppleSubject;
    }

    public void setSuppleSubject(String suppleSubject) {
        this.suppleSubject = suppleSubject;
    }

    public int getNumOfSupSub() {
        return numOfSupSub;
    }

    public void setNumOfSupSub(int numOfSupSub) {
        this.numOfSupSub = numOfSupSub;
    }

    public double getSuppleFee() {
        return suppleFee;
    }

    public void setSuppleFee(double suppleFee) {
        this.suppleFee = suppleFee;
    }
    //displayAllInfo() A method used to print all information. 
    @Override
    void displayAllInfo(){
        super.displayAllInfo();
        System.out.println("Supple Subject: "+suppleSubject);
        System.out.println("Number Of Supple Subject: "+ numOfSupSub);
    }
    
     double monthlyfree=5000;
//calculateTuition() A Method used for calculate of Supple Students tuition fee
   @Override
     void calculateTuition(){ 
         double answer=suppleFee*numOfSupSub;
         double answerTwo=answer+monthlyfree;
        System.out.println("Supple Fee: "+answer +" Taka");
        System.out.println("Monthly Fee Plus Supple Fee: "+answerTwo +" Taka");
      
     }
}
