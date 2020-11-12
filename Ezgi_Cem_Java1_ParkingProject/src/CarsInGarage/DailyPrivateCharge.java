/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsInGarage;

/**
 *
 * @author EzgiCetin
 */
public class DailyPrivateCharge extends ParkedInGarage{
    private String carModelYear;
    private String carModelName;
    private String carColor;
    private String carBrand;

    public DailyPrivateCharge() {
        
    }

    public DailyPrivateCharge(String CarPlateInside,String DriverName,String EnterDate, String EnterHour, double baseCharge, String CarTypeInside,String carModelYear, String carModelName, String carColor,String carBrand) {
        super(DriverName, CarPlateInside, EnterDate, EnterHour, baseCharge, CarTypeInside);
        this.carModelYear = carModelYear;
        this.carModelName = carModelName;
        this.carColor = carColor;
        this.carBrand=carBrand;
    }

    @Override
    public String toString() {
        return  "Daily Private Car's Information" + super.toString()+ "\nCar's Brand=" + carBrand + "\nCar's Model Year=" + carModelYear + "\nCar's ModelName=" + carModelName + "\nCarColor=" + carColor;
    }

    @Override
    public void calcCharge() {
        startChargeInside+=7; // parking fee per hour for private cars will be updated as +=7
    }
    
    
    
    
}









