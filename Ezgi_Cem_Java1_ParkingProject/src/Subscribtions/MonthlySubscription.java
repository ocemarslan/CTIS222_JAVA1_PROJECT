/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subscribtions;

import java.util.Scanner;

/**
 *
 * @author CemArslan
 */
public abstract class MonthlySubscription {
    protected String carPlate;
    protected String driverFullName;
    protected String subscriptionDate;
    protected String carType;
    protected double baseMounthlyFee = 300;
    protected double calculatedFee;

    public String getCarPlate() {
        return carPlate;
    }
    
    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
    
    
    
    public abstract void calcMonthlyFee();
    

   public void getInput(){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Please enter Driver Name and Surname:");
       this.driverFullName=sc.nextLine();   
  
       System.out.println("Please enter Subscription Date (i.e 11/04/2020):");
       this.subscriptionDate=sc.next();
       
    }
   
       public MonthlySubscription() {
    }


    public MonthlySubscription(String carPlate, String driverFullName, String subscriptionDate, String carType, double calculatedFee) {
        this.carPlate = carPlate;
        this.driverFullName = driverFullName;
        this.subscriptionDate = subscriptionDate;
        this.carType = carType;
        this.calculatedFee = calculatedFee;
    }
    public boolean findPlate(String enteredPlate)
    {
        if(this.carPlate.equalsIgnoreCase(enteredPlate))
        {
            return true;
        }
        return false;
    }
 
   
    @Override
    public String toString() {
        return "\nDriver's Full Name=" + driverFullName + "\nCar Plate=" + carPlate + "\nCar Type=" + carType + "\nSubscription Date=" + subscriptionDate + "\nYou need to pay=" + calculatedFee;
    }
    
    
   
   
   

    
        
}





















