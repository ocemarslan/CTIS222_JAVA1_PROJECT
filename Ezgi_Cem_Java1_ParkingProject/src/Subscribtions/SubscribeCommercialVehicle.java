/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subscribtions;

import java.util.Scanner;

/**
 *
 * @author EzgiCetin
 */
public class SubscribeCommercialVehicle extends MonthlySubscription{
    private String CompanyName;
    
    public SubscribeCommercialVehicle(){
    
    }

    public SubscribeCommercialVehicle(String CompanyName, String carPlate, String driverFullName, String subscriptionDate, String carType, double calculatedFee) {
        super(carPlate, driverFullName, subscriptionDate, carType, calculatedFee);
        this.CompanyName = CompanyName;
    }

    @Override
    public void calcMonthlyFee() {
        calculatedFee=baseMounthlyFee+200;
    }
    
    
    public void getInput(){
        Scanner sc= new Scanner(System.in);
        
        super.getInput();
        
        System.out.println("Please enter Company Name:");
        this.CompanyName=sc.nextLine();
    }

    @Override
    public String toString() {
        return "\nCommertial Vehicle Monthly Subscription" + super.toString() + "\nCommertial Company's Name=" + CompanyName;
    }
    
    
    
    


    
    
    
    
    
}





















