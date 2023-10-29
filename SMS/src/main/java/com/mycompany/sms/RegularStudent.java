
package com.mycompany.sms;

//the RegularStudent class (subclass) inherits the attributes and methods from the Student class (superclass)
public class RegularStudent extends Student {
    
    // The RegularStudent class has Two properties namely Dept And batch.
    private String Dept,batch;

    
// The student class has two constructors, one is the default, and another one 
//is overloaded to accept all  properties and set them to object properties.
    public RegularStudent() {
    }
    
     public RegularStudent(String studentId, String name, int age, double grade,String Dept,String batch) {
         
       //A subclass can call a constructor defined by its superclass by use of the following form of super()
      
       super(studentId,name,age,grade);
       
       this.Dept=Dept;
       this.batch=batch;
    }
   
     //displayAllInfo() A method used to print all information.
    @Override
    void displayAllInfo(){
        //super.displayAllInfo() is used to call superclass methods
        super.displayAllInfo();
        System.out.println("Department: "+Dept);
        System.out.println("Batch: "+batch);
    }
    
      double monthlyfree=5000;
       double gpa=super.getGrade();
       
     //calculateTuition() A Method used for calculate of Regular students tuition fee
   @Override
     void calculateTuition(){ 
         
         if(gpa<8){
             double tuition= monthlyfree*5/100;
             double ans= 5000-tuition;
             System.out.println("Tuition: "+ ans);
         }
         else if(gpa>=8 && gpa<9){
            double tuition= monthlyfree*15/100;
             double ans= 5000-tuition;
             System.out.println("Tuition: "+ ans);
       }else if(gpa>9 && gpa<10){
            double tuition= monthlyfree*50/100;
             double ans= 5000-tuition;
             System.out.println("Tuition: "+ ans);
       }else{
            double tuition= monthlyfree*80/100;
             double ans= 5000-tuition;
             System.out.println("Tuition: "+ ans);
       }
      
     }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMonthlyfree() {
        return monthlyfree;
    }

    public void setMonthlyfree(double monthlyfree) {
        this.monthlyfree = monthlyfree;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
     
     
}
