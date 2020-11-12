/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import CarsInGarage.DailyCommercialCharge;
import CarsInGarage.DailyPrivateCharge;
import CarsInGarage.ParkedInGarage;
import Subscribtions.MonthlySubscription;
import Subscribtions.SubscribeCommercialVehicle;
import Subscribtions.SubscribePrivateCar;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CemArslan
 */
public class SystemGeneral {

    public static ArrayList<Subscribtions.MonthlySubscription> subsArr = new ArrayList<MonthlySubscription>();
    public static ArrayList<CarsInGarage.ParkedInGarage> insideCarsArr = new ArrayList<>();

    public static boolean checkSubsPlate(String plate) {
        for (int i = 0; i < subsArr.size(); i++) {
            MonthlySubscription get = subsArr.get(i);
            if (get.findPlate(plate)) {
                return true;
            }
        }
        return false;
    }

    public static String searchOneCarFromSubs(String showPlate) {
        String show = "";

        for (int i = 0; i < subsArr.size(); i++) {
            MonthlySubscription get = subsArr.get(i);
            if (get.getCarPlate().equalsIgnoreCase(showPlate)) {
                show += get.toString();
                return show;
            }
        }
        return "Car plate could not be found in Subscriptions!\n";

    }

    public static String showAllSubs() {
        String showAll = "";

        for (int i = 0; i < subsArr.size(); i++) {
            MonthlySubscription get = subsArr.get(i);
            showAll += get.toString();
        }
        return showAll;
    }

    public static void addSubs() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter which type of car you want to enter (Commertial/Private): ");
        String carType = sc.next();

        System.out.println("Enter Car Plate (i.e 35YB678):");
        String userTakenPlate = sc.next();

        if (checkSubsPlate(userTakenPlate)) {
            System.out.println("\nCar has been already subscribed.!\n");
        } else {
            if (carType.equalsIgnoreCase("Commertial")) {
                SubscribeCommercialVehicle newCommertialSubscription = new SubscribeCommercialVehicle();
                newCommertialSubscription.setCarPlate(userTakenPlate);
                newCommertialSubscription.setCarType(carType);
                newCommertialSubscription.getInput();
                newCommertialSubscription.calcMonthlyFee();
                subsArr.add(newCommertialSubscription);
                System.out.println("\n" + userTakenPlate + "has been added!\n");

            } else {
                SubscribePrivateCar newPrivateSubscription = new SubscribePrivateCar();
                newPrivateSubscription.setCarPlate(userTakenPlate);
                newPrivateSubscription.setCarType(carType);
                newPrivateSubscription.getInput();
                newPrivateSubscription.calcMonthlyFee();
                subsArr.add(newPrivateSubscription);
                System.out.println("\n" + userTakenPlate + "has been added!\n");
            }
        }

    }

    public static boolean removeSubscription(String removePlate) {
        for (int i = 0; i < subsArr.size(); i++) {
            MonthlySubscription get = subsArr.get(i);
            if (get.getCarPlate().equalsIgnoreCase(removePlate)) {
                subsArr.remove(i);
                return true;
            }
        }

        return false;
    }

    public static boolean checkInsidePlate(String chPlate) {
        for (int i = 0; i < insideCarsArr.size(); i++) {
            CarsInGarage.ParkedInGarage get = insideCarsArr.get(i);
            if (get.getCarPlateInside().equalsIgnoreCase(chPlate)) {
                return true;
            }
        }
        return false;
    }

    public static String searchOneCarFromInside(String plate) {
        String output = "";

        for (int i = 0; i < insideCarsArr.size(); i++) {
            CarsInGarage.ParkedInGarage get = insideCarsArr.get(i);
            if (get.getCarPlateInside().equalsIgnoreCase(plate)) {
                output += get.toString();
                return "\n"+ output+"\n";
            }
        }
        return "Car is not in garage now!\n";
    }

    public static String showAllCarsInside() {
        String output = "";

        for (int i = 0; i < insideCarsArr.size(); i++) {
            CarsInGarage.ParkedInGarage get = insideCarsArr.get(i);
            output += get.toString() + "\n";
        }
        return output;
    }

    public static void addParkedCar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the New Entering Car's Plate(i.e 45HK467):");
        String enteringCarPlate = input.next();

        if (checkInsidePlate(enteringCarPlate)) {
            System.out.println("\nCar seems like it is already inside of the garade!Camera may not be recognizing you! Please go back and get closer again or enter plate by keybord!\n");
        } else {

            String typeOfEnteredCar = "WeWillCheckInSubscribtions";

            for (int i = 0; i < subsArr.size(); i++) {
                MonthlySubscription get = subsArr.get(i);
                if (enteringCarPlate.equalsIgnoreCase(get.getCarPlate())) {  // if car plate is found in subscriptions, type will be updated automatically and fee will be also.
                    typeOfEnteredCar = get.getCarType();
                    if (typeOfEnteredCar.equalsIgnoreCase("commertial")) {

                        CarsInGarage.DailyCommercialCharge newDailyCommertial = new DailyCommercialCharge();
                        newDailyCommertial.setCarPlateInside(enteringCarPlate);
                        newDailyCommertial.setCarTypeInside(typeOfEnteredCar);
                        newDailyCommertial.getInput();
                        insideCarsArr.add(newDailyCommertial);

                    } else {
                        CarsInGarage.DailyPrivateCharge newDailyPrivate = new DailyPrivateCharge();
                        newDailyPrivate.setCarPlateInside(enteringCarPlate);
                        newDailyPrivate.setCarTypeInside(typeOfEnteredCar);
                        newDailyPrivate.getInput();
                        insideCarsArr.add(newDailyPrivate);
                    }
                }
            }

            if (typeOfEnteredCar.equalsIgnoreCase("WeWillCheckInSubscribtions")) {
                System.out.println("It seems that do not have any subscriptions! So, please enter your car type in order to be charged accordingly!\n");
                typeOfEnteredCar = input.next();
                if (typeOfEnteredCar.equalsIgnoreCase("commertial")) {
                    CarsInGarage.DailyCommercialCharge newDailyCommertial = new DailyCommercialCharge();
                    newDailyCommertial.setCarPlateInside(enteringCarPlate);
                    newDailyCommertial.setCarTypeInside(typeOfEnteredCar);
                    newDailyCommertial.getInput();
                    newDailyCommertial.calcCharge();
                    insideCarsArr.add(newDailyCommertial);
                } else {
                    CarsInGarage.DailyPrivateCharge newDailyPrivate = new DailyPrivateCharge();
                    newDailyPrivate.setCarPlateInside(enteringCarPlate);
                    newDailyPrivate.setCarTypeInside(typeOfEnteredCar);
                    newDailyPrivate.getInput();
                    newDailyPrivate.calcCharge();
                    insideCarsArr.add(newDailyPrivate);
                }
            } 
        }
    }

    public static boolean removeParkedCar(String removeCarFromInside) {
        Scanner priceCalculate = new Scanner(System.in);
        double hoursSpentInside;
        for (int i = 0; i < insideCarsArr.size(); i++) {
            ParkedInGarage get = insideCarsArr.get(i);
            if (checkInsidePlate(removeCarFromInside)) {
                System.out.println("Please enter hours the car was inside?");
                hoursSpentInside=priceCalculate.nextDouble();
                double getStaringPrice=get.getStartChargeInside();
                double youNeedToPay = getStaringPrice*hoursSpentInside;
                System.out.println("Please pay" +youNeedToPay + "and then you can leave the garage!\n\nThank you for choosing us!! See you...\n\n" );
                insideCarsArr.remove(i);
                return true;
            }
        }
        return false;
    }

}






