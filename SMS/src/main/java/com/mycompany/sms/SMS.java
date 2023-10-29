
package com.mycompany.sms;

public class SMS {

    public static void main(String[] args) {
        Student rajib ;
        rajib= new RegularStudent(
                "221-115-075",
                "Rajib",
                21,
                10.00,
                "CSE",
                "56"
        );
        rajib.calculateTuition();
        rajib.displayAllInfo();
        
        rajib=new RetakeStudent(
                "221-115-075",
                "Rajib Dash",
                21,
                6.00,
                "Calculas",
                5000,
                1
        );
        rajib.displayAllInfo();
        rajib.calculateTuition();
        
        rajib= new SuppleStudent(
         "221-115-075",
                "Rajib Dash",
                21,
                6.00,
                "Vector",
                1,
                2000
        );
        rajib.displayAllInfo();
        rajib.calculateTuition();
       
    }
}
