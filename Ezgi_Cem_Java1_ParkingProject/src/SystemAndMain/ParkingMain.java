/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import java.util.Scanner;

/**
 *
 * @author CemArslan
 */
public class ParkingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What you ant to do 'EnterParking' or 'CreatingNewSubscribtion' ,or 'exit' for closing?");
        String whatDo = sc.next();

        while(!whatDo.equalsIgnoreCase("exit")){
            if (whatDo.equalsIgnoreCase("creatingnewsubscribtion")) {

                System.out.println("Please enter how many new Subscriptions would you like to add : ");
                int cnt = sc.nextInt();

                for (int i = 0; i < cnt; i++) {
                    SystemGeneral.addSubs();
                }

                System.out.println("Please enter a PLATE to search in subscriptions (i.e 35YB671):");
                String seachPlate = sc.next();

                String searchedCar = SystemGeneral.searchOneCarFromSubs(seachPlate);
                System.out.println("\nHere below information about the car you want to see is shown:\n\n" + searchedCar);

                System.out.println("Do you want to see all Subscribtions?(yes/no)");
                String see = sc.next();
                if (see.equalsIgnoreCase("yes")) {
                    System.out.println("\n\n\nAll Subscriptions are shown below:\n");
                    System.out.println(SystemGeneral.showAllSubs());
                }

                System.out.println("\nPlease enter the plate you want to Remove (i.e 56YB871): ");
                String removePlate = sc.next();

                boolean removeResult = SystemGeneral.removeSubscription(removePlate);
                if (removeResult) {
                    System.out.println("\n" + removePlate + "'s Subscription has been cancelled succesfully!\n");
                } else {
                    System.out.println("There is no plate like this in the list!");
                }

                // TODO code application logic here
            } else {
                System.out.println("\n\nEnter parking will be done like above subscription adding process.\n\n");

                System.out.println("What do you want to do (type 'exit' for closing the program) or  Type your choice (SearchCarInside/EnterToGarage/ExitFromGarage/DisplayAllInsideCars)?");
                Scanner parkingAffairs = new Scanner(System.in);
                String affairType = parkingAffairs.next();
                while (!affairType.equalsIgnoreCase("exit")) {
                    if (affairType.equalsIgnoreCase("SearchCarInside")) {
                        System.out.println("Enter car plate from inside to search? (i.e 34GE356)");
                        String splate = parkingAffairs.next();
                        System.out.println(SystemGeneral.searchOneCarFromInside(splate));

                    } else if (affairType.equalsIgnoreCase("EnterToGarage")) {
                        SystemGeneral.addParkedCar();

                    } else if (affairType.equalsIgnoreCase("ExitFromGarage")) {
                        System.out.println("Enter your plate to exit from the garage(i.e 45adf56):");
                        String remPlate = parkingAffairs.next();
                        boolean removed = SystemGeneral.removeParkedCar(remPlate);

                        if (!removed) {
                            System.out.println("There is no car with this plate in the garage!");
                        }

                    } else {
                        SystemGeneral.showAllCarsInside();

                    }
                }
                System.out.println("You closed the kamera!See you later!");

            }
            System.out.println("What you ant to do 'EnterParking' or 'CreatingNewSubscribtion' ,or 'exit' for closing?");
            whatDo = sc.next();
        }
        System.out.println("\nProgram is closing bb\n");

    }

}












