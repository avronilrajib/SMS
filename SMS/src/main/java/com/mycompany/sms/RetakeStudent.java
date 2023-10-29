
package com.mycompany.sms;

//the RetakeStudent class (subclass) inherits the attributes and methods from the Student class (superclass)
public class RetakeStudent extends Student {
    
    // The RetakeStudent class has Three properties namely retakeSubject,retakefee And numberOfRetakeSub.
    private String retakeSubject;
    private double retakefee;
    private int numberOfRetakeSub;

    public RetakeStudent() {
    }
    
     public RetakeStudent(String studentId, String name, int age, double grade,String retakeSubject,double retakefee,int numberOfRetakeSub) {
       super(studentId,name,age,grade);
      this.retakeSubject=retakeSubject;
      this.retakefee=retakefee;
      this.numberOfRetakeSub=numberOfRetakeSub;
    }
    //displayAllInfo() A method used to print all information.
     @Override
    void displayAllInfo(){
        super.displayAllInfo();
        System.out.println("Retake Subject: "+retakeSubject);
        System.out.println("Retake Fee: "+retakefee +" Taka");
         System.out.println("Number Of Retake Subject: "+numberOfRetakeSub);
    }
    
    double monthlyfree=5000;
//calculateTuition() A Method used for calculate of Retake Students tuition fee
   @Override
     void calculateTuition(){ 
         double answer=retakefee*numberOfRetakeSub;
         double answerTwo=answer+monthlyfree;
        System.out.println("Retake Fee: "+answer +" Taka");
        System.out.println("Monthly Fee Plus Retake Fee: "+answerTwo+" Taka");
      
     }

    public String getRetakeSubject() {
        return retakeSubject;
    }

    public void setRetakeSubject(String retakeSubject) {
        this.retakeSubject = retakeSubject;
    }

    public double getRetakefee() {
        return retakefee;
    }

    public void setRetakefee(double retakefee) {
        this.retakefee = retakefee;
    }

    public int getNumberOfRetakeSub() {
        return numberOfRetakeSub;
    }

    public void setNumberOfRetakeSub(int numberOfRetakeSub) {
        this.numberOfRetakeSub = numberOfRetakeSub;
    }

    public double getMonthlyfree() {
        return monthlyfree;
    }

    public void setMonthlyfree(double monthlyfree) {
        this.monthlyfree = monthlyfree;
    }
     
     
}
