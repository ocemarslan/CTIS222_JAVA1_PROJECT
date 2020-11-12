/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsInGarage;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class ParkedInGarage {
    protected String DriverFullName;
    protected String CarPlateInside;
    protected String EnterDate;
    protected String EnterHour;
    protected double startChargeInside= 0.0;  //this will be zero for monthly submitions, so it is initially set to 0.0 
    protected String CarTypeInside;

    public ParkedInGarage() {
        this.DriverFullName = "NULL";
        this.CarPlateInside = "NULL";
        this.EnterDate = "NULL";
        this.EnterHour = "NULL";
        this.startChargeInside = 0.0;
        this.CarTypeInside = "NULL";
    }

    public ParkedInGarage(String CarPlateInside, String DriverName,String EnterDate, String EnterHour, double baseCharge, String CarTypeInside) {
        this.DriverFullName = DriverName;
        this.CarPlateInside = CarPlateInside;
        this.EnterDate = EnterDate;
        this.EnterHour = EnterHour;
        this.startChargeInside = baseCharge;
        this.CarTypeInside = CarTypeInside;
    }

    public String getCarPlateInside() {
        return CarPlateInside;
    }

   public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter driver name");
        DriverFullName=sc.next();
        System.out.println("Enter entry date");
        EnterDate=sc.next();
        System.out.println("Enter entry hour");
        EnterHour=sc.next();   
   }

    public void setCarPlateInside(String CarPlateInside) {
        this.CarPlateInside = CarPlateInside;
    }

 
    public void setCarTypeInside(String CarTypeInside) {
        this.CarTypeInside = CarTypeInside;
    }

    public double getStartChargeInside() {
        return startChargeInside;
    }
    
   public abstract void calcCharge(); 

    @Override
    public String toString() {
        return "\nEntered Car's Plate=" + CarPlateInside + "\nEntered Driver's Ful lName=" + DriverFullName + "\nEnter Date=" + EnterDate + "\nEnter Hour=" + EnterHour + "\nInitial Fee(will be updated per hours)=" + startChargeInside + "\nEntered Car's Type=" + CarTypeInside;
    }

    
   

}














