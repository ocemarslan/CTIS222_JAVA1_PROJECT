/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsInGarage;

import java.util.Scanner;

/**
 *
 * @author EzgiCetin
 */
public class DailyCommercialCharge extends ParkedInGarage {

    private String companyName;

    public DailyCommercialCharge() {
        companyName = "Null";
    }

    public DailyCommercialCharge(String DriverName, String CarPlateInside, String EnterDate, String EnterHour, double baseCharge, String CarTypeInside,String companyName) {
        super(DriverName, CarPlateInside, EnterDate, EnterHour, baseCharge, CarTypeInside);
        this.companyName = companyName;
    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        
        super.getInput();
        
        System.out.println("Enter the Company Name that car belongs to:");
        companyName = sc.next();

    }

    @Override
    public void calcCharge() {
        startChargeInside+=10; //hourly charge for parking a COMMERTIAL CAR
    }

    @Override
    public String toString() {
        return "Daily Commercial Vehicle's Information" + super.toString() + "\nCompany Name=" + companyName;
    }

}




