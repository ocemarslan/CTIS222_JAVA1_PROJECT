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
public class SubscribePrivateCar extends MonthlySubscription{
    private String brand;
    private String modelYear;
    private String modelName;

    @Override
    public void calcMonthlyFee() {
        calculatedFee=baseMounthlyFee+150;
    }

    public SubscribePrivateCar() {
        
    }
    
    

    public SubscribePrivateCar(String carPlate, String driverFullName, String subscriptionDate, String carType, double calculatedFee,String brand, String modelYear, String modelName) {
        super(carPlate, driverFullName, subscriptionDate, carType, calculatedFee);
        this.brand = brand;
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
    
    
    public void getInput(){
        Scanner sc=new Scanner(System.in);
        
        super.getInput();
        
        System.out.println("Please enter Car brand:");
        this.brand=sc.next();
        
        System.out.println("Please enter Model Year:");
        this.modelYear=sc.next();
        
        System.out.println("Please enter Model Name:");
        this.modelName=sc.next();
    }

    @Override
    public String toString() {
        return "\nPrivate Car Monthly Subscription" + super.toString() + "\nBrand=" + brand + "\nModel Year=" + modelYear + "\nModel Name=" + modelName;
    }
    
    
    

   
    
    
    
    
    
    
    
    
}









